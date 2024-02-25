CREATE DATABASE SandwichIMS;

USE SandwichIMS;

CREATE TABLE Sales (
	SaleID INT AUTO_INCREMENT PRIMARY KEY,
    SaleDate DATE
);


CREATE TABLE Product (
	ProductID INT AUTO_INCREMENT,
    ProductName VARCHAR(50),
    LastUpdated DATETIME,
    Quantity INT
);


CREATE TABLE SaleProduct (
	SaleID INT,
    ProductID INT,
    Quantity INT,
    FOREIGN KEY (SaleID) REFERENCES Sale(SaleID),
    FOREIGN KEY (ProductID) REFERENCES Product(ProductID),
    PRIMARY KEY (SaleID, ProductID)
);


CREATE TABLE Employee (
	employeeID INT AUTO_INCREMENT PRIMARY KEY,
    firstName VARCHAR(50),
    lastName VARCHAR(50)
);


CREATE TABLE InventoryEmployee (
	employeeID INT,
    accessGranted DATE,
    isManager BOOLEAN,
    PRIMARY KEY (employeeID),
    FOREIGN KEY (employeeID) REFERENCES Employee(employeeID)
);



