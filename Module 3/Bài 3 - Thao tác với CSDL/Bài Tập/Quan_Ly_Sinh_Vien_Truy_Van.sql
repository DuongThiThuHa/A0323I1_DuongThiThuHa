create
database quan_ly_sinh_vien_truy_van;
use
quan_ly_sinh_vien_truy_van;

create table class
(
    ClassID   int not null primary key,
    ClassName varchar(50),
    StartDate date,
    Status    bit
);

insert into class
values (1, 'A1', '2008-12-20', 1),
       (2, 'A2', '2008-12-22', 1),
       (3, 'B3', current_date, 0);

create table student
(
    StudentID   int not null primary key,
    StudentName varchar(50),
    Address     varchar(50),
    Phone       varchar(20),
    Status      bit,
    ClassID     int,
    foreign key (ClassID) references class (ClassID)
);

insert into student (StudentName, Address, Phone, Status, ClassId)
values ('Hung', 'Ha Noi', '0912113113', 1, 1),
       ('Hoa', 'Hai phong', 1, 1),
       ('Manh', 'HCM', '0123123123', 0, 2);

create table subject
(
    SubID   int         not null primary key,
    SubName varchar(30) not null,
    Credit  tinyint     not null default 1 check ( Credit >= 1 ),
    Status  bit                  default 1
);

insert into Subject
values (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);

create table mark
(
    MarkID    int not null primary key,
    SubID     int not null,
    StudentID int not null,
    Mark      float   default 0 check ( Mark between 0 and 100),
    ExamTimes tinyint default 1,
    UNIQUE (SubID, StudentID),
    foreign key (SubID) references Subject (SubID),
    foreign key (StudentID) references Student (StudentID)
);

insert into mark (MarkID, StudentID, Mark, ExamTimes)
values (1, 1, 1, 8, 1),
       (2, 1, 2, 10, 2),
       (3, 2, 1, 12, 1);

select *
from Student
where StudentName like 'H%';

select *
from Class
where month (StartDate) = 12;

select *
from Subject
where Credit between 3 and 5;

update Student
set ClassID = 2
where StudentName = 'Hung';

select student.StudentName as 'Student Name', subject.SubName as 'Subject Name', mark.Mark
from Mark mark
         join Student student on student.StudentID = mark.StudentID
         join Subject subject on subject.SubID = mark.SubID
order by mark.Mark desc, student.StudentName asc;