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

-- Chèn sữ liệu 
insert into Class(className, startDate, status)
values ('A1', '2008-12-20', 1),
       ('A2', '200-1-22', 1),
       ('B3', current_date, 0);
select *
from Class;

insert into Student(studentName, Address, Phone, Status, ClassID)
values ('Hùng', 'Hà Nội', '0912113113', 1, 1),
       ('Hoa', 'Hải Phòng', null, 1, 1),
       ('Manh', 'HCM', '0123123123', 0, 2);
select *
from Student;

insert into Subject(subName, credit, status)
values ('CF', 5, 1),
       ('C', 6, 1),
       ('HDJ', 5, 1),
       ('RDBMS', 10, 1);
select *
from Subject;

insert into Mark(subID, studentID, mark, examTimes)
values (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);
select *
from Mark;

-- Hiển thị danh sách tất cả các học viên
select *
from Student;

-- Hiển thị danh sách các học viên đang theo học.
select *
from Student
where status = true;

-- Hiển thị danh sách các học viên đang theo học.
select *
from Subject
where credit < 10;

-- Hiển thị danh sách các học viên đang theo học.
select *
from Class
         join Student on Class.classID = Student.ClassID
where className like '%A1%';

-- Hiển thị điểm môn CF của các học viên.
select *
from Student
         join Mark on Student.studentID = Mark.studentID
         join Subject on Mark.subID = Subject.subID
where subName like '%CF%';
