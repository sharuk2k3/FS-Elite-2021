/*

There are some soldiers formed in a line from Kunthala and Mahishmathi 
together, the soldiers from Kunthala indiacted with 0's and from Mahishmathi 
indiacted with 1's. 

You are given the order of soldiers as an array soldiers[], 
consist of 0's an 1's only. Your task is to find out the number of contiguous
arrays can be formed, which contains more number of the soldiers 
from Mahishmathi than the soldiers from Kunthala.

Input Format:
-------------
Space separated integers, 0's and 1's only, soldiers[]

Output Format:
--------------
Print an integer result.


Sample Input-1:
---------------
1 0 1 1 0

Sample Output-1:
----------------
9

Explanation:
------------
The Contiguous subarrays having more ones than zeros are as follows:
with size-1: [1], [1], [1]
With size-2: [1,1]
With size-3: [1,0,1], [0,1,1], [1,1,0]
With size-4: [1,1,0,1]
With size-5: [1,1,0,1,0]



*/

import java.util.*;


class Day_70_P_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] arr = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        int res = 0;
        for(int i=0;i<arr.length;i++){
            int count0 = 0;
            int count1 = 0;
            for(int j=i;j<arr.length;j++){
                if(arr[j]==0)
                    count0++;
                else
                    count1++;
                if(count1>count0)
                    res++;
            }
        }
        System.out.print(res);
    }
}