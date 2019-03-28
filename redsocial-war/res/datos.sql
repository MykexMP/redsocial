use redsocial;

insert into visibility values (1, 'Public');
insert into visibility values (2, 'Private');
insert into visibility values (3, 'Friends');
insert into visibility values (4, 'Group');

insert into user values(1, 'Ignacio','nachojaime@redsocial.es', '1234', 'nacho', '2010-10-10');
insert into user values(2, 'Juan Jesus','juanje@redsocial.es', '1234', 'juanje', '2010-10-10');
insert into user values(3, 'Lorena','lorena@redsocial.es', '1234', 'lorena', '2010-10-10');
insert into user values(4, 'Miguel','miguel@redsocial.es', '1234', 'miguel', '2010-10-10');
insert into user values(5, 'Maria','mariaangeles@redsocial.es', '1234', 'maria', '2010-10-10');

insert into groupp values(1, 1, 'Quedada 27 de Marzo', 'Quedada del grupo de Web', 1, '2010-10-11');
insert into groupp values(2, 2, 'Descuentos', 'Aqui tenemos descuentos', 2, '2010-10-11');

insert into post values(1, 1, 'Hoy me lo he pasado de cine viendo una peli', '2010-11-21', 2);
insert into post values(2, 2, 'Que mal va fesibuk hoy', '2010-11-25', 1);
insert into post values(3, 4, 'Uf, menuda pereza ponerme con PyL ahora', '2010-11-25', 1);

insert into message values ('1', '1','2','2010-10-26','¿Quedamos esta tarde?', '1');
insert into message values ('2', '2','1','2010-10-26','No puedo, tengo que estudiar', '1');

insert into friend values ('1', '1','2', '2010-10-15');
insert into friend values ('2', '3','2', '2010-10-16');

insert into request_friend values ('1', '4','5', '2010-10-14');
insert into request_friend values ('2', '3','2', '2010-10-14');

insert into request_group values ('1', '1', '2', '2010-10-14', '1');
insert into request_group values ('2', '2', '5', '2010-10-14', '2');

insert into user_group values ('1', '1', '2', '2010-10-19');
insert into user_group values ('1', '1', '3', '2010-10-19');
insert into user_group values ('1', '1', '4', '2010-10-19');
insert into user_group values ('1', '1', '5', '2010-10-19');

insert into user_group values ('2', '2', '1', '2010-10-20');
insert into user_group values ('2', '2', '2', '2010-10-20');
