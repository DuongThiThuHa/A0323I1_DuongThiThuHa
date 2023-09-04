create database chi_muc;
use chi_muc;

-- Tạo index
select * from customers where customerName = 'Land of Toys Inc.'; 
explain select * from customers where customerName = 'Land of Toys Inc.'; 

-- Thêm index 
alter table customers add index idx_customerName(customerName);
explain select * from customers where customerName = 'Land of Toys Inc.'; 
alter table customers add index idx_full_name(contactFirstName, contactLastName);
explain select * from customers where contactFirstName = 'Jean' or contactFirstName = 'King';

-- Xóa index
alter table customers drop index idx_full_name;