## **Lingu App**

The app is made for learning english vocabulary and its trasnlation to polish language. It has two major functionalities:
* adding new words to the database,
* language test that involves correct translation of randomly generated words from the database.

The core of Lingu App together with the main logic of the application has been prepared originally by the creator of the course. My task was to add some functionalities to the app, which will facilitate adding changes to the code in the future. Changes introduced by me:
* adding Spring dependency to the project and use dependency injection where necessary
* adding an option of text formatting to upper case
* adding production and developer profiles, and also adding text encryption in production profile using Caesar cipher

### **Technology used:**
* Java
* SpringBoot

### **How to run:**
1. Clone the repository onto your own computer.

2. Go to the main folder of the project and run this command:

*for the Unix system:
```
./mvnw spring-boot:run
```
*for the Windows CMD:
```
mvnw.cmd spring-boot:run
```
