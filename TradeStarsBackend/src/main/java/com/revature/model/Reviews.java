package com.revature.model;


import javax.persistence.*;

@Entity
public class Reviews {

    @Id
    @Column(name = "review_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reviewId;

    @Column(name = "review_text")
    private String reviewText;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Companies reviewedBy;

    @ManyToOne
    @JoinColumn(name = "user_role_id")
    private Users reviewedFor;

	public Reviews() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reviews(int reviewId, String reviewText, Companies reviewedBy, Users reviewedFor) {
		super();
		this.reviewId = reviewId;
		this.reviewText = reviewText;
		this.reviewedBy = reviewedBy;
		this.reviewedFor = reviewedFor;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public Companies getReviewedBy() {
		return reviewedBy;
	}

	public void setReviewedBy(Companies reviewedBy) {
		this.reviewedBy = reviewedBy;
	}

	public Users getReviewedFor() {
		return reviewedFor;
	}

	public void setReviewedFor(Users reviewedFor) {
		this.reviewedFor = reviewedFor;
	}

	@Override
	public String toString() {
		return "Reviews [reviewId=" + reviewId + ", reviewText=" + reviewText + ", reviewedBy=" + reviewedBy
				+ ", reviewedFor=" + reviewedFor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + reviewId;
		result = prime * result + ((reviewText == null) ? 0 : reviewText.hashCode());
		result = prime * result + ((reviewedBy == null) ? 0 : reviewedBy.hashCode());
		result = prime * result + ((reviewedFor == null) ? 0 : reviewedFor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reviews other = (Reviews) obj;
		if (reviewId != other.reviewId)
			return false;
		if (reviewText == null) {
			if (other.reviewText != null)
				return false;
		} else if (!reviewText.equals(other.reviewText))
			return false;
		if (reviewedBy == null) {
			if (other.reviewedBy != null)
				return false;
		} else if (!reviewedBy.equals(other.reviewedBy))
			return false;
		if (reviewedFor == null) {
			if (other.reviewedFor != null)
				return false;
		} else if (!reviewedFor.equals(other.reviewedFor))
			return false;
		return true;
	}
    
    

}
