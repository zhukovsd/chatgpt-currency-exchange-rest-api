-- V1.1.0__Create_rates_table.sql

-- Create the rates table
CREATE TABLE rates (
                       id INT  AUTO_INCREMENT,
                       from_currency_id INT NOT NULL,
                       to_currency_id INT NOT NULL,
                       rate FLOAT NOT NULL,
                       PRIMARY KEY (id),
                       FOREIGN KEY (from_currency_id) REFERENCES currencies(id),
                       FOREIGN KEY (to_currency_id) REFERENCES currencies(id)
);