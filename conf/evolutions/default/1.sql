
# --- !Ups

 
 CREATE TABLE Task (
    id serial,
    name varchar(255) NOT NULL,
    content text,
    creationDate timestamp,
    updatedDate timestamp,
      constraint pk_task primary key (id)
);



# --- !Downs


