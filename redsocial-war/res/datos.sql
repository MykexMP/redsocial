use redsocial;

insert into visibility values (1, 'publico');
insert into visibility values (2, 'privado');
insert into visibility values (3, 'amigos');
insert into visibility values (4, 'grupo');

insert into user values(1, 'Ignacio',' nachojaime@redsocial.es', '1234', 'nacho', '2010-10-10');
insert into user values(2, 'Juan Jesus',' juanje@redsocial.es', '1234', 'juanje', '2010-10-10');
insert into user values(3, 'Lorena',' lorena@redsocial.es', '1234', 'lorena', '2010-10-10');
insert into user values(4, 'Miguel',' miguel@redsocial.es', '1234', 'miguel', '2010-10-10');
insert into user values(5, 'Maria',' mariaangeles@redsocial.es', '1234', 'maria', '2010-10-10');

insert into groupp values(1, 1, 'Ratas', 'Aqui tenemos a los mas ratas', 1, '2010-10-11');
insert into groupp values(2, 2, 'Descuentos', 'Aqui tenemos descuentos', 2, '2010-10-11');

insert  into post values(1, 1, ' Hola a todos', '2010-11-21', 2);
insert  into post values(2, 1, ' Adios a todos', '2010-11-25', 1);

insert into message values ('1', '1','2','2010-10-26','Quedamos esta tarde?', '1');
insert into message values ('2', '2','1','2010-10-26','No, quiero quedar contigo', '1');

insert into friend values ('1', '1','2', '2010-10-15');
insert into friend values ('2', '3','2', '2010-10-16');

insert into request_friend values ('1', '1','2', '2010-10-14');
insert into request_friend values ('2', '3','2', '2010-10-14');

insert into request_group values ('1', '1', '2', '2010-10-14', '1');
insert into request_group values ('2', '2', '5', '2010-10-14', '2');

insert into user_group values ('1', '1', '2', '2010-10-19');
insert into user_group values ('2', '2', '5', '2010-10-20');


