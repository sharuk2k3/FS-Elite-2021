'''


There are N students stands in a row, where students from ABC school indicated 
with 0's and students from XYZ school indicated with 1's. Trainer asks them 
to stand alternatively according to the school they belongs to. 
[i.e., No two students from same school stands side by side]

You are allowed to perform these operations to arrange them to sit alternatively:
Op-1: Move the first student in the row to the end of the row. 
Op-2: Choose any one student in the row, Shift the student from the current 
      school to other school. 
    [i.e., shift from ABC school to XYZ school or vice-versa]
    
You will be given the initial standing positions of students as a binary string. 
Your task is to find and return the minimum number of Op-2 operations required 
to arrange them to stand alternatively with the above rules.


Input Format:
-------------
A binary string B.

Output Format:
--------------
Print an integer result.


Sample Input-1:
---------------
1100100

Sample Output-1:
----------------
2

Explanation:
------------
Perform Op-1 operation 3 times: The sitting will be 0100110.
Perform Op-2 operation: at 4th and 5th positions in the row.
Finally, sitting is 0101010


Sample Input-2:
---------------
11011

Sample Output-2:
----------------
1


'''

def minOperations(s):
    n = len(s)
    ss = s + s
    nn = 2 * n
    s1 = ['0' if i % 2 else '1' for i in range(nn)]
    s2 = ['1' if i % 2 else '0' for i in range(nn)]
        
    count1 = count2 = 0
    for i in range(n):
        if s1[i] != ss[i]: count1 += 1
        if s2[i] != ss[i]: count2 += 1
        
    result = min(count1, count2)
    for i in range(n, nn):
        if s1[i] != ss[i]: count1 += 1
        if s2[i] != ss[i]: count2 += 1
        if s1[i-n] != ss[i-n]: count1 -= 1
        if s2[i-n] != ss[i-n]: count2 -= 1
        result = min(result, count1, count2)
    return result

s=input()
print(minOperations(s))