create database quan_ly_ban_hang;
use quan_ly_ban_hang;

create table customer(
cID int auto_increment primary key,
cName varchar(45),
cAge int
);

create table orders(
oID int auto_increment primary key,
cID int,
oDate date,
oTotalPrice double
);

create table product(
pID int auto_increment primary key,
pName varchar(45),
pPrice double
);

create table orderDetail(
oID int,
pID int,
odQTY int,
foreign key (oID) references orders(oID),
foreign key (pID) references product(pID)
);

insert into customer(cName,cAge)  values 
('Minh Quan',10),
('Ngoc Oanh',20),
('Hong Ha',50);
select * from customer;

insert into orders(cID,oDate,oTotalPrice) values 
(1,'2006/3/21',null),
(2,'2006/3/23',null),
(1,'2006/3/16',null);
select * from orders;

insert into product(pName,pPrice) values 
('May Giat',3),
('Tu Lanh',5),
('Dieu Hoa',7),
('Quat',1),
('Bep Dien',2);
select * from product;

insert into orderDetail values
(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);
select * from orderDetail;

-- Hiển thị các thông tin gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select oID, oDate, oTotalPrice from orders ;

-- Hiển thị danh sách các khách hàng đã mua hàng và danh sách sản phẩm được mua bởi các khách
select cName, pName
from orders 
join customer on orders.oID = customer.cID
join orderDetail on orders.oID = orderDetail.oID
join product on orders.oID = product.pID ;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
select cName from customer where cID not in(select cID from orders);

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn
-- (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn.Giá bán của từng loại được tính = odQTY*pPrice)
select orders.oID as ma_hoa_don , oDate as ngay_ban , sum(odQTY*pPrice) as gia_ban
from orders 
join product on orders.oID = product.pID
join orderDetail on orders.oID = orderDetail.oID
group by orders.oID;
