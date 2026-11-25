-- Create database hcl_practice;
-- USE hcl_practice;
-- create table Departments(
--     dept_id int primary key,
--     dept_name varchar(50),
--     dept_location varchar(50)
-- );

-- create table Trainers(
--     faculty_id int primary key,
--     faculty_name varchar(50) ,
--     designation varchar(50),
--     mobile_no int,
--     experience int,
--     salary double check(salary>0),
--     dept_id int ,
--     foreign key (dept_id) references Departments(dept_id) 
-- );

-- alter table Trainers
-- add column age int check(age>18)

-- alter table Trainers
-- modify faculty_id int AUTO_INCREMENT;



-- ALTER TABLE Trainers 
-- DROP FOREIGN KEY trainers_ibfk_1;

-- ALTER TABLE Departments 
-- MODIFY dept_id INT AUTO_INCREMENT;


-- ALTER TABLE Trainers 
-- ADD FOREIGN KEY (dept_id) REFERENCES Departments(dept_id);

-- -------------------------------------------------------------------------------------------------------------------


-- create database school_db;
use school_db;
-- create table students(
--     student_id int AUTO_INCREMENT PRIMARY key,
--     name varchar(50) not null,
--     email varchar(100) unique,
--     age int check(age>5),
--     city varchar(50) DEFAULT "Delhi",
--     admission_date DATE


-- )
-- create table marks(
--     mark_id int primary key,
--     student_id int, FOREIGN KEY(student_id) REFERENCES students(student_id),
--     subject varchar(50),
--     score int
-- );

-- alter table students
-- add column phone bigint;

-- alter table students
-- modify phone varchar(15);

-- alter table students 
-- rename column city to hometown

-- CREATE index index_student_id
-- on students(name);

-- create table students_backup as select * from students;

-- TASK 1

-- INSERT INTO students (name, email, age, hometown, admission_date, phone) VALUES
-- ('Aarav Sharma', 'aarav.sharma@example.com', 15, 'Delhi', '2025-04-10', '9876543210'),
-- ('Ananya Verma', 'ananya.verma@example.com', 14, 'Noida', '2025-04-12', '9876543211'),
-- ('Rohan Gupta', 'rohan.gupta@example.com', 16, 'Ghaziabad', '2025-04-15', '9876543212'),
-- ('Priya Singh', 'priya.singh@example.com', 13, 'Lucknow', '2025-04-18', '9876543213'),
-- ('Kabir Mehta', 'kabir.mehta@example.com', 17, 'Mumbai', '2025-04-20', '9876543214'),
-- ('Isha Patel', 'isha.patel@example.com', 15, 'Ahmedabad', '2025-05-01', '9876543215'),
-- ('Vikram Nair', 'vikram.nair@example.com', 16, 'Bengaluru', '2025-05-03', '9876543216'),
-- ('Sneha Reddy', 'sneha.reddy@example.com', 14, 'Hyderabad', '2025-05-05', '9876543217'),
-- ('Aditya Joshi', 'aditya.joshi@example.com', 12, 'Pune', '2025-05-08', '9876543218'),
-- ('Kavya Tiwari', 'kavya.tiwari@example.com', 15, 'Prayagraj', '2025-05-10', '9876543219'),
-- ('Arjun Malhotra', 'arjun.malhotra@example.com', 17, 'Chandigarh', '2025-05-12', '9876543220'),
-- ('Meera Iyer', 'meera.iyer@example.com', 13, 'Chennai', '2025-05-15', '9876543221'),
-- ('Devansh Yadav', 'devansh.yadav@example.com', 16, 'Kanpur', '2025-05-18', '9876543222'),
-- ('Riya Kapoor', 'riya.kapoor@example.com', 14, 'Jaipur', '2025-05-20', '9876543223'),
-- ('Siddharth Jain', 'siddharth.jain@example.com', 15, 'Indore', '2025-05-22', '9876543224');


-- INSERT INTO marks (mark_id, student_id, subject, score) VALUES
-- (1, 1, 'Maths', 88),
-- (2, 1, 'Science', 92),
-- (3, 1, 'English', 85),
-- (4, 2, 'Maths', 76),
-- (5, 2, 'Science', 81),
-- (6, 3, 'English', 90),
-- (7, 4, 'Maths', 95),
-- (8, 5, 'Science', 84),
-- (9, 6, 'English', 78),
-- (10, 7, 'Maths', 82),
-- (11, 8, 'Science', 89),
-- (12, 9, 'English', 91);

-- TAsK 2

-- update marks 
-- set score =score +5
-- where subject="Maths";

-- update students
-- set age=age+1
-- where  hometown ="Delhi"

-- select * from marks WHERE student_id=6;

-- delete from students
-- where student_id=6;


-- delete from marks
-- where score < 20;



