/*
Write a SQL query to display the name(s) of the employee(s) who are getiing 
second highest salary.

Sample Output:
--------------
ename                                                                                                                   
FORD                                                                                                                    
                                                                                                   

*/


select ename from emp where sal = (select max(sal)from emp where sal<(select max(sal) from emp));