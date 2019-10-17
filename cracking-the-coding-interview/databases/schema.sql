create schema if not exists apartment_people;

use apartment_people;

create table if not exists complexes (
  complex_id int(11) not null auto_increment primary key,
  complex_name varchar(100) not null
);

create table if not exists buildings (
  building_id int(11) not null auto_increment primary key,
  complex_id int(11) not null,
  building_name varchar(100) not null,
  address varchar(500) not null
);

alter table buildings add constraint fk_buildings_complexes foreign key (complex_id) references complexes(complex_id);

create table if not exists apartments (
  apartment_Id int(11) not null auto_increment primary key,
  building_id int(11) not null,
  unit_number varchar(10) not null
);

alter table apartments add constraint fk_apartments_buildings foreign key (building_id) references building(building_id);

create table if not exists requests (
  request_id int(11) not null auto_increment primary key,
  apartment_id int(11) not null,
  status varchar(100) not null,
  description varchar(500) not null
);

create table if not exists tenants (
  tenant_id int(11) not null auto_increment primary key,
  tenant_name varchar(100) not null
);

create table if not exists apartment_tenants (
  apartment_tenant_id int(11) not null auto_increment primary key,
  tenant_id int(11) not null,
  apartment_id int(11) not null
);
