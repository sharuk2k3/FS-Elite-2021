/*
Mr Shravan is given a word W, and W cosists of lowercase alphabets only. 
Mr Shravan is interested to find the substring which is smallest in length 
the which occurs only one in the word W.

Your task is to help Mr Sharavan to return the length of the smallest 
substring of W according to the above statement.

Input Format:
-------------
A String W, consists of lowercase letters.

Output Format:
--------------
An integer result.


Sample Input-1:
---------------
abbaabab

Sample Output-1:
----------------
2


Sample Input-2:
---------------
rererer

Sample Output-2:
----------------
5

 */


import java.util.*;

class Day_83_P_2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<String,Integer>();
        String s = sc.next();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String x = s.substring(i,j);
                map.put(x,map.getOrDefault(x,0)+1);
                
            }
            
        }
        int len = Integer.MAX_VALUE;
        for(String str : map.keySet()){
            if(map.get(str)==1 && str.length() < len){
                len = str.length();
                
            }
            
        }
        
        System.out.println(len);
        
        
    }
    
}