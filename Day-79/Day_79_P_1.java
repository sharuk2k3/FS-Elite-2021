/*

In Turkey, an ice cream parlour given an offer to a lucky kid.
The parlour keep N icecream cups in a row, and there are different flavours 
of icecreams, where i-th cup filled with the flavour[i] type of ice cream.

The kid can pick the continuous set of ice cream cups, where the cups filled
with the icecreams of atmost two different flavours. The kid wants to 
pick maximum number of icecream cups from the row.

You will be given the integer array, flavours[] of size N.
Your task is to help the kid to pick the maximum number of icecream cups 
with atmost two different flavours.


Input Format:
-------------
Line-1: An integer, number of icecreams.
Line-2: N space separated integers, flavours[] 

Output Format:
--------------
Print an integer result, maximum number of icecream cups can be picked.


Sample Input-1:
---------------
10
1 2 3 1 1 3 3 2 3 2

Sample Output-1:
----------------
5

Explanation:
------------
The kid can pick the continuous set of icecream cups as follows: 3 1 1 3 3
Where the cups are filled with two different flavours, 1 and 3.



Sample Input-2:
---------------
10
2 1 1 3 2 1 3 0 0 3

Sample Output-2:
----------------
4



*/


import java.util.*;
class Day_79_P_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(Fruits(arr));
    }
    
    public static int Fruits(int[] fruits){
        int maxLen=0; int i=0,j=0;
        HashMap<Integer,Integer> h=new HashMap<>();

        while(j<fruits.length){
        h.put(fruits[j],h.getOrDefault(fruits[j],0)+1);
        while(h.size()>2){
            h.put(fruits[i],h.get(fruits[i])-1);
            if(h.get(fruits[i])==0)
                h.remove(fruits[i]);
            i++;
        }
        maxLen=Math.max(maxLen, j-i+1);
        j++;
        }   
    return maxLen;
    }
}