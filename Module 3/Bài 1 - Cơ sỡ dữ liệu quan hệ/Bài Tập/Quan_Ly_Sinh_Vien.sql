create
database quan_ly_sinh_vien;
use
quan_ly_sinh_vien;

create table Student
(
    id      int not null primary key,
    name    varchar(50),
    age     int,
    country varchar(50)
);

create table Class
(
    id   int not null primary key,
    name varchar(50)
);

create table Teacher
(
    id      int not null primary key,
    name    varchar(50),
    age     int,
    country varchar(50)
);
