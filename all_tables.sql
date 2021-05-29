drop database premiumcad;
create database premiumcad;

use premiumcad;

create table Region (
	region_id integer primary key,
	city varchar(15),
    state varchar(15),
    country varchar(15)
);

create table Address (
	location_id int primary key,
    street_address varchar(30),
	region_id integer references Region(region_id)
);

create table Clients (
	client_id integer primary key,
    client_name varchar(20) not null,
    contact_number varchar(15) unique,
    email_id varchar(30) unique,
    location_id integer, 
	foreign key(location_id) references Address(location_id)
);


create table Employee (
	employee_id integer primary key,
    name varchar(30) not null,
    email_id varchar(30) unique,
    contact_number varchar(15) unique,
    location_id integer,
    foreign key(location_id) references Address(location_id)
);

CREATE TABLE Roles
(
    id integer primary key,
    NAME VARCHAR(500) not null unique,
    DESCRIPTION VARCHAR(200)
);

CREATE TABLE PERMISSION
(
    ID integer primary key,
    NAME VARCHAR(500) not null unique
);

CREATE TABLE ROLE_PERMISSION_MAP
(
    ID integer primary key,
    ID_ROLE integer,
    foreign key(id_role) REFERENCES Roles(ID),
    ID_PERMISSION integer REFERENCES PERMISSION(ID)
);

create table SCOPE
(
    ID integer primary key,
    name VARCHAR(500) not null,
    DESCRIPTION VARCHAR(500)
);

create table ROLE_SCOPE_MAP
(
    ID integer primary key,
    ID_ROLE  integer references ROLE(ID),
    ID_SCOPE integer references SCOPE(ID)
);

create table URL(
	id integer primary key,
    url varchar(100)
);

create table URL_SCOPE_MAP
(
    ID integer primary key,
    ID_URL integer references URL(ID),
    ID_SCOPE integer references SCOPE(ID)
);

CREATE TABLE ROLE_DERIVATION_RULE
(
    ID integer primary key,
    ID_ROLE integer REFERENCES ROLE(ID),
    USER_ID integer references Emploee(employee_id)
);

create table Work_Status_From (
	status_name varchar(20) primary key
);

create table Work_Status_To (
	status_name varchar(20) primary key
);

create table Status_Flow (
	status_flow_id integer primary key,
	status_from varchar(20),
    status_to varchar(20),
    foreign key(status_from) references Work_Status_From(status_name),
    foreign key(status_to) references Work_Status_To(status_name)
);

create table Project (
	project_id integer primary key,
    project_name varchar(20) not null,
    project_description varchar(100),
    project_price double not null,
    project_manager integer,
    client_id integer,
    foreign key (project_manager) references Employee(employee_id),
    foreign key (client_id) references Clients(client_id)
);

create table Task (
	task_id int primary key,
    current_status integer,
    task_description blob not null,
	task_created_at datetime not null,
    project_id integer not null,
    assigned_to integer not null,
    foreign key(current_status) references Status_Flow(status_flow_id),
    foreign key(project_id) references Project(project_id),
    foreign key(assigned_to) references Employee(employee_id)
);

create table Files (
	file_id integer primary key,
    file_path varchar(30) not null,
    file_name varchar(20) not null,
    task_id integer,
    foreign key(task_id) references Task(task_id)
);


create table Updates (
	update_id integer primary key,
    status_change_id integer, 
    status_changed_at datetime not null,
    task_id integer not null,
    employee_id integer not null,
    foreign key(task_id) references Task(task_id),
    foreign key(employee_id) references Employee(employee_id),
    foreign key(status_change_id) references Status_Flow(status_flow_id)
);

create table Comments (
	comment_id integer primary key,
    comment_description varchar(200) not null,
    comment_createdAt datetime,
    task_id integer not null,
    foreign key(task_id) references Task(task_id)
);

create table Transactions (
	transaction_id integer primary key,
    end_date datetime,
    task_id integer not null,
    foreign key(task_id) references Task(task_id)
);

/*Insert into Region values (1, "Delhi", "Delhi", "India");
Insert into Address values (1, "C-10/144 Yamuna Vihar", 1);
Insert into Clients values (1, "Shashank", "9013214213", "safanfk@af.com", 1);
Insert into WORK_STATUS_From VALUES ('abc');
Insert into WORK_STATUS_To VALUES ('def');
Insert into status_flow values (1,'abc','def');
insert into employee values (1,'sagar','asfasfaf','1234567899',1);
Insert into project values (1,'premium','ahsdjmasf j af',100,1,1);*/


Insert into Region values (101, 'Delhi', 'Delhi', 'India');
Insert into Region values (102, 'Bangalore', 'Karnataka', 'India');
Insert into Region values (103, 'Faridabad', 'Haryana', 'India');
Insert into Region values (104, 'New York City', 'New York', 'USA');

/* Address  */
Insert into Address values (1001, 'b-145 yamuna vihar', 101);
Insert into Address values (1002, '1c1 hal city', 102);
Insert into Address values (1003, '120 metropolis e-city', 102);
Insert into Address values (1004, '1 flora', 103);
Insert into Address values (1005, '45 bawana street', 101);
Insert into Address values (1006, '78 no idea', 104);
Insert into Address values (1007, '24 us state', 104);

/* Clients  */
Insert into Clients values (1, 'Shashank', '9013214213', 'safanfk@af.com', 1001);
Insert into Clients values (2, 'Himanshu', '1234567890', 'abcdef@gmail.com', 1002);
Insert into Clients values (3, 'Jatin', '2345678921', 'dfnn@gmail.com', 1006);

/* Employees  */
insert into employee values (1,'Sagar','abcd@gmail.com','1234567899',1001);
insert into employee values (2,'Kushagra','bcde@gmail.com','123',1001);
insert into employee values (3,'Ayush','cdef@gmail.com','5244235848',1002);
insert into employee values (4,'Rohit','defg@gmail.com','123545812',1002);
insert into employee values (5,'Ashish','efgh@gmail.com','212155',1003);
insert into employee values (6,'Baba','fghi@gmail.com','8751122585',1003);
insert into employee values (7,'Mohit','ghij@gmail.com','5456122288',1004);
insert into employee values (8,'Abhishek','hijk@gmail.com','41511255252',1003);

/* Projects  */
Insert into project values (101,'premium','abcd denfbfn ajsfjn',100,1,1);
Insert into project values (102,'project_x','',10000,1,2);
Insert into project values (103,'premiumcad','abcd denfbfnasf ajsfjn',10.00,2,2);
Insert into project values (104,'pro','abcd',5845.45,3,3);


/* work flow  */
Insert into WORK_STATUS_From VALUES ('start');
Insert into WORK_STATUS_From VALUES ('in progress');
Insert into WORK_STATUS_From VALUES ('quality check');
Insert into WORK_STATUS_From VALUES ('quality assurance');


Insert into WORK_STATUS_To VALUES ('in progress');
Insert into WORK_STATUS_To VALUES ('quality assurance');
Insert into WORK_STATUS_To VALUES ('quality check');
Insert into WORK_STATUS_To VALUES ('done');


Insert into status_flow values (1,'start','in progress');
Insert into status_flow values (2,'start','done');
Insert into status_flow values (3,'in progress','done');
Insert into status_flow values (4,'in progress','quality check');
Insert into status_flow values (5,'quality check','quality assurance');

select  c.client_name, count(*)
from clients c join project p on c.client_id = p.client_id
group by c.client_id;

select * from employee;