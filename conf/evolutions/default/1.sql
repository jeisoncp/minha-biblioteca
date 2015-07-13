# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table book (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  author                    varchar(255),
  publisher                 varchar(255),
  status                    tinyint(1) default 0,
  constraint pk_book primary key (id))
;

create table person (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  user                      varchar(255),
  password                  varchar(255),
  constraint pk_person primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table book;

drop table person;

SET FOREIGN_KEY_CHECKS=1;

