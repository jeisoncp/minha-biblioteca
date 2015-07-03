# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table book (
  id                        integer auto_increment not null,
  name                      varchar(255),
  constraint pk_book primary key (id))
;

create table person (
  id                        bigint auto_increment not null,
  name                      varchar(255) not null,
  user                      varchar(255) not null,
  password                  varchar(255) not null,
  constraint pk_person primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table book;

drop table person;

SET FOREIGN_KEY_CHECKS=1;

