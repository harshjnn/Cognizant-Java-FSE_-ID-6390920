CREATE OR REPLACE PROCEDURE TransferFunds (FromAccountId IN NUMBER, ToAccountId IN NUMBER, Amount IN NUMBER) IS
    v_SourceBalance NUMBER;
    ex_InsufficientFunds EXCEPTION;
BEGIN
    SELECT Balance INTO v_SourceBalance
    FROM Accounts
    WHERE AccountID = FromAccountId;

    IF v_SourceBalance < Amount THEN
        RAISE ex_InsufficientFunds;
    END IF;

    UPDATE Accounts
    SET Balance = Balance - Amount,
        LastModified = SYSDATE
    WHERE AccountID = FromAccountId;

    UPDATE Accounts
    SET Balance = Balance + Amount,
        LastModified = SYSDATE
    WHERE AccountID = ToAccountId;

    COMMIT;

EXCEPTION
    WHEN ex_InsufficientFunds THEN
        DBMS_OUTPUT.PUT_LINE('Transfer failed: Insufficient balance.');
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
END;
/

BEGIN
    TransferFunds(1, 2, 500);
END;
/

SELECT * FROM Accounts;


  

-- OUTPUT-----

-- ACCOUNTID CUSTOMERID ACCOUNTTYPE BALANCE LASTMODIFIED              
-- --------- ---------- ----------- ------- ------------------------- 
-- 1         1          Savings     520.1   06/27/2025, 01:24:34 PM   
-- 2         2          Checking    6000    06/27/2025, 01:24:34 PM   

-- Elapsed: 00:00:00.001
-- 2 rows selected. 