-- V1.0.0__Create_currencies_table.sql

-- Create the currencies table
CREATE TABLE currencies (
                            id INT NOT NULL AUTO_INCREMENT,
                            code VARCHAR(3) NOT NULL,
                            name VARCHAR(255) NOT NULL,
                            PRIMARY KEY (id)
);