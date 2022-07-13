'''

Ravi is playing with strings.Given Three alphabets [a,b,c] , ravi has to 
make strings such that no two adjacents alphabets are same.

For example, He can make strings as "ab", "acb", "b" and "cbabcabcb" which 
are acceptable.where as the strings "bb", "bcc" and "aabbc" are not acceptable.

Given two integers N and L, Ravi made a list of all acceptable strings of 
length N sorted in lexicographical order.

Return the Lth string of this list or return an empty string if there are less 
than L acceptable strings of length N.

Input Format:
-------------
Line-1: Two space separated integers N and L.

Output Format:
--------------
Print a string result.


Sample Input-1:
---------------
2 3

Sample Output-1:
----------------
ba

Explanation:
-------------
Strings in lexigraphical order are ab,ac,ba,bc,ca,cb. and 3rd one is ba.


Sample Input-2:
---------------
3 4

Sample Output-2:
----------------
acb

Explanation:
------------
Strings in lexigraphical order are aba,abc,aca,acb,bab....


'''
#Solution:
def lexiString(n, k) :
    subsets = []
    letters = ['a','b','c']
        
    def genComb(subset,prev,n):         
        if n==0:
            subsets.append("".join(subset))
            return
          
        for l in letters:
            if l!= prev:
              subset.append(l)
              genComb(subset,l,n-1)
              subset.pop()
              
    genComb([],"*",n)
        
    if len(subsets)<k:
        return ""
        
    return subsets[k-1]

if __name__ == '__main__':
    n,k=map(int,input().split())
    print(lexiString(n,k))
