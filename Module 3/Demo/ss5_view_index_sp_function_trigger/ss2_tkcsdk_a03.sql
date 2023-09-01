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
 
 insert into class (name) values ('c1121g1'), ('c1221g1'),('a0821i1'),('a0921i1');
insert into room(name,class_id) values ('Ken',1), ('Jame',1),('Ada',2),('Andy',2);

insert into jame(`username`,`password`)
 values('cunn','12345'),('chunglh','12345'),('hoanhh','12345'),('dungd','12345'),('huynhtd','12345'),
 ('hainm','12345'),('namtv','12345'),('hieuvm','12345'),('kynx','12345'),('vulm','12345');

insert into jame(`username`,`password`)
 values('chau','12345');
 
insert into instructor(`name`,birthday, salary)
 values('tran van chanh','1985-02-03',100),('tran minh chien','1985-02-03',200),('vu thanh tien','1985-02-03',300);
insert into instructor(`name`,birthday, salary)
 values('tran van nam','1989-12-12',100);


 
 insert into student(`name`,birthday, gender,`point`, class_id,`username`) 
 values ('nguyen ngoc cu','1981-12-12',1,8,1,'cunn'),('le hai chung','1981-12-12',1,5,1,'chunglh'),
 ('hoang huu hoan','1990-12-12',1,6,2,'hoanhh'),('dau dung','1987-12-12',1,8,1,'dungd'),
 ('ta dinh huynh','1981-12-12',1,7,2,'huynhtd'),('nguyen minh hai','1987-12-12',1,9,1,'hainm'),
 ('tran van nam','1989-12-12',1,4,2,'namtv'),('vo minh hieu','1981-12-12',1,3,1,'hieuvm'),
 ('le xuan ky','1981-12-12',1,7,2,'kynx'),('le minh vu','1981-12-12',1,7,1,'vulm');

  insert into student(`name`,birthday, gender,`point`, class_id) 
 values ('nguyen van a','1981-12-12',1,8,null),('tran van b','1981-12-12',1,5,null);
 
--   insert into student(`name`,birthday, gender,`point`, class_id,`username`) 
--  values ('nguyen minh hai chau','1981-12-12',1,8,null,'chau');
 
 insert into instructor_class(class_id,instructor_id) values (1,1),(1,2),(2,1),(2,2),(3,1),(3,2);

select * from room;
select* from class;
select* from student;
select* from jame;
select* from instructor;
select * from instructor_class;

-- ss3 thao tác với csdl

-- 1. Lấy ra thông tin các học viên, và cho biết các học viên đang theo học lớp nào.
select s.*,c.name as class_name
from student s 
join class c on s.class_id = c.id;
  
-- 2. Lấy ra thông tin các học viên, và cho biết các học viên đang theo học lớp nào 
-- và cả các bạn đã đăng ký nhưng chưa có lớp học.
select s.*, ifnull(c.name,'chưa có lớp') as class_name
from student s 
left join class c on s.class_id = c.id;

-- join 3 bảng lấy thêm thông tin password
select s.*,j.password, ifnull(c.name,'chưa có lớp') as class_name
from student s 
left join class c on s.class_id = c.id
join jame j on s.username = j.username;

-- 3. Lấy ra học viên có họ là “nguyen”
 select * from student where  name like 'nguyen %';

-- 4. Lấy thông tin của các học viên tên 'nguyen minh hai'.

-- 5. Lấy thông tin của các học viên tên 'hai' hoặc 'huynh’.
select * from student where name like '% hai' or name like '% huynh';

-- RegexP : tìm hiểu thêm( lấy ra học vien có Tên bắt đầu Bằng chữ H
select * from student where name regexp('\\sH\\w*$');

-- 6. Lấy ra các học viên có điểm lớn hơn 5 .
select * from student where point>5;

-- 7. lấy ra thông tin các học viên có điểm 4,6,8
select * from student where point in(4,6,8);

-- đếm số lương học viên của trung tâm
select count(id) as so_luong from student;

-- lấy ra các loại điểm duy nhất
select distinct(point) from student;
select point from student group by point;
-- 8. Thông kế số lượng học sinh theo từng loại điểm.
select point, count(id) as so_luong from student group by point;

-- 9 . Thông kế số lượng học sinh theo điểm và điểm phải lớn hơn 5
select point, count(id) as so_luong from student where point >5 group by point;
-- 10. Thông kế số lượng học sinh theo điểm lớn hơn 5 và chỉ hiện thị với số lượng>=2
select point, count(id) as so_luong 
from student where point >5 
group by point
having so_luong>=2;


-- test having
select * from student
having point>5;

select * from student
where point>5;

-- 11. Lấy ra danh sách học viên của lớp c1121g1 và sắp xếp  học viên theo point giảm dần,
-- nếu point bằng nhau thì sắp xếp theo tên tăng dần.
select s.*,c.name as class_name
from student s 
join class c on s.class_id = c.id
where c.name ='c1121g1'
order by s.point desc,s.name asc;



-- bài 4: sử dụng các hàm thông dụng
-- 1.1	Hiện thị danh sách các lớp có học viên theo học và số lượng học viên của mỗi lớp và tên phòng học của từng lớp
select c.name as class_name, count(s.id) as so_luong from
student s join class c 
on s.class_id = c.id
group by c.id;
 -- 1.1	Hiện thị danh sách các lớp tên phòng học của từng lớp
 select c.name as class_name, group_concat(r.name)
 from class c 
 join room r
 on c.id= r.class_id
 group by c.id;

select * from student;
-- 1.2.	 Tính điểm lớn nhất của mỗi các lớp
select c.name as class_name, max(s.point) as max_point from
student s join class c 
on s.class_id = c.id
group by c.id;

-- 1.3	 Tình điểm trung bình  của từng lớp
select c.name as class_name, avg(s.point) as avg_point from
student s join class c 
on s.class_id = c.id
group by c.id;

-- 2 Lấy ra toàn bộ tên và ngày sinh các instructor và student ở CodeGym.
select s.name, s.birthday
from student s
union
select i.name,i.birthday
from instructor i;
-- sử dụng union để thực ý tưởng full join
select s.name, c.name as class_name 
from student s 
left join class c 
on s.class_id = c.id
union
select s.name, c.name as class_name 
from student s 
right join class c 
on s.class_id = c.id;

-- 4 Lấy ra top 3 học viên có điểm cao nhất của trung tâm.
select * from student order by point desc limit 3;

-- 3 record tiếp the0
select * from student order by point desc limit 3,3;

select * from student;

-- 5. Lấy ra các học viên có điểm số là cao nhất của trung tâm.

select * from student where point =(select max(point) from student);
;
-- 6 lấy ra tất cả các giảng viên chưa từng tham gia giảng dạy
-- Câu truy vấn con
select * from instructor
 where id not in (
				select ic.instructor_id 
                from instructor_class ic
                group by ic.instructor_id
                );
-- join bảng

select *
from instructor i
left join instructor_class ic
on i.id=ic.instructor_id
where ic.instructor_id is null;



-- bài 5
select * from customers;
explain select count(*) from customers where city = 'lyon';
select count(*) from customers;

-- tạo index cho bảng customer
create index i_city on customers(city);
alter table customers add index i_country(country);

-- xoá
drop index i_city on customers;
alter table customers drop index i_country;

-- view
create view w_student as
select s.id, s.name, c.name as class_name from student s
join class c on s.class_id = c.id;

select * from w_student;
drop view w_student;
  -- sp
  -- tạo 1 sp không có tham số ( lấy toàn bộ thông tin của học viên)
   delimiter //
   create procedure get_all_student()
   begin
   select s.id, s.name, c.name as class_name from student s
   join class c on s.class_id = c.id;
   end //
   delimiter ;
   
  -- sử dụng sp
 call get_all_student();
  -- sp có 1 tham số kiểu IN. tạo sp trả hiện thi thông tin sv theo id;
  
 delimiter //
   create procedure find_student_by_id(IN p_id int)
   begin
   select s.id, s.name, c.name as class_name from student s
   join class c on s.class_id = c.id
   where s.id = p_id;
   end //
   delimiter ;
  call find_student_by_id(2);
  
  -- tạo một function kiểm tra điểm
  
  select s.id, s.name, c.name as class_name,s.point from student s
   join class c on s.class_id = c.id

 delimiter //
 create function check_point(p_point int)
 returns varchar(10)
 deterministic
 begin
 declare result varchar(10);
 if p_point>=6 then
 set result = 'pass';
 else 
 set result ='fail';
 end if;
 return result;
 end //
 delimiter ;

select check_point(5);



select s.name, s.point, check_point(s.point) as pass_fail from student s;

-- 5 tạo trigger tự động lưu lại lịch sử thay đổi điểm của sinh viên
 select * from student;
 select * from jame;

-- tạo bảng để ghi log
create table `history`(
id int auto_increment primary key,
name varchar(50),
old_point int,
new_point int,
update_day date
);
-- tạo trigger
DELIMITER //
CREATE TRIGGER tr_history 
AFTER UPDATE ON student
FOR EACH ROW
BEGIN
insert into `history`(`name`, old_point, new_point, update_day) 
values ( old.`name`, old.`point`,new.`point`,now());
END //
DELIMITER ;

select * from history;
select * from student;

















