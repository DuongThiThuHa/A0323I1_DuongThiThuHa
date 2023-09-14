create
database QuanLySinhVien;
use
QuanLySinhVien;

-- Bảng Class:
create table Class
(
    ClassID   int auto_increment primary key,
    ClassName varchar(60) not null,
    StartName date        not null,
    Status    bit
);

-- Bảng Student:
create table Student
(
    StudentID   int auto_increment primary key,
    StudentName varchar(30) not null,
    Address     varchar(50),
    Phone       varchar(20),
    Status      bit,
    ClassID     int,
    foreign key (ClassID) references Class (ClassID)
);

-- Bảng Subject :
create table Subject
(
    SubID   int         not null auto_increment primary key,
    SubName varchar(30) not null,
    Credit  tinyint     not null default 1 check (credit >= 1),
    Status  bit                  default 1
);

--  Bảng Mark
create table Mark
(
    MarkID    int not null auto_increment primary key,
    SubID     int not null,
    StudentID int not null,
    unique (SubID, StudentID),
    Mark      float   default 0 check ( mark between 0 and 100),
    ExamTimes tinyint default 1
);

