/* 


In the world, some places are part of some other places like

Hyderabad is part of Telangana, Telangana is part of India, etc.

 

You are given the list of N such combination of places.

Where each combination includes places like X-Y-Z

Where Y is part of X and Z is part of Y. So, X is bigger than Y

and Y is bigger than Z. So Z is also part of X and X is part of itself.



If you given the places like X1, X2, X3, such that X3 is part of X1,  

It is guaranteed there is no X2 such that X3 is part of X2.



You are also given another two places P1 and P2, Your task is to 

find the smallest common place that conatains both P1 and P2 as part of it.



NOTE:

It is guaranteed that always a solution exists.



Input Format:

-------------

Line-1: An integer N.

Next N lines: '-' separated strings, one combination of places.



Output Format:

--------------

Print a string, the smallest common place.





Sample Input-1:

---------------

4

Bharath-Telangana-Hyderabad-Dilshukhnagar

Telangana-Rangareddy-Lbnagar

Hyderabad-Dilshukhnagar-Gaddiannaram

Rangareddy-Lbnagar-Saroornagar

Gaddiannaram

Saroornagar



Sample Output-1:

----------------

Bharath





Sample Input-2:

---------------

4

India-Telangana-Hyderabad

Telangana-Rangareddy-Lbnagar

Telangana-Dilshukhnagar-Gaddiannaram

Rangareddy-Lbnagar-Saroornagar

Gaddiannaram

Saroornagar



Sample Output-2:

----------------

Telangana


*/


import java.util.*;

class Day_77_P_3{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        String[] conns = new String[n];
        for(int i=0;i<n;i++){
            conns[i] = s.nextLine();
        }
        String p1 = s.nextLine();
        String p2 = s.nextLine();
        System.out.println(getSmallestCommonPlace(conns,p1,p2,n));
    }
    
    static String getSmallestCommonPlace(String[] conns,String p1,String p2,int n){
        Map<String,String> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String[] dis = conns[i].split("-");
            for(int j=1;j<dis.length;j++){
                map.put(dis[j],dis[0]);
            }
        }
        return getCommonAncestor(map,p1,p2);
    }
    
    static String getCommonAncestor(Map<String,String> map,String p1,String p2){
        List<String> p1a = new ArrayList<>();
        List<String> p2a = new ArrayList<>();
        while(map.containsKey(p1)){
            p1 = map.get(p1);
            p1a.add(p1);
        }
        while(map.containsKey(p2)){
            p2 = map.get(p2);
            p2a.add(p2);
        }
        int id1=p1a.size()-1,id2=p2a.size()-1;
        while(id1>=0 && id2>=0 && p1a.get(id1).equals(p2a.get(id2))){
            id1--;
            id2--;
        }
        return p1a.get(id1+1);
    }
}

