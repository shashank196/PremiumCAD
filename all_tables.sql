drop database premiumcad;
create database premiumcad;

use premiumcad;

create table Address (
	locationId int primary key,
    streetAddress varchar(30),
    city varchar(15),
    state varchar(15),
    country varchar(15)
);

create table Clients (
	clientId integer primary key,
    clientName varchar(20) not null,
    contactNumber varchar(15) unique,
    emailId varchar(30) unique,
    locationId integer, 
	foreign key(locationId) references Address(locationId)
);


create table Employee (
	employeeId integer primary key,
    name varchar(30) not null,
    emailId varchar(30) unique,
    contactNumber varchar(15) unique,
    locationId integer,
    foreign key(locationId) references Address(locationId)
);

CREATE TABLE Roles
(
    id integer primary key,
    name VARCHAR(500) not null unique,
    description VARCHAR(200)
);

CREATE TABLE PERMISSION
(
    id integer primary key,
    name VARCHAR(500) not null unique
);

CREATE TABLE ROLE_PERMISSION_MAP
(
    idRole integer,
    foreign key(idRole) REFERENCES Roles(id),
    idPermission integer REFERENCES PERMISSION(id)
);

create table SCOPE
(
    id integer primary key,
    name VARCHAR(500) not null,
    description VARCHAR(500)
);

create table ROLE_SCOPE_MAP
(
    idRole  integer references ROLE(id),
    idScope integer references SCOPE(id)
);

create table URL(
	id integer primary key,
    url varchar(100) unique not null
);

create table URL_SCOPE_MAP
(
    idUrl integer references URL(id),
    idScope integer references SCOPE(id)
);

CREATE TABLE ROLE_DERIVATION_RULE
(
    id integer primary key,
    idRole integer REFERENCES ROLE(id),
    userId integer references Emploee(employeeId)
);

create table WorkStatusFrom (
	statusName varchar(20) primary key
);

create table WorkStatusTo (
	statusName varchar(20) primary key
);

create table StatusFlow (
	statusFlowId integer primary key,
	statusFrom varchar(20),
    statusTo varchar(20),
    foreign key(statusFrom) references WorkStatusFrom(statusName),
    foreign key(statusTo) references WorkStatusTo(statusName)
);

create table Project (
	projectId integer primary key,
    projectName varchar(20) not null,
    projectDescription varchar(100),
    projectPrice double not null,
    projectManager integer,
    clientId integer,
    foreign key (projectManager) references Employee(employeeId),
    foreign key (clientId) references Clients(clientId)
);

create table Task (
	taskId int primary key,
    currentStatus integer,
    taskDescription blob not null,
	taskCreated_at datetime not null,
    projectId integer not null,
    assignedTo integer not null,
    foreign key(currentStatus) references StatusFlow(statusFlowId),
    foreign key(projectId) references Project(projectId),
    foreign key(assignedTo) references Employee(employeeId)
);

create table Files (
	fileId integer primary key,
    filePath varchar(30) not null,
    fileName varchar(20) not null,
    taskId integer,
    foreign key(taskId) references Task(taskId)
);


create table Updates (
	updateId integer primary key,
    statusChangeId integer, 
    statusChangedAt datetime not null,
    taskId integer not null,
    employeeId integer not null,
    foreign key(taskId) references Task(taskId),
    foreign key(employeeId) references Employee(employeeId),
    foreign key(statusChangeId) references StatusFlow(statusFlowId)
);

create table Comments (
	commentId integer primary key,
    commentDescription varchar(200) not null,
    commentCreatedAt datetime,
    taskId integer not null,
    foreign key(taskId) references Task(taskId)
);

create table Transactions (
	transactionId integer primary key,
    endDate datetime,
    taskId integer not null,
    foreign key(taskId) references Task(taskId)
);

/*Insert into Region values (1, "Delhi", "Delhi", "India");
Insert into Address values (1, "C-10/144 Yamuna Vihar", 1);
Insert into Clients values (1, "Shashank", "9013214213", "safanfk@af.com", 1);
Insert into WORK_STATUS_From VALUES ('abc');
Insert into WORK_STATUS_To VALUES ('def');
Insert into status_flow values (1,'abc','def');
insert into employee values (1,'sagar','asfasfaf','1234567899',1);
Insert into project values (1,'premium','ahsdjmasf j af',100,1,1);*/

/* Address  */
Insert into Address values (1001, 'b-145 yamuna vihar', 'Delhi', 'Delhi', 'India');
Insert into Address values (1002, '1c1 hal city', 'Bangalore', 'Karnataka', 'India');
Insert into Address values (1003, '120 metropolis e-city', 'Bangalore', 'Karnataka', 'India');
Insert into Address values (1004, '1 flora', 'Faridabad', 'Haryana', 'India');
Insert into Address values (1005, '45 bawana street', 'Faridabad', 'Haryana', 'India');
Insert into Address values (1006, '78 no idea', 'New York City', 'New York', 'USA');
Insert into Address values (1007, '24 us state', 'New York City', 'New York', 'USA');

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
Insert into WORKSTATUSFrom VALUES ('start');
Insert into WORKSTATUSFrom VALUES ('in progress');
Insert into WORKSTATUSFrom VALUES ('quality check');
Insert into WORKSTATUSFrom VALUES ('quality assurance');


Insert into WORKSTATUSTo VALUES ('in progress');
Insert into WORKSTATUSTo VALUES ('quality assurance');
Insert into WORKSTATUSTo VALUES ('quality check');
Insert into WORKSTATUSTo VALUES ('done');


Insert into statusFlow values (1,'start','in progress');
Insert into statusFlow values (2,'start','done');
Insert into statusFlow values (3,'in progress','done');
Insert into statusFlow values (4,'in progress','quality check');
Insert into statusFlow values (5,'quality check','quality assurance');

select  c.clientName, count(*)
from clients c join project p on c.clientId = p.clientId
group by c.clientId;

select * from employee;