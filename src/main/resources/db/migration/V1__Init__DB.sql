  create sequence hibernate_sequence start 1 increment 1;

    create table user_role (
      id int4 not null,
      name varchar(255),
       primary key (id)
    );

    create table usr (
      id int4 not null,
      email varchar(255),
      name varchar(255),
      password varchar(255),
      role int4 references user_role(id) on delete cascade,
      primary key (id)
    );

    create table list_tasks (
      id int4 not null,
      name varchar(255),
      primary key (id)
    );

    create table task (
      id int4 not null,
      name varchar(255),
      description varchar(255),
      list_tasks_id int4 references list_tasks(id) on delete  cascade,
    primary key (id)
    );



--   alter table if exists usr
--   add constraint usr_fk
--   foreign key (role) references user_role;
--
--   alter table if exists task
--   add constraint task_fk
--   foreign key (tasks) references list_tasks;





































--
-- create sequence hibernate_sequence start 1 increment 1
--
-- -- create table list_tasks (
-- --   id int4 not null,
-- --   list_name varchar(255),
-- --   primary key (id));
-- --
-- -- create table task (
-- --   id int4 not null,
-- --   description varchar(255),
-- --   name varchar(255),
-- --   list_tasks_id int4,
-- --   primary key (id));
--
-- create table user_role (
--   id int4 not null,
--   primary key (id));
--
-- create table usr (
--   id int4 not null,
--   email varchar(255)
--   name varchar(255),
--   password varchar(255),
--   role int4, primary key (id));
--
-- -- alter table if exists task add constraint FK7jemoq9ptujr20lwr55l13u3q foreign key (list_tasks_id) references list_tasks
-- alter table if exists usr add constraint FKryc0yno1xumebealmnijr0j56 foreign key (role) references user_role;