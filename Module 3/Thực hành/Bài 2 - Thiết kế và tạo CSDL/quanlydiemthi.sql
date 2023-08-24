create database quanlydiemthi;
use quanlydiemthi;

create table quanlydiemthi.HocSinh(
MaHS varchar(20) primary key,
TenHS varchar(50),
NgaySinh date,
Lop varchar(20),
GT boolean
);

create table quanlydiemthi.MonHoc(
MaMH varchar(20) primary key,
TenMH varchar(50)
);

create table quanlydiemthi.BangDiem(
MaHS varchar(20),
MaMH varchar(20),
DiemThi float,
NgayKT date,
primary key(MaHS, MaMH),
foreign key (MaHS) references HocSinh(MaHS),
foreign key (MaMH) references MonHoc(MaMH)
);

create table quanlydiemthi.GiaoVien(
MaGV varchar(20) primary key,
TenGV varchar(50),
SDT varchar(10)
);

alter table MonHoc add MaGV varchar(20);
alter table MonHoc add constraint FK_MaGV foreign key(MaGV) references GiaoVien(maGV);