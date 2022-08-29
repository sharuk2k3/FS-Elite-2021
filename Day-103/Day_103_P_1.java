/*Clavius, the person who suggested grouping of data using brackets.
He has suggested that the group of brackets should be Well-Formed.

A string is said to be Well-Formed, if:
    - The string is empty.
    - The string can be written as MN, (M is appended to N), 
      where M and N are Well-Formed Strings, or
    - The string can be written as [M], where M is Well-Formed string.

You will be given a string B, consists of square brackets only '[' , ']'.
In one operation, you can insert one square bracket at any position of B.
i.e., Given B = [][]], in one operation you can add a open square bracket,
now B can be Well-Formed string, if you add at index 0,1,2,3,4 =>
[[][]], [][[]], [][][], and not a Well-Formed string if you add last postion.

Your task is to return the least number of operations required,
to make B as a Well-Formed string.

Input Format:
-------------
A string, B contains only characters []

Output Format:
--------------
Print an integer value.


Sample Input-1:
---------------
[]]][


Sample Output-1:
----------------
3


Sample Input-2:
---------------
[]][[]]

Sample Output-2:
----------------
1


*/


import java.util.*;

class Day_103_P_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int res = 0;
        int count = 0;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c=='['){
                count++;
            }
            else{
                if(count==0){
                    res++;
                }
                else{
                    count--;
                }
            }
        }
        res += count;
        System.out.print(res);
    }
} 