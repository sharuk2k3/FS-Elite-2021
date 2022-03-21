/*
Write an SQL query to display the job groups having total salary greater than 
the maximum salary of managers.

Sample Output:
--------------
job     sum(sal)                                                                                                        
ANALYST 6000.00

*/

select job,sum(sal) from emp group by job 
having sum(sal) >(select max(sal) 
from emp where job='MANAGER');