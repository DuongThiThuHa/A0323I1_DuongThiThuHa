create database quanlysinhvien;
use quanlysinhvien;

create table quanlysinhvien.class(
classID int not null auto_increment primary key,
className varchar(60) not null,
startDate datetime not null,
status bit 
);

create table quanlysinhvien.student(
studentID int not null auto_increment primary key,
studentName varchar(30) not null,
address varchar(50) ,
phone varchar(20),
status bit,
classID int not null
);

create table quanlysinhvien.subjects(
subID int not null auto_increment primary key,
subName varchar(30) not null,
creadit tinyint not null default 1 check ( creadit >= 1),
status bit default 1
);

create table quanlysinhvien.mark(
markID int not null auto_increment primary key,
subID int not null ,
studentID int not null ,
unique(subID , studentID ),
mark float default 0 check (mark between 0 and 100),
examTimes tinyint default 1
);