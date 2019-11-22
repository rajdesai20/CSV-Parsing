CSV File Parser

Overview of project
This project is created for Coding Challenge of Mountain State Software Solutions. This is Java application which parses a Csv file and removes the records which are bad and places them in another csv file. The records which are good are stored in database. At the end of the application a log file is generated which shows the number of total records, received records and the bad records. 
The application will set a record as bad if the record has less data elements than the number of columns or if a data element is empty. The bad records are stored in a new csv file which is generated during the application runtime. The requirements for this application an input csv file and the name of the csv file. 
This application can run any Java IDE which support Maven with a database connectivity. 

Assumptions
•	The path to the csv file is src/main/resources folder.
•	The user is able enter the name of the csv file at the start of the application. 
•	The user should have active internet connection as some libraries need to download to run this application.

Technologies
•	Eclipse
•	Maven
•	Hibernate
•	SQLite Database


Process
1.	The main class is in the App.java file, so this file should to run on IDE first.
2.	At start of the application user will prompted to enter the name of the input csv file (without the extension).
3.	After entering the application will start parsing the data. During the parsing the good record will be stored in the database and bad record will get entered into a new csv file.
4.	When the parsing is done, a .db file will generated with the input file name and it can be accessed using SQLite tools like DB browser.
5.	The log file and bad record csv file with the same name will be generated and can be found in same folder where the input file was kept.



Conclusion:
I have created a Maven project in Eclipse IDE to parse a csv file. For database manipulation the Hibernate Framework, as it requires less effort and is efficient. The SQLite database is used due to its in-memory capabilities.



