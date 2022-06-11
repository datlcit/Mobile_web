use Do_an_ver_14

select * from Category go

delete from Orders where orderId > 0
-- Câu lệnh reset identity khi tự động tăng không đúng thứ tự số
DBCC CHECKIDENT('Orders', RESEED, 0)
go

select * from Customer go

select * from Product where categoryId = 3

-- Cac lenh xoa


delete from OrderDetail where orderDetailId > 0
delete from Cart where cartId > 0
delete from Product where quantity > 0
delete from Category where categoryId > 0
delete from Orders where orderId > 1
delete from FeedBack where feedbackId > 0
delete from Customer where customerId > 0
delete from Promotions where promotionId > 0
delete from UserRoles where userRoleId > 0
delete from Users where userId > 0
delete from Roles where roleId > 0

-- Cac lenh reset identity

DBCC CHECKIDENT('Cart', RESEED, 0)
go
DBCC CHECKIDENT('Category', RESEED, 0)
go
DBCC CHECKIDENT('Customer', RESEED, 0)
go
DBCC CHECKIDENT('FeedBack', RESEED, 0)
go
DBCC CHECKIDENT('Orders', RESEED, 0)
go
DBCC CHECKIDENT('OrderDetail', RESEED, 0)
go
DBCC CHECKIDENT('Promotions', RESEED, 0)
go
DBCC CHECKIDENT('Roles', RESEED, 0)
go
DBCC CHECKIDENT('Users', RESEED, 0)
go
DBCC CHECKIDENT('UserRoles', RESEED, 0)
go

ALTER TABLE Product
  ALTER COLUMN ram varchar(20);

ALTER TABLE Product
DROP COLUMN color;
GO

ALTER TABLE ProductStorage
  ADD status bit;

  ALTER TABLE Customer
DROP COLUMN password;
GO

select p.productId, ps.storageId from Product p
left join ProductStorage ps on p.productId = ps.productId
go


select * from Promotions go

 ALTER TABLE Product
alter ram varchar;
GO


  select * from Customer
  select * from Users
  select * from Roles

  select u.username, r.roleName from Users u
  join UserRoles ur on u.userId = ur.userId
  join Roles r on ur.roleId = r.roleId

delete from OrderDetail where price > 0
delete from Orders where total > 0
delete from Promotions where maxdiscount > 0

DBCC CHECKIDENT('Promotions', RESEED, 0)
go
DBCC CHECKIDENT('Orders', RESEED, 0)
go
DBCC CHECKIDENT('OrderDetail', RESEED, 0)
go

select * from Product
select * from Customer
select * from Cart
select * from OrderDetail
select * from Promotions
select * from Orders
select * from Users
select * from Roles r 
left join UserRoles ur on r.roleId = ur.roleId
go
select * from Category

-- Hiển thị tổng số sản phẩm theo danh mục
select c.categoryId, COUNT(p.productId) as TotalProducts
from Category c
left join Product p on c.categoryId = p.categoryId
group by c.categoryId

-- Hiển thị username của bảng User khi gọi từ bảng Customer
select u.username from Customer c
join Users u on c.customerId = u.customerId

Select COUNT(p.productId) from Category c left join Product p on c.categoryId = p.categoryId group by c.categoryId

alter table Users
add constraint df_user DEFAULT(0) for isAdmin;

alter table Orders
add constraint df_Orders_status DEFAULT(1) for status;

alter table Orders
add constraint df_Orders_Promotion DEFAULT(1) for promotionId;

alter table Users
drop constraint df_user_status

ALTER TABLE Customer
DROP COLUMN userId
GO

ALTER TABLE Users
DROP COLUMN customerId;
GO

drop table FeedBack
drop table OrderDetail
drop table Orders
drop table Cart
drop table Customer