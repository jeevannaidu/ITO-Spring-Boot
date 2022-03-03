create table person
(
 id integer not null,
 name varchar(255) not null,
 location varchar(255),
 birth_date timestamp,
 primary key(id)
);

INSERT INTO PERSON 
   (ID ,NAME,LOCATION,BIRTH_DATE) values
   (1001,'Sateesh','Yalawadahalli',sysdate());
   
INSERT INTO PERSON 
   (ID ,NAME,LOCATION,BIRTH_DATE) values
   (1002,'Vijay','Yalawadahalli',sysdate());
   
INSERT INTO PERSON 
   (ID ,NAME,LOCATION,BIRTH_DATE) values
   (1003,'Lingu','Yalawadahalli',sysdate());