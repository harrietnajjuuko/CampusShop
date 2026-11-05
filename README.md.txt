MAKERERE UNIVERSITY BUSINESS SCHOOL

BACHELOR OF BUSINESS COMPUTING (BBC)

COURSE UNIT: Object-Oriented Programming (OOP)
COURSE CODE: As provided by the department
PROJECT TITLE: CAMPUS SHOP INVENTORY MANAGEMENT SYSTEM
YEAR OF STUDY: YEAR TWO
ACADEMIC YEAR: 2026/2027

GROUP MEMBERS:

1. Name: NAJJUKO HARRIET Registration Number: 25/U/15380/PS
2. Name: AHURIRA MIRACLE Registration Number: 25/U/14863/PS
3. Name: SABANO SERITAH Registration Number: 25/U/15625/PS
4. Name: KALIISA DOREEN Registration Number: 25/U/15081/PS
5. Name: NKINZI GERTRUDE BAYITA gistration Number: 25/U/15575/PS

1.INTRODUCTION

The Campus Shop Inventory Management System is a Java-based application developed to help campus shop attendants manage products and monitor stock levels.

A campus shop deals in different products, such as exercise books, pens, printing papers, flash disks, calculators and other stationery. Managing these products manually can make it difficult to track stock quantities, update prices and retrieve product information.

This project provides a simple solution by allowing the shop attendant to record products, view product information, update product details and monitor available stock.

The application demonstrates important Object-Oriented Programming concepts, particularly classes, objects, encapsulation, getters and setters.

2.OBJECTIVES OF THE PROJECT

The objectives of the project are:

1. To develop a simple Campus Shop Inventory Management System using Java.
2. To create a Product class containing the required product attributes.
3. To apply appropriate access modifiers to protect product information.
4. To implement getter and setter methods for retrieving and updating product details.
5. To create at least five different Product objects.
6. To display product information in an organised format.
7. To update product prices and stock quantities.
8. To apply validation to prevent negative prices and stock quantities.
9. To demonstrate the practical application of Object-Oriented Programming concepts.

3.0 SYSTEM DESIGN AND IMPLEMENTATION

3.1 QUESTION ONE: CLASS DESIGN AND ATTRIBUTES

The Product class was created to represent products sold in the campus shop.

The class contains five attributes:

Attribute| Data type| Description
productId| String| Identifies each product
productName| String| Stores the product name
productCategory| String| Identifies the product category
unitPrice| double| Stores the price of one item
quantityInStock| int| Stores the available stock quantity

Access Modifiers

All five attributes were declared using the private access modifier.

The private modifier prevents other classes from accessing or changing the attributes directly.

This helps protect product information and supports the concept of encapsulation.

Meaningful variable names and appropriate data types were used to make the program easy to understand and maintain.

3.2 QUESTION TWO: GETTERS AND SETTERS

Getter and setter methods were implemented to allow controlled access to the private attributes.

A. Getter Methods

Getters are methods used to retrieve or read information stored in private attributes.

The following getters were implemented:

1. getProductId() – retrieves the product ID.
2. getProductName() – retrieves the product name.
3. getProductCategory() – retrieves the product category.
4. getUnitPrice() – retrieves the unit price.
5. getQuantityInStock() – retrieves the quantity available in stock.

These methods allow the Main class to access product information without directly accessing private attributes.

B. Setter Methods

Setters are methods used to update or change information stored in private attributes.

The following setters were implemented:

1. setProductId() – updates the product ID.
2. setProductName() – updates the product name.
3. setProductCategory() – updates the product category.
4. setUnitPrice() – updates the product price.
5. setQuantityInStock() – updates the stock quantity.

C. Validation

Validation was applied to prevent users from entering incorrect product information.

For example:

- Negative prices are rejected.
- Negative stock quantities are rejected.
- Invalid updates are prevented from replacing valid existing information.

This helps maintain accurate and reliable product records.

3.3 QUESTION THREE: OBJECT CREATION AND INSTANTIATION

A separate Java class named Main was created to execute the application.

Five different Product objects were created to represent products sold in the campus shop.

The objects include:

Object| Product name| Category| Unit price (UGX)| Quantity
product1| Exercise Book| Stationery| 3,000| 50
product2| Pen| Stationery| 1,000| 100
product3| Printing Paper| Stationery| 15,000| 30
product4| Flash Disk| Electronics| 25,000| 20
product5| Calculator| Electronics| 35,000| 15

Each object contains its own independent product information.

For example, changing the price of the exercise book does not automatically change the price of the pen or any other product.

This demonstrates object instantiation and the independent nature of objects in Java.

3.4 148QUESTION FOUR: DISPLAYING AND UPDATING PRODUCT INFORMATION

The application displays the details of all five products in an organised format.

Getter methods are used to retrieve the information before displaying it.

A. Displaying Product Information

The system displays:

- Product ID
- Product name
- Product category
- Unit price
- Quantity in stock

This allows the shop attendant to view the available products and their details.

B. Updating Product Price

The setter method setUnitPrice() is used to update the price of a product.

For example:

The original price of an exercise book is UGX 3,000. The price is changed to UGX 3,500 using the setter method.

C. Updating Stock Quantity

The setter method setQuantityInStock() is used to update the quantity of products available.

For example:

The original stock quantity of pens is 100. It is updated to 150.

D. Displaying Updated Information

After updating the price and stock quantity, the system uses getter methods to retrieve and display the new information.

This demonstrates that the changes have been successfully applied.

E. Demonstrating Invalid Values

The application also demonstrates validation by submitting an invalid value.

For example, when a negative price of -5,000 is submitted, the system rejects the value and displays an appropriate error message.

Similarly, negative stock quantities are rejected.

This prevents incorrect information from being stored in the system.

3.5 QUESTION FIVE: PROGRAM ORGANISATION AND DEMONSTRATION

The program was organised into two main Java classes:

1. Product.java

This class contains the five private attributes, getter methods, setter methods and validation logic.

2. Main.java

This class contains the main method responsible for creating Product objects, displaying product information, updating prices and stock quantities, and demonstrating validation.

Code Organisation

The program uses meaningful variable names and method names to improve readability.

Comments are included where necessary to explain important sections of the code.

The application is designed to compile and execute successfully.

During the demonstration, the group shows how the application creates products, displays their information, updates product details and rejects invalid values.

4.0 OBJECT-ORIENTED PROGRAMMING CONCEPTS DEMONSTRATED

The project demonstrates the following OOP concepts:

4.1 Classes

A class is a blueprint used to create objects.

In this project, Product is the class that defines the attributes and methods of campus shop products.

4.2 Objects

An object is an instance of a class.

The five products created in the Main class are examples of objects.

4.3 Encapsulation

Encapsulation involves protecting data by declaring attributes private and providing public methods to access or modify them.

In this project, encapsulation is achieved through private attributes and public getter and setter methods.

4.4 Getters

Getters retrieve information from private attributes without directly accessing them.

4.5 Setters

Setters update information stored in private attributes while allowing validation to be applied.

5.0 SYSTEM TESTING

The application is tested to establish whether its main functionalities work as expected.

Test performed| Expected result
Create five products| Five different objects are created
Display products| All product details are displayed
Retrieve product information| Getter methods return correct values
Update product price| New price is displayed
Update stock quantity| New quantity is displayed
Enter negative price| Invalid price is rejected
Enter negative stock| Invalid quantity is rejected

The testing process helps identify errors and confirms whether the required system functionalities have been implemented.

6.0 CHALLENGES ENCOUNTERED

Some challenges that may arise during the development of the application include:

1. Understanding how to apply encapsulation in Java.
2. Selecting appropriate data types for product attributes.
3. Implementing getter and setter methods correctly.
4. Applying validation to prevent invalid product information.
5. Ensuring that different objects maintain independent information.

These challenges can be addressed through proper planning, coding, testing and teamwork.

7.0 CONCLUSION

The Campus Shop Inventory Management System demonstrates how Java programming and Object-Oriented Programming concepts can be applied to solve a real-life inventory management problem.

The application provides a simple way of recording products, displaying product information, updating prices and stock quantities, and preventing invalid information.

Through the implementation of classes, objects, encapsulation, getters and setters, the project has helped demonstrate the practical importance of Object-Oriented Programming.

The project also provides an opportunity for group members to develop their Java programming, problem-solving and teamwork skills.

8.0 RECOMMENDATIONS

The following improvements can be considered in future versions of the application:

1. Introduce a database to store product information permanently.
2. Add a search function to make it easier to find products.
3. Introduce a user login system to improve security.
4. Add automatic notifications when stock levels become low.
5. Introduce a sales management feature to track products sold.

These improvements would make the system more efficient and useful for campus shop management.

REFERENCES

1. Object-Oriented Programming (OOP) lecture notes, Makerere University Business School.
2. Java programming concepts and documentation.
3. MUBS OOP Group Take-Home Coursework, Academic Year 2026/2027.