use ayubo;

create table vehicle (
vid int not null auto_increment,
v_name varchar(55) not null ,
chargers_per_vehicle int not null,
primary key (vid)
);
insert into vehicle (v_name,chargers_per_vehicle) values ('prius', 100),('vitz', 70),('axio', 90),('premio', 120);
select * from vehicle;


create table vehicle_rent_details (
vid int not null,
d_id int,
rent_date date,
return_date date,
foreign key (vid) references vehicle(vid),
foreign key (d_id) references driver(d_id)
);
insert into vehicle_rent_details (vid,d_id,rent_date,return_date) values (1,5,'2018-01-23','2018-01-24');
select * from vehicle_rent_details;



create table driver(
d_id int not null auto_increment,
d_name varchar(150) not null,
vid int,
primary key(d_id),
foreign key (vid) references vehicle(vid)
);

insert into driver (d_name,vid) values ('gayan', 1),('saman', 2),('sudath', 3),('rasika', 4);
select * from driver;

create table trip_package(
p_id int not null auto_increment,
pkg_name varchar(100) not null,
vid int,
d_id int,
primary key(p_id),
foreign key (vid) references vehicle(vid),
foreign key (d_id) references driver(d_id)
);
select * from trip_package;
insert into trip_package (pkg_name,vid,d_id) values ('airport trip',1,5 ),('100km', 2, 6),('200km', 3,7);

create table pkg_details(
vid int,
d_id int,
p_id int,
driver_rate int,
rate_per_km int not null,
waiting_charges int,
extra_charges_per_km int,
ot_per_time int,
foreign key (vid) references vehicle(vid),
foreign key (d_id) references driver(d_id),
foreign key (p_id) references trip_package(p_id)
);

select * from pkg_details;

insert into pkg_details (vid,d_id,p_id,driver_rate,rate_per_km,waiting_charges,extra_charges_per_km,ot_per_time) 
values (1,5,1,1000,20,2,100,20 ),(2,6,2,1000,20,2,100,20),(2,6,3,1000,20,2,100,20);



drop table pkg_details;












