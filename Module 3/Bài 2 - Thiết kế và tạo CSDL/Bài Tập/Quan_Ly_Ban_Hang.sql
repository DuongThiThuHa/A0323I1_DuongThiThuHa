create database quan_ly_ban_hang;
use quan_ly_ban_hang;

create table customer(
cID int not null primary key,
cName varchar(50),
cAge int
);

create table orders(
oID int not null primary key,
cID int,
oDate date,
oTotalPrice int,
foreign key (cID) references customer(cID)
);

create table product(
pID int not null primary key,
pName varchar(50),
pPrice int
);

create table ordersDetail(
oID int,
pID int,
odQTY int,
primary key (oID,pID)
);