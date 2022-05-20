/*

There are N employees from 3 different companies in a row, emps[], the employees 
are identified using company IDs as 1,2,3. A Courier Boy need to deliver 
P parcels to these 3 companies. The parcel details are given as parcels[],
where parcel[i]=[Ci,CIDc], i-th parcel, 'Ci' is Courier Boy's current position, 
and  'CIDi' is company's ID, he/she need to deliver parcel[i] from Ci position 
to the nearest employee belongs to companay ID equals to CIDi in the row.

You are given emps[] and parcels[] information,
Your task is to help the courier boy to find the distance between him to 
the nearest employee in that row to deliver the parcel.
If there is no solution found, return -1.

Input Format:
-------------
Line-1: Two space separated integers, N and P
Line-2: N space separated integers, only 1, 2 & 3.
Next C lines: Two space separated integers, position P and Company ID

Output Format:
--------------
Print the space separated integers, distance between boy and the employee for 
all the parcels.


Sample Input-1:
---------------
6 2
1 1 2 2 3 3
1 3
2 2

Sample Output-1:
----------------
3 0 

Sample Input-2:
---------------
5 2
1 2 3 2 1
2 1
1 1

Sample Output-2:
----------------
2 1 



*/
import java.util.*;

class Day_66_P_1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        List<List<Integer>> emps = new ArrayList<>();
        for(int i=0;i<3;i++) emps.add(new ArrayList<Integer>());
        for(int i=0;i<N;i++){
            int ci = sc.nextInt();
            emps.get(ci-1).add(i);
        }
        int[] arr = new int[P];
        for(int i=0;i<P;i++){
            int pos = sc.nextInt();
            int tar = sc.nextInt();
            
            List<Integer> list = emps.get(tar-1);
            if(list.size()==0) System.out.print(-1+" ");
            else{
                int l = 0;
                int h = list.size()-1;
                while(l < h-1){
                    int mid = (l+h)/2;
                    if(pos > list.get(mid)) l = mid;
                    else h = mid;
                }
                System.out.println(Math.min(Math.abs(list.get(l)-pos),Math.abs(list.get(h)-pos))+" ");
            }
        }
        
    }
}