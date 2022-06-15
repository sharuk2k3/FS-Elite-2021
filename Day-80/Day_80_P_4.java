/*

There are few people are in a queue. They are given some boxes of gold coins, 
where coins[i] is number of gold coins in i-th box.

They have planned an idea to share the gold coins in the boxes. 
Each time, the person in the front of the queue, choose any two boxes and grab 
the gold as follows, Suppose the boxes have M and N coins, with M <= N :
- If M == N, the person takes away both the boxes.
- If M != N, the person takes the box with M coins and the M coins from the box
    with N coins, N - M.
- the person leaves the queue.
At the end, there is at most one box left.

Your task is to return the minimum possible coins left in the box. 
If there are no boxes left, return 0.


Input Format:
-------------
A single line comma separated integers, the coins[] array.

Output Format:
--------------
Print an integer result.



Sample Input-1:
---------------
2,7,7,10,2,2

Sample Output-1:
----------------
2

Explanation:
------------
Initially the boxes contains, 2,7,7,10,2,2
- Choose the two boxes with 2 and 7 coins, and left 5 coins in one box, 
  now the boxes are [5,7,10,2,2].
- Choose the two boxes with 5 and 10 coins, and left 5 coins in one box, 
  now the boxes are [7,5,2,2] 
- Choose the two boxes with 5 and 7 coins, and left 2 coins in one box, 
  now the boxes are [2,2,2] 
- Choose the two boxes with 2 and 2 coins, and took both the boxes, 
now the boxes are [2]. They are left with only one box with least coins 2. 


Sample Input-2:
---------------
57,34,43,42,46,36,47

Sample Output-2:
----------------
5




*/


public class Day_80_P_4 {
    
}
