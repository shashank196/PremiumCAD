/* Address  */
Insert into Address (address_id, street_address, city, state, country) values (1001, 'b-145 yamuna vihar', 'Delhi', 'Delhi', 'India');
Insert into Address (address_id, street_address, city, state, country) values (1002, '1c1 hal city', 'Bangalore', 'Karnataka', 'India');
Insert into Address (address_id, street_address, city, state, country) values (1003, '120 metropolis e-city', 'Bangalore', 'Karnataka', 'India');
Insert into Address (address_id, street_address, city, state, country) values (1004, '1 flora', 'Faridabad', 'Haryana', 'India');
Insert into Address (address_id, street_address, city, state, country) values (1005, '45 bawana street', 'Faridabad', 'Haryana', 'India');
Insert into Address (address_id, street_address, city, state, country) values (1006, '78 no idea', 'New York City', 'New York', 'USA');
Insert into Address (address_id, street_address, city, state, country) values (1007, '24 us state', 'New York City', 'New York', 'USA');

/* Clients  */
Insert into Clients (client_id, client_name, contact_number, email_id, location_id) values (1, 'Shashank', '9013214213', 'safanfk@af.com', 1001);
Insert into Clients (client_id, client_name, contact_number, email_id, location_id) values (2, 'Himanshu', '1234567890', 'abcdef@gmail.com', 1002);
Insert into Clients (client_id, client_name, contact_number, email_id, location_id) values (3, 'Jatin', '2345678921', 'dfnn@gmail.com', 1006);


/* Employees  */
insert into employee (employee_id, name, email_id, contact_number, location_id) values (1,'Sagar','abcd@gmail.com','1234567899',1001);
insert into employee (employee_id, name, email_id, contact_number, location_id) values (2,'Kushagra','bcde@gmail.com','123',1001);
insert into employee (employee_id, name, email_id, contact_number, location_id) values (3,'Ayush','cdef@gmail.com','5244235848',1002);
insert into employee (employee_id, name, email_id, contact_number, location_id) values (4,'Rohit','defg@gmail.com','123545812',1002);
insert into employee (employee_id, name, email_id, contact_number, location_id) values (5,'Ashish','efgh@gmail.com','212155',1003);
insert into employee (employee_id, name, email_id, contact_number, location_id) values (6,'Baba','fghi@gmail.com','8751122585',1003);
insert into employee (employee_id, name, email_id, contact_number, location_id) values (7,'Mohit','ghij@gmail.com','5456122288',1004);
insert into employee (employee_id, name, email_id, contact_number, location_id) values (8,'Abhishek','hijk@gmail.com','41511255252',1003);


/* Projects  */
Insert into project (project_id, project_name, project_description, project_price, client_id, employee_id) values (101,'premium','abcd denfbfn ajsfjn',100,1,1);
Insert into project (project_id, project_name, project_description, project_price, client_id, employee_id) values (102,'project_x','',10000,1,2);
Insert into project (project_id, project_name, project_description, project_price, client_id, employee_id) values (103,'premiumcad','abcd denfbfnasf ajsfjn',10.00,2,2);
Insert into project (project_id, project_name, project_description, project_price, client_id, employee_id) values (104,'pro','abcd',5845.45,3,3);


/* work flow */
Insert into work_status_from (status_from) VALUES ('start');
Insert into work_status_from (status_from) VALUES ('in progress');
Insert into work_status_from (status_from) VALUES ('quality check');
Insert into work_status_from (status_from) VALUES ('quality assurance');


Insert into work_status_to (status_to) VALUES ('in progress');
Insert into work_status_to (status_to) VALUES ('quality assurance');
Insert into work_status_to (status_to) VALUES ('quality check');
Insert into work_status_to (status_to) VALUES ('done');


Insert into status_flow (status_flow_id, status_from, status_to) values (1,'start','in progress');
Insert into status_flow (status_flow_id, status_from, status_to) values (2,'start','done');
Insert into status_flow (status_flow_id, status_from, status_to) values (3,'in progress','done');
Insert into status_flow (status_flow_id, status_from, status_to) values (4,'in progress','quality check');
Insert into status_flow (status_flow_id, status_from, status_to) values (5,'quality check','quality assurance');
