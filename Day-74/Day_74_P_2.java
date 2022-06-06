/*

There are N tourist places in India, where some are connected with each other 
through Airways and some or not. You will be given the Airways as routes[] array, 
where routes[i]=[X,Y], there is an direct airway route between place-X to place-Y 
and vice versa.

Reachability Score of two tourist places is defined as the total number of direct 
airway routes to any tourist place. If there is a common airway route between both
the tourist places, it is counted only once.

Your task is to find and return the maximum reachability score between any pair 
of tourist places among the N tourist places in INDIA.

Input Format:
-------------
Line-1:Two space separated integers, N number of places, and R number of routes.
Next R lines: Two space separated integers, X and Y. 

Output Format:
--------------
Print an integer, maximum reachability score.


Sample Input-1:
---------------
5 6
0 1
1 2
0 4
1 4
2 4
3 4

Sample Output-1:
----------------
6

Explanation:
------------
The Reachability Score of the tourist places place-1 is 3 and place-4 is 4 .
There is a common route between place-1 and place-4,
So, the maximum reachability score is 3+4-1 = 6.


Sample Input-2:
---------------
8 9
0 1
1 2
0 3
1 3
2 3
4 5
6 5
5 7
4 7

Sample Output-2:
----------------
6



*/
//Solution:

import java.util.*;

public class Day_74_P_2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), r = sc.nextInt();
        int routes[][] = new int[n][n];
        int counts[] = new int[n];
        
        for(int i=0; i<r; i++)
        {
            int x = sc.nextInt(), y = sc.nextInt();
            routes[x][y] = 1;
            routes[y][x] = 1;
            counts[x]++;
            counts[y]++;
        }
        
        int res = Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                if(i!=j)
                    res = Math.max(res, counts[i]+counts[j]-routes[i][j]);
        
        System.out.println(res);
    }
}
