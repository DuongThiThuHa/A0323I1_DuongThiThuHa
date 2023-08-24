create database quanlybanhang;
use quanlybanhang;

create table quanlybanhang.customer(
    cid int auto_increment primary key,
    cname varchar(25) not null,
    cage int
);

create table quanlybanhang.order(
    oid  int auto_increment primary key,
    idcustomer int,
    odate  date,
    ototalprice float,
    foreign key (idcustomer) references quanlybanhang.customer(cid)
);

create table quanlybanhang.product(
    pid int auto_increment primary key,
    pname  varchar(50),
    pprice float
);

create table quanlybanhang.orderDetail(
    idorder int,
    idproduct int,
    odqty smallint,
    primary key(idorder, idproduct),
    foreign key (idorder)  references quanlybanhang.order(oid),
    foreign key (idproduct) references quanlybanhang.product(pid)
);

