'''

Crazy Mohan is the head master of a school.
He do the things differently. All the students in the school,
formed as a grid for the assembly.

Crazy Mohan asked them to stand in sorted order of thier heights diagonally, 
in order to make the assembly look more unique. The students started arranging 
themselves according to their heights.

You will be given initial order of the assembly, heights of the students.
Now it is your task to find the final state of the assembly of students and print it.

Input Format:
-------------
Line-1: Two space separated integers M and N, Size of the Grid
Next M lines: N space separated integers, heights of the students.

Output Format:
--------------
Print the rid of integers, final state of the assembly.


Sample Input-1:
---------------
3 4
2 8 5 2
10 9 10 9
1 5 8 5

Sample Output-1:
----------------
2 5 5 2
5 8 8 9
1 10 9 10


Sample Input-2:
---------------
4 6
10 9 10 7 5 9
5 4 9 9 10 10
8 8 1 9 5 2
1 2 1 5 9 9

Sample Output-2:
----------------
1 9 5 2 5 9
1 4 9 9 7 10
2 5 5 9 9 10
1 8 8 10 9 10


'''

#Solution:


'''
#Java Solution:



import java.util.*;

class main{
    static void printmatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        Map<Integer,PriorityQueue<Integer>> map = new HashMap<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(map.get(i-j)==null) map.put(i-j,new PriorityQueue<>());
                map.get(i-j).add(arr[i][j]);
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = map.get(i-j).poll();
            }
        }
        printmatrix(arr);
    }
}





(OR)



import java.util.*;

class main{
    static void printmatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void sortdiagonally(int i,int j,int[][] arr){
        List<Integer> l = new ArrayList<>();
        for(int k=0;(i+k) < arr.length && (j+k) < arr[0].length;k++){
            l.add(arr[i+k][j+k]);
        }
        Collections.sort(l);
        for(int k=0;k<l.size();k++){
            arr[i+k][j+k] = l.get(k);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0;i<m;i++){
            sortdiagonally(i,0,arr);
        }
        for(int i=1;i<n;i++){
            sortdiagonally(0,i,arr);
        }
        printmatrix(arr);
    }
}




'''