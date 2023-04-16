--liquibase formatted sql
--changeset jaisoft:create-tables


--CREATE TABLE WEBSITE_USER(
  -- ID INT NOT NULL,
  -- NAME VARCHAR,
 --  EMAIL VARCHAR,
 --  PRIMARY KEY (ID)
   
-- );

CREATE TABLE WEBSITE_USER (
  ID INT AUTO_INCREMENT,
  NAME VARCHAR(20), 
  EMAIL VARCHAR(20),
  PRIMARY KEY (ID)
  );

