DROP TABLE IF EXISTS ACCOUNT_TRANSACTION;
DROP TABLE IF EXISTS ACCOUNT_INFO;


CREATE TABLE ACCOUNT_INFO(
    account_number VARCHAR NOT NULL,
    account_name VARCHAR NOT NULL,
    account_type VARCHAR NOT NULL,
    balance_date VARCHAR NOT NULL,
    currency VARCHAR NOT NULL,
    opening_available_balance FLOAT DEFAULT NULL,
    PRIMARY KEY (account_number)
);

CREATE TABLE ACCOUNT_TRANSACTION(
    acct_tran_id INT AUTO_INCREMENT PRIMARY KEY,
    account_number VARCHAR NOT NULL,
    account_name VARCHAR NOT NULL,
    value_date VARCHAR NOT NULL,
    currency VARCHAR NOT NULL,
    debit_amount FLOAT DEFAULT NULL,
    credit_amount FLOAT DEFAULT NULL,
    db_cr_flag VARCHAR DEFAULT NULL,
    tran_narrative  VARCHAR(255) DEFAULT NULL,
    FOREIGN KEY (account_number) REFERENCES PUBLIC.ACCOUNT_INFO(account_number)
);