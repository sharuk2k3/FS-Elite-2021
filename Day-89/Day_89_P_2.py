'''


There are a series of bulbs in which some bulbs are turned on(indicated by 1) 
and others are off(indicated by 0).

Return the count of sub-series of bulbs which are turned on.

for example:
1101 -> sub-series are 1,1,1(subseries of length-1),11(sub-series of length-2).
Total=4
Since the answer may be too large, return it modulo 10^9 + 7.

Note: input is given as a string.
 
Input Format:
-------------
Line-1: A string represents the status of series of bulbs.

Output Format:
--------------
return an integer

Sample Input-1:
---------------
11101

Sample Output-1:
----------------
7

Explanation:
------------
subseries are 1,1,1,1,11,11,111.

Sample Input-2:
---------------
101

Sample Output-2:
----------------
2

Explanation:
-------------
sub-series are: 1,1.


'''

'''

#Java Solution:



import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        long i;
        long ans=0,cnt=0;
        double mod=1e9+7;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt((int)i)=='0')
                cnt=0;
            else
            {
                cnt+=1;
                ans+=cnt;
            }
        }
        System.out.print((int)(ans%mod));
    }
}


'''