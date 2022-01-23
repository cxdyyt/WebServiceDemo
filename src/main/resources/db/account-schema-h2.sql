DROP TABLE IF EXISTS account;
CREATE TABLE account(
   id INT PRIMARY KEY auto_increment,
   name VARCHAR(255),
   gender char(10),
   birthday date
);