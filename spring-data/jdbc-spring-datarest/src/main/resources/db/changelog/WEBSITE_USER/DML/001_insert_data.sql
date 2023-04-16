--liquibase formatted sql
--changeset techgeeknext:inset-employee-01
INSERT INTO WEBSITE_USER VALUES('name1', 'email1');
INSERT INTO WEBSITE_USER VALUES('name2', 'email2');
INSERT INTO WEBSITE_USER VALUES( 'name3', 'email3');
INSERT INTO WEBSITE_USER VALUES( 'name4', 'email4');