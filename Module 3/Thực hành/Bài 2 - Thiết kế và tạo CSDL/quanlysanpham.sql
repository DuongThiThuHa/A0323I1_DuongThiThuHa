create database quanlydonhang;
use quanlydonhang;

create table quanlydonhang.donviDH(
ma_dh int(15),
ten varchar(45),
diachi varchar(45),
dienthoai varchar(10)
);

create table quanlydonhang.donviKH(
ma_kh int,
ten varchar(35),
diachi varchar(50)
);

create table quanlydonhang.hang(
ma int ,
ten varchar(45),
donvitinh int,
mota varchar(45)
);

create table quanlydonhang.nguoidat(
ma_nd int,
hoten varchar(45)
);

create table quanlydonhang.noigiao(
ma int,
diachi varchar(45)
);

create table quanlydonhang.nguoinhan(
ma_nn int,
hoten varchar(40)
);

create table quanlydonhang.nguoigiao(
ma_ng int,
hoten varchar(40)
);

