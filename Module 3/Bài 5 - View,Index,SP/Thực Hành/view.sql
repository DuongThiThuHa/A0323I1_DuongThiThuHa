create database View;
use View;

-- Tạo view
create view customer_view as
select customerNumber, customerName, phone
from customers;

select * from customer_view;

-- Cập nhập view
create or replace view customer_view as
select customerNumber, customerName, contactFirstName, contactLastName, phone
from customers
where city = 'Nantes';

select * from customer_view;

-- Xóa view 
drop view customer_view;