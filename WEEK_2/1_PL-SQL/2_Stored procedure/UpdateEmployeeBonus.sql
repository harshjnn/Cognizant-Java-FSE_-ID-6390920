CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (p_Department IN VARCHAR2, p_BonusRate IN NUMBER) IS
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * p_BonusRate)
    WHERE Department = p_Department;

    COMMIT;
END;
/

BEGIN
    UpdateEmployeeBonus('IT', 0.11);
END;
/

SELECT * FROM Employees;



-- EMPLOYEEID NAME            POSITION    SALARY DEPARTMENT HIREDATE                  
-- ---------- --------------- ----------- ------ ---------- ------------------------- 
-- 1          Alice Johnson   Manager     77000  HR         06/15/2015, 05:30:00 AM   
-- 2          Bob Brown       Developer   66600  IT         03/20/2017, 05:30:00 AM   

-- Elapsed: 00:00:00.006
-- 2 rows selected. 

-- --

