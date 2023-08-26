use quanlysinhvien;

select * from quanlysinhvien.student;

select * from quanlysinhvien.student where status = true;

select * from quanlysinhvien.subjects where creadit < 10;

select quanlysinhvien.student.studentID , quanlysinhvien.student.studentName , quanlysinhvien.student.classID from quanlysinhvien.student join quanlysinhvien.class on quanlysinhvien.student.classID = quanlysinhvien.class.classID;

select quanlysinhvien.student.studentID , quanlysinhvien.student.studentName , quanlysinhvien.student.classID from quanlysinhvien.student join quanlysinhvien.class on quanlysinhvien.student.classID = quanlysinhvien.class.classID where quanlysinhvien.class.className = 'A1';

select quanlysinhvien.student.studentID, quanlysinhvien.student.studentName, quanlysinhvien.mark.mark from quanlysinhvien.student join quanlysinhvien.mark on quanlysinhvien.student.studentID = quanlysinhvien.mark.studentID join quanlysinhvien.subjects on quanlysinhvien.mark.subID = quanlysinhvien.subjects.subID;

select quanlysinhvien.student.studentID, quanlysinhvien.student.studentName, quanlysinhvien.subjects.subName,quanlysinhvien.mark.mark from quanlysinhvien.student join quanlysinhvien.mark on quanlysinhvien.student.studentID = quanlysinhvien.mark.studentID join quanlysinhvien.subjects on quanlysinhvien.mark.subID = quanlysinhvien.subjects.subID;