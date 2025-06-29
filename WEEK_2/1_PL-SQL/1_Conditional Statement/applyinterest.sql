BEGIN
    FOR res IN (
        SELECT c.name, c.customerID, l.loanID, l.InterestRate
        FROM LOANS l
        JOIN CUSTOMERS c ON l.CUSTOMERID = c.CUSTOMERID
        WHERE TRUNC(MONTHS_BETWEEN(SYSDATE, c.DOB)/12) > 60
    ) LOOP
        UPDATE LOANS
        SET InterestRate = res.InterestRate - 1
        WHERE loanID = res.loanID;
    END LOOP;

    COMMIT;
END;
/