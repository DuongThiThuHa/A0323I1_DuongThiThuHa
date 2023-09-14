create
database demo_ss5;
use
demo_ss5;

create table products
(
    id                 int auto_increment primary key,
    productName        varchar(45),
    productPrice       int,
    productAmount      int,
    productDescription varchar(45),
    productStatus      varchar(45)
);

insert into products (productName, productPrice, productAmount, productDescription, productStatus)
values ('Điện thoại 1', 11111, 11, 'Tốt', 'Còn Hàng'),
       ('Điện thoại 2', 22222, 11, 'Tốt', 'Còn Hàng'),
       ('Điện thoại 3', 33333, 11, 'Tốt', 'Còn Hàng'),
       ('Điện thoại 4', 44444, 11, 'Tốt', 'Còn Hàng'),
       ('Điện thoại 5', 55555, 11, 'Tốt', 'Còn Hàng'),
       ('Điện thoại 6', 66666, 11, 'Tốt', 'Còn Hàng'),
       ('Điện thoại 7', 77777, 11, 'Tốt', 'Còn Hàng'),
       ('Điện thoại 8', 88888, 11, 'Tốt', 'Còn Hàng'),
       ('Điện thoại 9', 99999, 11, 'Tốt', 'Còn Hàng'),
       ('Điện thoại 10', 101010, 11, 'Tốt', 'Còn Hàng');
select *
from products;

-- Tạo Unique Index trên bảng Products (sử dụng cột productCode để tạo chỉ mục)
create unique index id on products (id);

-- Tạo Composite Index trên bảng Products (sử dụng 2 cột productName và productPrice)
create index productName_productPrice_index on products (productName, productPrice);

-- Sử dụng câu lệnh EXPLAIN để biết được câu lệnh SQL của bạn thực thi như nào
explain
select *
from products
where id = 2412;

-- Tạo view lấy về các thông tin: productCode, productName, productPrice, productStatus từ bảng products.
create view product_view as
select *
from products;
select *
from product_view;

-- Tiến hành sửa đổi view
alter
view product_view as
select *
from products
where id like '1%';

-- Tiến hành xoá view
drop view product_view;

-- Tạo store procedure lấy tất cả thông tin của tất cả các sản phẩm trong bảng product
Delimiter
//
create procedure show_all_product()
begin
select *
from products;
end
//
delimiter ;

call show_all_product;

-- Tạo store procedure thêm một sản phẩm mới
delimiter
//
create procedure add_products()
begin
insert into products(productName, productPrice, productAmount, productDescription,
                     productStatus) value ('Điện Thoại 11 ' , 111111111 , 11 , 'Tốt' , 'Hết Hàng');
end
//
delimiter ;

call add_products;

-- Tạo store procedure sửa thông tin sản phẩm theo id
delimiter
//
create procedure update_products(in update_id int)
begin
update products
set id                 = 1,
    productName        = 'Điện Thoại 12',
    productPrice       = 121212,
    productAmount      = 12,
    productDescription = 'Tốt',
    productStatus      = 'Hết Hàng'
where update_id = products.id;
end
//
delimiter ;

call update_products;

-- Tạo store procedure xoá sản phẩm theo id
delimiter
//
create procedure delete_products(in delete_id int)
begin
delete
from products
where delete_id = products.id;
end
//
delimiter ;

call delete_products(3);