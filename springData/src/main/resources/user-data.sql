insert into users(id, name, email, disabled) values 
(1, 'John Cena', 'john@gmail.com', false),
(2, 'Salman Khan', 'salman@gmail.com', false),
(3, 'Amitr Khan', 'amir@gmail.com', true);

insert into addresses(id, city,user_id) values
(1, 'Pune', 1),
(2, 'Landon',1),
(3, 'Newyork',2),
(4, 'Mumbai', 3),
(6, 'Washington',3);