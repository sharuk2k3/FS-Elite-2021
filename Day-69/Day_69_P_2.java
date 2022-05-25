/*

Mr Panda is given two words, word-1 and word-2, both are 1-indexed.
He want to transform word-1 into word-2 in S number of steps or less.

Mr Panda is allowed to perfom the opeartion at p-th step ( 1 <= p <= S ):
    - Choose one character at index-q from word-1, and that character at 
      index-b has not been chosen previously, and transfer that character 
      q-steps forward.
    - Or do nothing.

In one step, transfer a character to the next character in [a-z],
circularly, (i.e., after 'z', 'a' will be appeared). 
Transferring a character by q steps means, repeat the above step, q times.

Your task is to return "true", if it's possible to transform word-1 into word-2
in no more than S steps, otherwise return "false".

NOTE: You can choose the character at an index-p at most once.


Input Format:
-------------
Line-1: A string, Word-1
Line-2: A string, Word-2
Line-3: An integer, number of steps S.

Output Format:
--------------
Print a boolean result.


Sample Input-1:
---------------
kmec
kmit
17

Sample Output-1:
----------------
true

Explanation:
------------
In the 4th step, transfer the character 'e' in 4 steps, to get 'i'. 
And in the 17th step, transfer the character 'c' in 17 steps, to get 't'.
Now the word-1 is transformed to word-2 completely,so return "true".

Sample Input-2:
---------------
cock
coke
8

Sample Output-2:
----------------
false

Explanation:
------------
In the 8th step, transfer the character 'c' at 3rd index in 8 steps, to get 'k'. 
There are no more steps left, to transfer 'k' to 'e'. So, return "false".


Sample Input-3:
---------------
cock
coke
20

Sample Output-3:
----------------
true

Explanation:
------------
In the 8th step, transfer the character 'c' at 3rd index in 8 steps, to get 'k'
In the 20th step, transfer the character 'k' at 4th index in 20 steps, 
to get 'e', ('k' to 'z' 15 steps, and 'z' to 'e' 5 steps)
Now the word-1 is transformed to word-2 completely, so return "true".



*/

import java.util.*;

class Day_69_P_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<str1.length();i++){
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            if(c1==c2){
                continue;
            }
            int diff = Math.max(c1,c2)-Math.min(c1,c2);
            boolean flag = false;
            int x = 0;
            while(true){
                int step = 0;
                if(c1<c2){
                    step = x*26+diff;
                }
                else{
                    step = x*26+(26-diff);
                }
                System.out.println(c1+" "+c2+" "+step);
                if(step<=n && !set.contains(step)){
                    set.add(step);
                    flag = true;
                    break;
                }
                if(step>n)
                    break;
                x++;
            }
            if(!flag){
                System.out.print(false);
                return;
            }
        }
        System.out.print(true);
    }
}