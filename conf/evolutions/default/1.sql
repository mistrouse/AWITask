
# --- !Ups

 
 CREATE TABLE Task (
    id serial,
    name varchar(255) NOT NULL,
    description text,
    created_at timestamp,
    updated_at timestamp,
      constraint pk_task primary key (id)
);



# --- !Downs


