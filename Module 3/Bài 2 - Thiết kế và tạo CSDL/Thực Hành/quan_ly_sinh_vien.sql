create
database quan_ly_sinh_vien;
use
quan_ly_sinh_vien;

create table Class
(
    classID   int not null auto_increment primary key,
    className varchar(45),
    startDate date,
    status    bit
);

create table Student
(
    studentID   int not null auto_increment primary key,
    studentName varchar(45),
    address     varchar(45),
    phone       varchar(12),
    status      bit,
    classID     int,
    foreign key (classID) references Class (classID)
);

create table Subject
(
    subID   int     not null auto_increment primary key,
    subName varchar(45),
    credit  tinyint not null default 1 check (credit >= 1),
    status  bit              default 1
);

create table Mark
(
    markID    int not null auto_increment primary key,
    subID     int not null,
    studentID int not null,
    unique key (subID,studentID),
    mark      float   default 0 check (mark between 0 and 100),
    examTimes tinyint default 1
);