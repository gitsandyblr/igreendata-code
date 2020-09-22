INSERT INTO ACCOUNT_INFO(account_number, account_name, account_type, balance_date, currency, opening_available_balance) VALUES
('585309209', 'SGSavings726', 'Savings', '08/11/2018', 'SGD', 84327.51),
('791066619', 'AUSavings933', 'Savings', '08/11/2018', 'AUD', 88005.93),
('321143048', 'AUCurrent433', 'Current', '08/11/2018', 'AUD', 38010.62),
('347786244', 'SGCurrent166', 'Current', '08/11/2018', 'SGD', 50664.65),
('680168913', 'AUCurrent374', 'Current', '08/11/2018', 'AUD', 41327.28),
('136056165', 'AUSavings938', 'Savings', '08/11/2018', 'AUD', 48928.79),
('453963528', 'SGSavings842', 'Savings', '08/11/2018', 'SGD', 72117.53),
('334666982', 'AUSavings253', 'Savings', '08/11/2018', 'AUD', 20588.16),
('793949180', 'AUCurrent754', 'Current', '08/11/2018', 'AUD', 88794.48),
('768759901', 'AUCurrent294', 'Current', '08/11/2018', 'SGD', 5906.55),
('847257972', 'AUCurrent591', 'Current', '08/11/2018', 'AUD', 92561.68);


INSERT INTO ACCOUNT_TRANSACTION(account_number, account_name, value_date, currency, debit_amount, credit_amount, db_cr_flag) VALUES
('321143048', 'Current Account', 'Jan 12, 2012', 'SGD', 0, 9540.98, 'Credit'),
('321143048', 'Current Account', 'Jan 12, 2012', 'SGD', 0, 4325.98, 'Credit'),
('321143048', 'Current Account', 'Jan 12, 2012', 'SGD', 0, 5435.34, 'Credit'),
('321143048', 'Current Account', 'Jan 12, 2012', 'SGD', 0, 7654.12, 'Credit'),
('321143048', 'Current Account', 'Jan 12, 2012', 'SGD', 0, 9213.12, 'Credit'),
('321143048', 'Current Account', 'Jan 12, 2012', 'SGD', 0, 3452.65, 'Credit'),
('347786244', 'Current Account', 'Jan 12, 2012', 'SGD', 0, 1244.65, 'Credit'),
('347786244', 'Current Account', 'Jan 12, 2012', 'SGD', 0, 7564.12, 'Credit'),
('347786244', 'Current Account', 'Jan 12, 2012', 'SGD', 0, 1287.12, 'Credit'),
('347786244', 'Current Account', 'Jan 12, 2012', 'SGD', 0, 4356.76, 'Credit');