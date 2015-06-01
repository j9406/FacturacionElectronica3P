# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table facturaciondb (
  id                        bigint not null,
  rfcex                     varchar(255),
  num_fol                   varchar(255),
  sell                      varchar(255),
  lugar                     varchar(255),
  due_date                  varchar(255),
  rfcsexp                   varchar(255),
  des_ser                   varchar(255),
  val_uni                   varchar(255),
  imp_tot                   varchar(255),
  constraint pk_facturaciondb primary key (id))
;

create sequence facturaciondb_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists facturaciondb;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists facturaciondb_seq;

