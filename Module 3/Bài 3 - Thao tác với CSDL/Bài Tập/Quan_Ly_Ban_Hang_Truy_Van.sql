use
quan_ly_ban_hang;

insert into customer (cID, cName, cAge)
values (1, 'Minh Quan', 10),
       (2, 'Ngoc Oanh', 20),
       (3, 'Hong Ha', 20);

insert into orders (oID, cID, oDate, oTotalPrice)
values (1, 1, '2006-3-21', null),
       (2, 2, '2006-3-23', null),
       (3, 1, '2006-3-16', null);

insert into product (pID, pName, pPrice)
values (1, 'May giat', 3),
       (2, 'Tu lanh', 5),
       (3, 'Dieu hoa', 7),
       (4, 'Quat', 1),
       (5, 'Bep dien', 2);

insert into ordersDetail (oID, pID, odQTY)
values (1, 1, 3),
       (1, 3, 7),
       (1, 4, 2),
       (2, 1, 1),
       (3, 1, 8),
       (2, 5, 4),
       (2, 3, 3);

select cName, pName
from customer c
         join orders o on o.cID = c.cID
         join ordersDetail od on od.oID = o.oID
         join product p on p.pID = od.pID;

select *
from customer
where cName not in (select cName from orders);

select *
from customer c
         left join orders o on o.cID = c.cID
where c.cID is null;

select o.oID,
       p.pID,
       sum(p.pPrice * od.odQTY) as total
from orders o
         join ordersDetail od on od.oId = o.oID
         join product p on p.pID = od.pID;