
# --- !Ups

 CREATE TABLE User (
    id serial,
    email varchar(255) NOT NULL,
    password varchar(255) NOT NULL,
    name varchar(255) NOT NULL,
   constraint uq_user_email unique (email),
     constraint pk_user primary key (id));
 
 CREATE TABLE Task (
    id serial,
    name varchar(255) NOT NULL,
    description text,
    created_at timestamp,
    updated_at timestamp,
      constraint pk_task primary key (id)
);



# --- !Downs


