create database if not exists a0323i1;
use a0323i1;

create table jame(
username varchar(50) primary key,
password varchar(50)
);
create table class(
 id int primary key auto_increment,
 name varchar(50)
);

create table room(
 id int primary key auto_increment,
 name varchar(50),
 class_id int,
 foreign key(class_id) references class(id)
 );
 
 create table student(
  id int primary key auto_increment,
  name varchar(50),
  birthday date,
  gender boolean,
  email varchar(50),
  point float,
  username varchar(50),
  class_id int,
  foreign key(username) references jame(username),
  foreign key(class_id) references class(id)
 );
  create table instructor(
  id int primary key auto_increment,
  name varchar(50),
  birthday date,
  salary float
  );
 create table instructor_class(
 instructor_id int,
 class_id int,
 start_date date,
 end_date date,
 primary key(instructor_id,class_id),
 foreign key(instructor_id) references instructor(id),
 foreign key(class_id) references class(id)
 );
 