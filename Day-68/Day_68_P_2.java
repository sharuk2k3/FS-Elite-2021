/*

Mr. Crazy Robert is in a Mall, There are N stalls which are interconnected.
i.e., you can visit a stall-'i',if you visit stall-'i-1' only.

Mr. Robert can start at stall-0 and visit stall-1, stall-2,...,so on.

He is given an array of integers amount[], he need to pay amount[i] to visit 
stall-'i'. And also he is given a coupon worth amount C INR. 
Mr. Crazy Robert can use the coupon atmost once, to pay atmost an amount C INR.

Now, Mr. Crazy Robert task is to visit all the stalls in the mall. He must have 
atleast an amount 1$ with him all the time.

Your task is to find the minimum amount that Crazy Robert need to visit 
all the stalls in the Mall.


Input Format:
-------------
Line-1: Two space separated integers, N and C.
Line-2: N comma separated integers, 

Output Format:
--------------
Print an integer, the minimum amount.



Sample Input-1:
---------------
6 4
1,5,10,8,6,4

Sample Output-1:
----------------
31

Explanation:
------------
One optimal way to visit all the stalls is to start with an amount 31 INR:
At stall-1, pay 1 INR. He has 31 - 1 = 30 INR left.
At stall-2, pay 5 INR. He has 30 - 5 = 25 INR left.
At stall-3, pay 10 INR. He has 25 - 10 = 15 INR left.
At stall-4, pay 8 INR. He has 15 - 8 = 7 INR left.
At stall-5, pay 6 INR. He uses coupon worth 4 and pay 4 INR.
            So, 7 + 4 - 6 = 5 INR left.
At stall-6, pay 4 INR. He has 5 - 4 = 1 INR left.
So, the minimum amount is 31 INR he need to start with.


Sample Input-2:
---------------
6 12
7,7,9,6,2,6

Sample Output-2:
----------------
29


Sample Input-2:
---------------
6 0
7,7,9,6,2,6

Sample Output-2:
----------------
38


*/

import java.util.*;
class Day_68_P_2{
    static int n,arr[],c;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c = sc.nextInt();
        arr = new int[n];
        sc.nextLine();
        String[] x = (sc.nextLine()).split(",");
        int sum = 0;
        for(int i=0;i<x.length;i++){
            arr[i] = Integer.parseInt(x[i]);
            sum += arr[i];
        }
        x=null;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int cur = sum;
            cur -= arr[i];
            cur += (arr[i]>c)?arr[i]-c:0;
            min = Math.min(cur,min);
        }
        System.out.println(min+1);
    }
}
