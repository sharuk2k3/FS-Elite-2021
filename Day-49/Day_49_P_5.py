'''

Given N satellite stations, numbered 1 to N.
These satellites are connected to send signals from one to other.
To send a signal from satellite 's' to satellite 'd', it takes 
an amount of time 't'.

You are given a list of travel times as directed edges times[i] = (s, d, t).

Your task to find the time taken to recieve signal from a satellite station K, 
to all N-1 satellite stations. If it is impossible, return -1 .

Input Format:
-------------
Line-1 ->   Three integers, N number of satellite stations, 
            K is the satellite to send signal and T is the number of edges.
Next T lines -> Three space separated integers, 's' is the source, 
            'd' is the destination, 
			't' is the time taken recieve signal from 's' to 'd'.

Output Format:
--------------
Print an integer as your result.


Sample Input-1:
---------------
4 2 3
2 1 1
2 3 1
3 4 1

Sample Output-1:
----------------
2


Sample Input-2:
---------------
5 2 4
2 1 1
2 3 2
3 4 3
5 1 4

Sample Output-2:
----------------
-1


Sample Input-3:
---------------
5 2 4
2 1 1
2 3 2
3 4 3
1 5 6

Sample Output-3:
----------------
7


'''