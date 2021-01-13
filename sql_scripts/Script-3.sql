-- Script for tradestars database schema

drop schema if exists tradestars cascade;
create schema tradestars;
set schema 'tradestars';
SELECT * FROM tradestars.users

set schema 'trading';
insert into user_roles(user_role_id, user_role)
		values(1,'Customer');
	
	insert into user_roles(user_role_id, user_role)
		values(2,'Tradesman');


set schema 'public';

set schema 'trading';
insert into users(username, "password", first_name , last_name , email, role_id)
		values('harsh', '12345', 'deep', 'singh','deep@gmail.com', 2);
insert into users(username, "password", first_name , last_name , email, role_id)
		values('rammi', '12345', 'rammi', 'singh','rammi@gmail.com', 1);

set schema 'tradestars';

set schema 'trading';
insert  into service_types(service_type) values('Pest Control');
	
create table service_types(
	service_type_id serial primary key,
	service_type text not null
);

set schema 'trading';

insert into companies(company_name, company_type, company_owner) 
			values('NextReno', 'renovation', 1)


create table companies(
	company_id serial primary key,
	company_name text not null,
	company_type text not null,
	company_owner int not null references users(user_id)
);

create table services(
	service_id serial primary key,
	service_type int not null references service_types(service_type_id),
	service_price numeric(10,2),
	provided_by int not null references companies(company_id)
);

create table appointments (
	appointment_id serial primary key,
	customer_id int not null references users(user_id),
	company_id int not null references companies(company_id),
	appointment_start timestamp not null,
	appointment_end timestamp not null,
	appointment_confirmed boolean not null,
	for_service int not null references services(service_id),
	appointment_completed boolean not null
);

create table reviews (
	review_id serial primary key,
	review_text text,
	reviewed_by int not null references users(user_id),
	reviewed_for int not null references companies(company_id)
);



create table users(
	user_id serial unique not null primary key,
	username text unique not null,
	"password" text not null,
	first_name text not null,
	last_name text not null,
	email text unique not null,
	role_id int not null references user_roles(user_role_id)
);

create table user_roles(
	user_role_id serial unique not null primary key,
	user_role varchar(10) not null
);



