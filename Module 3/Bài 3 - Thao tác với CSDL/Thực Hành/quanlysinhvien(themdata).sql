use quanlysinhvien;

insert into quanlysinhvien.subjects values (1, 'CF', 5, 1);
insert into quanlysinhvien.subjects values (2, 'C', 6, 1);
insert into quanlysinhvien.subjects values (3, 'HDJ', 5, 1);
insert into quanlysinhvien.subjects values (4, 'RDBMS', 10, 1);

insert into quanlysinhvien.mark (subID,studentID,mark,examTimes) values(11, 1, 8.0, 1);
insert into quanlysinhvien.mark (subID,studentID,mark,examTimes) values(22, 2, 10.0, 2);
insert into quanlysinhvien.mark (subID,studentID,mark,examTimes) values(33, 1, 12.0, 1);

select * from quanlysinhvien.mark;

