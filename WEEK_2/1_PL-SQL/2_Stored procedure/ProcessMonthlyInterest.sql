CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01),
        LastModified = SYSDATE
    WHERE AccountType = 'Savings';

    COMMIT;
END;
/

BEGIN
    ProcessMonthlyInterest;
END;
/

SELECT * FROM Accounts;



-- ACCOUNTID CUSTOMERID ACCOUNTTYPE BALANCE LASTMODIFIED              
-- --------- ---------- ----------- ------- ------------------------- 
-- 1         1          Savings     1020.1  06/27/2025, 01:22:47 PM   
-- 2         2          Checking    5500    06/27/2025, 01:22:47 PM   







