use Do_an_ver_14

-- insert Category
insert into Category(categoryName, status) values
(N'Iphone', 1),
(N'Samsung', 1),
(N'Xiaomi', 1)
select * from category
---------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------
select * from product
-- insert Products
insert into Product(productId, productName, productImage, price, ram, storage, color, description, quantity, status, categoryId) values
('P101', 'IPhone 12 - 64GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/04/22/image-removebg-preview_637547045799326930.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-2.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-3.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-4.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-5.png', 15990000, '4GB', '64GB', N'Tím;Đen;Xanh dương;Trắng;Đỏ;Xanh lá', N'Điện thoại di động Apple iPhone 12 - Chính hãng VN/A', 50, 1, 1),
('P102', 'IPhone 12 - 128GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/04/22/image-removebg-preview_637547045799326930.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-2.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-3.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-4.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-5.png', 17690000, '4GB', '128GB', N'Tím;Đen;Xanh dương;Trắng;Đỏ;Xanh lá', N'Điện thoại di động Apple iPhone 12 - Chính hãng VN/A', 50, 1, 1),
('P103', 'IPhone 12 - 256GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/04/22/image-removebg-preview_637547045799326930.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-2.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-3.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-4.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-5.png', 22390000, '4GB', '256GB', N'Tím;Đen;Xanh dương;Trắng;Đỏ;Xanh lá', N'Điện thoại di động Apple iPhone 12 - Chính hãng VN/A', 50, 1, 1),
('P111', 'Iphone 12 Mini - 64GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-2.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-3.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-4.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-5.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/04/22/image-removebg-preview-1.png', 14990000, '4GB', '64GB', N'Tím;Đen;Xanh dương;Trắng;Đỏ;Xanh lá',N'Apple iPhone 12 Mini - Chính hãng VN/A', 50, 1, 1),
('P112', 'Iphone 12 Mini - 128GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-2.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-3.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-4.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-5.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/04/22/image-removebg-preview-1.png', 16950000, '4GB', '128GB', N'Tím;Đen;Xanh dương;Trắng;Đỏ;Xanh lá', N'Apple iPhone 12 Mini - Chính hãng VN/A', 50, 1, 1),
('P113', 'Iphone 12 Mini - 256GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-2.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-3.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-4.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/11/06/apple-iphone-12-mini-5.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/04/22/image-removebg-preview-1.png', 19950000, '4GB', '256GB', N'Tím;Đen;Xanh dương;Trắng;Đỏ;Xanh lá', N'Apple iPhone 12 Mini - Chính hãng VN/A', 50, 1, 1),
('P121', 'Iphone 13 - 128GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-11.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-10.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-13.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-14.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-12.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/03/09/image-removebg-preview-2.png', 20490000, '4GB', '128GB', N'Hồng;Xanh Dương;Đỏ;Xanh lá;Midnight;Starlight', N'Điện thoại di động Apple iPhone 13 - Chính hãng VN/A', 50, 1, 1),
('P122', 'Iphone 13 - 256GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-11.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-10.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-13.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-14.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-12.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/03/09/image-removebg-preview-2.png', 23690000, '4GB', '256GB', N'Hồng;Xanh Dương;Đỏ;Xanh lá;Midnight;Starlight', N'Điện thoại di động Apple iPhone 13 - Chính hãng VN/A', 50, 1, 1),
('P123', 'Iphone 13 - 512GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-11.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-10.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-13.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-14.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-12.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/03/09/image-removebg-preview-2.png', 25980000, '4GB', '512GB', N'Hồng;Xanh Dương;Đỏ;Xanh lá;Midnight;Starlight', N'Điện thoại di động Apple iPhone 13 - Chính hãng VN/A', 50, 1, 1),
('P131', 'Iphone 13 Pro Max - 128GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-17.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-16.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-15.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-16.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/03/09/image-removebg-preview-4.png', 28950000, '6GB', '128GB', N'Silver;Gold;Graphite;Sierra Blue;Alpine Green', N'Điện thoại di động Apple iPhone 13 Pro Max - Chính hãng VN/A', 50, 1, 1),
('P132', 'Iphone 13 Pro Max - 256GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-17.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-16.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-15.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-16.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/03/09/image-removebg-preview-4.png', 31750000, '6GB', '256GB', N'Silver;Gold;Graphite;Sierra Blue;Alpine Green', N'Điện thoại di động Apple iPhone 13 Pro Max - Chính hãng VN/A', 50, 1, 1),
('P133', 'Iphone 13 Pro Max - 512GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-17.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-16.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-15.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-16.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/03/09/image-removebg-preview-4.png', 36990000, '6GB', '512GB', N'Silver;Gold;Graphite;Sierra Blue;Alpine Green', N'Điện thoại di động Apple iPhone 13 Pro Max - Chính hãng VN/A', 50, 1, 1),
('P134', 'Iphone 13 Pro Max - 1TB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-17.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-16.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-15.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/15/image-removebg-preview-16.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/03/09/image-removebg-preview-4.png', 42890000, '6GB', '1TB', N'Silver;Gold;Graphite;Sierra Blue;Alpine Green', N'Điện thoại di động Apple iPhone 13 Pro Max - Chính hãng VN/A', 50, 1, 1),
('P201', 'Samsung Galaxy Z Flip3 5G - 128GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2021/08/11/kem2.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/08/11/em3.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/08/11/den-z.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/08/11/green.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/08/11/kem.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/08/11/tim-z.png', 18690000 , '8GB', '128GB', N'Phantom Black;Kem Ivory;Xanh Phantom;Tím Lilac', N'Điện thoại di động Samsung Galaxy Z Flip3 5G - Chính hãng VN/A', 50, 1, 2),
('P202', 'Samsung Galaxy Z Flip3 5G - 256GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2021/08/11/kem2.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/08/11/em3.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/08/11/den-z.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/08/11/green.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/08/11/kem.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/08/11/tim-z.png', 20590000 , '8GB', '256GB', N'Phantom Black;Kem Ivory;Xanh Phantom;Tím Lilac', N'Điện thoại di động Samsung Galaxy Z Flip3 5G - Chính hãng VN/A', 50, 1, 2),
('P211', 'Samsung Galaxy Z Fold3 5G - 256GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2021/08/11/den-f.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/08/11/bac2.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/08/11/f-tim.png', 32890000 , '12GB', '256GB', N'Phantom Black;Bạc Phantom;Xanh Phantom', N'Điện thoại di động Samsung Galaxy Z Fold3 5G - Chính hãng VN/A', 50, 1, 2),
('P212', 'Samsung Galaxy Z Fold3 5G - 512GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2021/08/11/den-f.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/08/11/bac2.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/08/11/f-tim.png', 35790000 , '12GB', '512GB', N'Phantom Black;Bạc Phantom;Xanh Phantom', N'Điện thoại di động Samsung Galaxy Z Fold3 5G - Chính hãng VN/A', 50, 1, 2),
('P221', 'Samsung Galaxy S22 - 128GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/09/image-removebg-preview-7.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/09/image-removebg-preview_637800437459949020.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/09/image-removebg-preview-3_637800437459636500.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/09/image-removebg-preview-5.png', 16990000 , '8GB', '128GB', N'Hồng;Phantom Black;Xanh;Phantom White', N'Điện thoại di động Samsung Galaxy S22 - Chính hãng VN/A', 50, 1, 2),
('P222', 'Samsung Galaxy S22 - 256GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/09/image-removebg-preview-7.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/09/image-removebg-preview_637800437459949020.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/09/image-removebg-preview-3_637800437459636500.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/09/image-removebg-preview-5.png', 18490000  , '8GB', '256GB', N'Hồng;Phantom Black;Xanh;Phantom White', N'Điện thoại di động Samsung Galaxy S22 - Chính hãng VN/A', 50, 1, 2),
('P231', 'Samsung Galaxy S22 Ultra - 8GB/128GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/09/image-removebg-preview-6_637800452287772364.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/09/image-removebg-preview-11.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/09/image-removebg-preview-19.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/09/image-removebg-preview-3_637800452287772364.png', 25990000 , '8GB', '128GB', N'Xanh lá;Phantom Black;Phantom White;Burgudy', N'Điện thoại di động Samsung Galaxy S22 Ultra - Chính hãng VN/A', 50, 1, 2),
('P232', 'Samsung Galaxy S22 Ultra - 12GB/256GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/09/image-removebg-preview-6_637800452287772364.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/09/image-removebg-preview-11.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/09/image-removebg-preview-19.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/09/image-removebg-preview-3_637800452287772364.png', 28990000 , '12GB', '256GB', N'Xanh lá;Phantom Black;Phantom White;Burgudy', N'Điện thoại di động Samsung Galaxy S22 Ultra - Chính hãng VN/A', 50, 1, 2),
('P233', 'Samsung Galaxy S22 Ultra - 12GB/512GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/09/image-removebg-preview-6_637800452287772364.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/09/image-removebg-preview-11.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/09/image-removebg-preview-19.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/09/image-removebg-preview-3_637800452287772364.png', 31990000 , '12GB', '512GB', N'Xanh lá;Phantom Black;Phantom White;Burgudy', N'Điện thoại di động Samsung Galaxy S22 Ultra - Chính hãng VN/A', 50, 1, 2),
('P301', 'Redmi Note 11 - 64GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2022/01/27/xam1.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/01/27/image-removebg-preview.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/19/image-removebg-preview.png', 4190000  , '4GB', '64GB', N'Xám;Dương đậm;Xanh nhạt', N'Điện thoại di động Redmi Note 11 - Chính hãng VN/A', 50, 1, 3),
('P302', 'Redmi Note 11 - 128GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2022/01/27/xam1.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/01/27/image-removebg-preview.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/19/image-removebg-preview.png', 4490000 , '4GB', '128GB', N'Xám;Dương đậm;Xanh nhạt', N'Điện thoại di động Redmi Note 11 - Chính hãng VN/A', 50, 1, 3),
('P311', 'Redmi Note 11 Pro', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/17/note-11-pro-5g-4.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/17/note-11-pro-5g-2.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/17/note-11-pro-5g-5.png', 7480000 , '8GB', '128GB', N'Trắng;Xanh dương;Xám', N'Điện thoại di động Redmi Note 11 Pro - Chính hãng VN/A', 50, 1, 3),
('P312', 'Redmi Note 11 Pro 5G', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/17/note-11-pro-5g-4.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/17/note-11-pro-5g-2.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/02/17/note-11-pro-5g-5.png', 8880000 , '8GB', '128GB', N'Trắng;Xanh dương;Xám', N'Điện thoại di động Redmi Note 11 Pro - Chính hãng VN/A', 50, 1, 3),
('P321', 'Xiaomi 12', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2022/03/17/image-removebg-preview-5.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/03/17/image-removebg-preview-6.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/03/17/image-removebg-preview-4.png', 17790000 , '8GB', '256GB', N'Tím;Xanh dương;Xám', N'Điện thoại di động Xiaomi 12 - Chính hãng VN/A', 50, 1, 3),
('P322', 'Xiaomi 12 Pro', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2022/03/17/image-removebg-preview-5.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/03/17/image-removebg-preview-6.png https://cdn.hoanghamobile.com/i/preview/Uploads/2022/03/17/image-removebg-preview-4.png', 22990000 , '12GB', '256GB', N'Tím;Xanh dương;Xám', N'Điện thoại di động Xiaomi 12 Pro - Chính hãng VN/A', 50, 1, 3),
('P331', 'Xiaomi Redmi 9C - 3GB/64GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2020/10/27/9ccc.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/10/27/9C.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/10/27/9c212.png', 2640000, '3GB', '64GB', N'Xanh dương;Cam;Xám', N'Điện thoại di động Xiaomi Redmi 9C - 3GB/64GB - Chính hãng DGW', 50, 1, 1),
('P332', 'Xiaomi Redmi 9C - 4GB/128GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2020/10/27/9ccc.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/10/27/9C.png https://cdn.hoanghamobile.com/i/preview/Uploads/2020/10/27/9c212.png', 2990000 , '4GB', '128GB', N'Xanh dương;Cam;Xám;Xanh lá;Tím', N'Điện thoại di động Xiaomi Redmi 9C - 4GB/128GB - Chính hãng DGW', 50, 1, 1),
('P341', 'Xiaomi 11 Lite 5G NE - 6GB/128GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/16/image-removebg-preview-21.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/16/image-removebg-preview-20.png', 7390000, '6GB', '128GB', N'Đen;Hồng', N'Điện thoại di động Xiaomi 11 Lite 5G NE - 6GB/128GB - Chính hãng DGW', 50, 1, 1),
('P342', 'Xiaomi 11 Lite 5G NE - 8GB/128GB', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/16/image-removebg-preview-21.png https://cdn.hoanghamobile.com/i/preview/Uploads/2021/09/16/image-removebg-preview-20.png', 8590000, '8GB', '128GB', N'Đen;Hồng', N'Điện thoại di động Xiaomi 11 Lite 5G NE - 8GB/128GB - Chính hãng DGW', 50, 1, 1)

---------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------

--insert Customer
insert into Customer(fullName, phone, address, email) values
(N'Lý Chính Đạt', '0987654321', N'Hà Nội', 'lydat@gmail.com'),
(N'Nguyễn Đức Du', '0987654321', N'Nam Định', 'ducdu@gmail.com'),
(N'Ma Văn Hà', '0987654321', N'Lạng Sơn', 'vanha@gmail.com'),
(N'Nguyễn Minh Hiếu', '0987654321', N'Nam Định', 'minhhieu@gmail.com'),
(N'Đào Trọng Nam', '0987654321', N'Thái Bình', 'trongnam@gmail.com')
select * from Customer
---------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------

--insert Cart
insert into Cart(customerId, productId, quantity) values
(4, 'P201', 1),
(5, 'P103', 1)

---------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------

--insert Promotions
insert into Promotions(promotionName, startTime, endTime, applyDay, maxDiscount, remainApply, code, status, quantity) values
('None', '2022-06-01 00:00:00', '2022-07-01 00:00:00', 'Forever', 0, 0, 'NONE', 1, 0),
('Super Sale', '2022-06-01 00:00:00', '2022-07-01 00:00:00', 'AllDay', 200000, 5, 'SUPSALE', 1, 50),
('Weekend', '2022-06-01 00:00:00', '2022-07-01 00:00:00', 'SaturdayAndSunday', 100000, 5, 'WEEKSALE', 1, 50)
select * from Promotions
------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------

--insert Orders
insert into Orders(customerId, fullName, phone, address, email, total) values
(5, N'Đào Trọng Nam', '0987654321', N'số 10, ngõ 123, đường Văn Chương, Đống Đa, Hà Nội', 'trongnam@gmail.com', 20480000)
select * from Orders
------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------

--insert OrderDetail
insert into OrderDetail(orderId, productId, quantity, price) values
(1, 'P101', 1, 15990000),
(1, 'P302', 1, 4490000)

------------------------------------------------------------------------------------------------
------------------------------------------------------------------------------------------------

--insert Roles
insert into Roles(roleName, status) values
('ROLE_ADMIN', 1),
('ROLE_USER', 1)

--insert Users
--admin pass: admin#123
--user pass: user#123
insert into Users(userName, password) values
('lychinhdat', '$2a$12$fTMT68aQ9uMDghnwB5Mi9uPjfxmhqBtq50Zi3NLBzpduopc9p4R7O'),
('nguyenducdu', '$2a$12$b.r1Dnk5YLWHVE.MwnBN5O1gJW078EVCbn5gk0/t6I3GXjdp5xFv.'),
('mavanha', '$2a$12$b.r1Dnk5YLWHVE.MwnBN5O1gJW078EVCbn5gk0/t6I3GXjdp5xFv.'),
('nguyenminhhieu', '$2a$12$b.r1Dnk5YLWHVE.MwnBN5O1gJW078EVCbn5gk0/t6I3GXjdp5xFv.'),
('daotrongnam', '$2a$12$b.r1Dnk5YLWHVE.MwnBN5O1gJW078EVCbn5gk0/t6I3GXjdp5xFv.')
select * from users
--insert UserRoles
insert into UserRoles(userId, roleId) values
(1, 1),
(1, 2),
(2, 2),
(3, 2),
(4, 2),
(5, 2)