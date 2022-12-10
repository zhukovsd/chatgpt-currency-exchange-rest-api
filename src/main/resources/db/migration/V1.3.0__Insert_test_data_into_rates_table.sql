-- V1.3.0__Insert_test_data_into_rates_table.sql

-- Insert test data into the rates table
INSERT INTO rates (id, from_currency_id, to_currency_id, rate) VALUES
                                                                   (1, 1, 2, 0.85),
                                                                   (2, 1, 3, 0.75),
                                                                   (3, 1, 4, 105.5),
                                                                   (4, 1, 5, 0.92),
                                                                   (5, 2, 1, 1.18),
                                                                   (6, 3, 1, 1.33),
                                                                   (7, 4, 1, 0.0095),
                                                                   (8, 5, 1, 1.09);