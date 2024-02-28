 # Summary
 * [About the project](#about-the-project)
 * [How to run](#how-to-run)
 * [Window application](#window-application)

## About the project
Final project of the discipline Laboratory of Database at UNIFEI (Federal University of Itajubá). The goal is to practice concepts from programming (Java) and database 
(object-relational persistence and MySQL). This project is a continuation of the design patterns in Java (https://github.com/MateusAMSouza/software-design-patterns-israel).
The modeling and classes were adapted, reducing the number of classes and the design patterns, removed. After that, two applications were required: Terminal-based 
application to persist all concrete classes in the database and Window-based application using Java Swing library containing insertion, change and removal in the database 
of 1 class that contains 1 or more associative relationships.
The tools used were Xampp Control Panel and MySQL via phpMyAdmin and Apache Maven on Eclipse IDE.

## How to run
To run the program, after clonning, I recommend opening the folder in Eclipse IDE. After this, start Apache and MySQL (Admin) via Xampp Control Panel. At phpMyAdmin, add an 
user according to the credentials in lines 28 and 29 from the _persistance.xml_ file and grant all privileges to this user. Finally, compile the project and run the _App.java_
file. If the database is already created and you're updating the code, modify the value in line 36 from persistance to "none". 

## Window application
The files from Java Swing are the second application in the project description. They insert, update or remove elements from the class "Festa" (Festivals of Israel in the Old 
Testament). Here are some examples alongside the phpMyAdmin page:
![Captura de tela 2024-02-28 194043](https://github.com/MateusAMSouza/database-mysql-israel/assets/95110193/57ef351a-fcc5-4f1a-ad15-50d21521ccc7)
![Captura de tela 2024-02-28 194702](https://github.com/MateusAMSouza/database-mysql-israel/assets/95110193/ab806b00-63af-4afa-ad2e-c037897870ae)
![Captura de tela 2024-02-28 194820](https://github.com/MateusAMSouza/database-mysql-israel/assets/95110193/dfc1c968-feee-4888-afab-f719ff34836d)
