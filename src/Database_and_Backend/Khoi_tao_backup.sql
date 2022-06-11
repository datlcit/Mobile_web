create database Do_an_ver_14
go

use Do_an_ver_14

-- Luu thong tin danh muc
create table Category(
	categoryId int primary key identity(1,1),
	categoryName nvarchar(100) not null,
	status bit
)
go

go
-- Luu thong tin san pham
create table Product(
	productId varchar(10) primary key not null,
	productName nvarchar(150) not null,
	productImage varchar(max),
	price float,
	ram varchar(20),
	storage varchar(20),
	color nvarchar(max),
	description ntext,
	createAt DATETIME  DEFAULT(CURRENT_TIMESTAMP) not null,
	updateAt DATETIME DEFAULT(CURRENT_TIMESTAMP) not null,
	quantity int,
	status bit,
	categoryId int foreign key references Category(categoryId)
)
go

-- Luu thong tin khach mua hang
create table Customer(
	customerId int primary key identity(1,1),
	fullName nvarchar(100) not null,
--	password varchar(100) not null,
	phone varchar(20) not null,
	address nvarchar(250) not null,
	email varchar(150),
--	avatar varchar(max),
	createAt DATETIME DEFAULT(CURRENT_TIMESTAMP) not null,
	updateAt DATETIME DEFAULT(CURRENT_TIMESTAMP) not null,
	status bit default(1),
--	userId int null
)
go

-- Luu thong tin gio hang
create table Cart(
	cartId int primary key identity(1,1),
	customerId int foreign key references Customer(customerId),
	productId varchar(10) foreign key references Product(productId),
	quantity int
)
go

-- Luu thong tin tai khoan
create table Users(
	userId int primary key identity(1,1),
	username varchar(150) not null unique,
	password varchar(100) not null,
	isAdmin bit default(0),
	createAt DATETIME DEFAULT(CURRENT_TIMESTAMP) not null,
	updateAt DATETIME DEFAULT(CURRENT_TIMESTAMP) not null,
	status bit default(1)
)
go

-- Luu cac quyen trong website
create table Roles(
	roleId int primary key identity(1,1),
	roleName varchar(50) not null unique,
	status bit
)
go

-- Luu cac quyen duoc gan cho tai khoan
create table UserRoles(
	userRoleId int primary key identity(1,1),
	userId int foreign key references Users(userId),
	roleId int foreign key references Roles(roleId)
)
go

-- Lưu thông tin giảm giá
create table Promotions(
	promotionId int primary key identity(1,1),
	promotionName varchar(250),
	startTime datetime,
	endTime datetime,
	quantity int, --số lượng voucher
	createAt DATETIME DEFAULT(CURRENT_TIMESTAMP) not null,
	updateAt DATETIME DEFAULT(CURRENT_TIMESTAMP) not null,
	applyDay varchar(255),
	maxDiscount int,
	remainApply int,
	code varchar(255),
	status bit default(1)
)
go

-- Luu thong tin don hang
create table Orders(
	orderId int primary key identity(1,1),
	customerId int foreign key references Customer(customerId),
	fullName nvarchar(100) not null,
	phone varchar(20) not null,
	address nvarchar(250) not null,
	email varchar(150),
	promotionId int foreign key references Promotions(promotionId),
	total float not null,
	createAt DATETIME DEFAULT(CURRENT_TIMESTAMP) not null,
	updateAt DATETIME DEFAULT(CURRENT_TIMESTAMP) not null,
	status bit
)
go

-- Luu thong tin chi tiet don hang
create table OrderDetail(
	orderDetailId int primary key identity(1,1),
	orderId int foreign key references Orders(orderId),
	productId varchar(10) foreign key references Product(productId),
	quantity int,
	price float,
	createAt DATETIME DEFAULT(CURRENT_TIMESTAMP) not null,
	updateAt DATETIME DEFAULT(CURRENT_TIMESTAMP) not null
)
go

-- Luu phan hoi cua khach hang
create table FeedBack(
	feedbackId int primary key identity(1,1),
	customerId int foreign key references Customer(customerId),
	productId varchar(10) foreign key references Product(productId),
	content ntext,
	feedbackImage varchar(max), 
	createAt DATETIME DEFAULT(CURRENT_TIMESTAMP) not null,
	updateAt DATETIME DEFAULT(CURRENT_TIMESTAMP) not null,
	status bit
)
go