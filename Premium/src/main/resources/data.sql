/* Region  */
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