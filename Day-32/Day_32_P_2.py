'''

In a class of N students, each student has secured different marks in 
final exams, and different levels of decency, 
The students are numbered from 0,1,2,.. N-1.

The class teacher defines, compMarks[i] = [p,q], indiactes 
Student-p secured more marks than Student-q. This information is 
provided based on valid observations only. And, decentScore[p] = d, 
indicates Student-p has decency level- d.

Your task is to find and return the result[] as follows:
	- result[p] = q, where Student-q has the least level of decency
	  [i.e., the student-q with the smallest value of decentScore[q] ]
	  among all the students who scores >= Student-p.


Input Format:
-------------
Line-1: An integer N, number of students.
Next 'N-1' lines: Two space separated integers p and q, compMarks[i] = [p, q] 
Last Line: N space separated integers, decentScore[].

Output Format:
--------------
Print N space separated integers as result


Sample Input-1:
---------------
6
1 3
2 4
3 5
0 3
3 4
4 2 6 8 3 1

Sample Output-1:
----------------
0 1 2 1 1 5

Explanation:
------------
result[3] = 1.
Student-1 has secured more marks than Student-3,
Student-0 has secured more marks than Student-3.
Among [1, 0], the only Student who has least decentScore is Student-1.

result[4] = 1.
Student-1 has secured more marks than Student-3, who secured more marks than 3.
Student-2 has secured more marks than Student-4.
Among [1,2,3], the only Student who has least decentScore is Student-1.


'''

#Solution:

from collections import defaultdict 

def Results(compMarks, decentScore):
    graph = defaultdict(list)
    n = len(decentScore)
    res = [-1]*n
            
    for u,v in compMarks:
        graph[v].append(u)
            
    def dfs(u):
        if res[u] == -1:
            res[u] = min([dfs(v) for v in graph[u]]+[u], key=lambda x: decentScore[x], default = u)
        return res[u]
                                
    return [dfs(u) for u in range(n)]
    
n = int(input())
compMarks = []
for _ in range(n-1):
    p, q = map(int, input().split())
    compMarks.append([p, q])
decentScore = list(map(int, input().split()))
print(Results(compMarks, decentScore))