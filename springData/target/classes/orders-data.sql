insert into orders(id, cust_name, cust_email) values
(1, 'John Cena', 'john@gmail.com'),
(2, 'Salman Khan', 'salman@gmail.com'),
(3, 'Amitr Khan', 'amir@gmail.com');

insert into order_items(id, productCode, quantity, order_id) values
(1, 'order item1', 2, 1),
(2, 'order item2', 1, 1),
(3, 'order item3', 5, 1),
(4, 'order item4', 1, 2),
(5, 'order item5', 2, 2);