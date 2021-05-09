create table Region (
	city varchar(15),
    state varchar(15),
    country varchar(15),
    primary key(city, state, country)
);

create table Address (
	location_id int primary key,
	street_address varchar(30) not null,
    city varchar(15),
    state varchar(15),
    country varchar(15),
    foreign key(city, state, country) references Region(city, state, country)
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

create table Roles (
	role_name varchar(20) primary key
);

create table Work_Status (
	status_name varchar(20) primary key
);

create table Status_Flow (
	status_flow_id integer primary key,
	status_from varchar(20),
    status_to varchar(20),
    foreign key(status_from) references Work_Status(status_name),
    foreign key(status_to) references Work_Status(status_name)
);

create table Project (
	project_id integer primary key,
    project_name varchar(20) not null,
    project_description varchar(100),
    project_price double not null,
    project_manager integer,
    client_id integer,
    foreign key (client_id) references Clients(client_id),
    foreign key (project_manager) references Employee(employee_id)
);

create table Task (
	task_id int primary key,
    status varchar(10) not null,
    task_description blob not null,
	task_created_at datetime not null,
    project_id integer not null,
    assigned_to integer not null,
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
