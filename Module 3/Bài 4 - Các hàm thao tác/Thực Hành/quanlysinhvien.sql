use quanlysinhvien;

-- Hiển thị số lượng sinh viên ở từng nơi
select Address, count(StudentID) as so_luong_sv
from student group by Address;

--  Tính điểm trung bình các môn học của mỗi học viên
select student.StudentID, student.StudentName, avg(mark) from student
join mark on student.StudentID = mark.StudentID
group by StudentID , StudentName;

-- Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 15
select student.StudentID, student.StudentName, avg(mark) from student
join mark on student.StudentID = mark.StudentID 
group by StudentID , StudentName having avg(mark) > 15 ;

--  Hiển thị thông tin các học viên có điểm trung bình lớn nhất.
select student.StudentID, student.StudentName, avg(mark) from student
join mark on student.StudentID = mark.StudentID 
group by StudentID , StudentName having avg(mark) >= all (select avg(mark) from mark group by mark.StudentID);