'''

Sreehan is a young programmer, wants to solve the new kind of challenges 
through coding.

He is given a set of distinct positive numbers,
He need to find the number of valid quadruples can be formed with the given set.

The rules to form a valid qudraples are as follows:
    - Quadrule contains 4 elements [k, l, m, n]
    - where [k * l] = [m * n]
    - and k != l != m != n

Can you please help Sreehan, in solving this challenge!

Input Format:
-------------
Line-1: An integer N, number of elements in the set.
Line-2: N space seperated distinct integers, Set.

Output Format:
--------------
Print an integer, Number of Valid Quadruples.


Sample Input-1:
---------------
5
3 2 4 1 6

Sample Output-1:
----------------
16

Explanation:
-------------
There are 16 valid Quadrules:
(2,3,1,6) , (2,3,6,1) , (6,1,3,2) , (6,1,2,3)
(3,2,1,6) , (3,2,6,1) , (1,6,3,2) , (1,6,2,3)
(2,6,3,4) , (2,6,4,3) , (6,2,3,4) , (6,2,4,3)
(3,4,2,6) , (4,3,2,6) , (3,4,6,2) , (4,3,6,2)


Sample Input-2:
---------------
4
2 3 5 7

Sample Output-2:
----------------
0



'''

#CPPSOLUTION

'''
#include<bits/stdc++.h>
using namespace std;

int quadraples(vector<int>& nums)
{
    int ans=0;
    unordered_map<int,int>mp;
    for(int i=0;i<nums.size();i++)
      for(int j=i+1;j<nums.size();j++)
          mp[nums[i]*nums[j]]++;

    for(auto x:mp)
    {
      int k=x.second;
      ans+=4*k*(k-1);
    }
    return ans;
}

int main()
{
    int n; cin>>n;
    int a[n];
    for(int i=0;i<n;i++) cin>>a[i];
    cout<<quadraples(n,a);
}
'''