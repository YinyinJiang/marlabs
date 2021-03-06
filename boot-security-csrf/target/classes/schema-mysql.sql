 DROP TABLE IF EXISTS employee;
 DROP TABLE IF EXISTS users;
 DROP TABLE IF EXISTS authorities;

create table employee (
 	empId VARCHAR(10) NOT NULL,
 	empName VARCHAR(100) NOT NULL
);
create table users (
	username varchar(50) not null primary key,
 	password varchar(120) not null,
 	enabled boolean not null
);
create table authorities (
	username varchar(50) not null,
	authority varchar(50) not null
);
insert into users (username, password, enabled) values ('admin', '$2a$10$JJgzplx1phbZ4..gaxPveeUi0S1fxB1VpjjnVREnfPMp2wvr8u4g.', true);
insert into authorities (username, authority) values ('admin', 'ROLE_ADMIN');
insert into users(username, password, enabled) values ('employee', '$2a$10$ZDwU6s36W2TKhT09doc/TekXictJ9rL2wP2bWjbLo4V/gUYxtbzFy', true);
insert into authorities (username, authority) values('admin', 'ROLE_USER');
insert into authorities (username, authority) values ('employee', 'ROLE_USER');