/*

Mr Sudhakar is working with Strings,
He is given a String S, He wants to sort the characters in S in descending order
based on the frequency of the characters. If two or more characters have same 
frequency then arrange them in sorted-order.

Your task is to help Mr Sudhakar to convert the string S into sorted order of 
frequency.

Note: The frequency of a character is the number of times it appears in the string.

Input Format:
----------------
A String S, conatins bothe lower case and upper case letters.

Output Format:
------------------
Print a string after conversion.


Sample Input-1:
---------------
divide

Sample Output-1:
----------------
ddiiev

Explanation: 
------------
d and e have same frequecy and i and v have same frequency.
So sorted-order is ddeevi.


Sample Input-2:
---------------
TomAto

Sample Output-2:
----------------
ooATmt


Sample Input-3:
---------------
rrrppp

Sample Output-3:
----------------
ppprrr



*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Day_60_P_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = s.chars().mapToObj(e -> (char)e)
                                            .sorted((x, y) -> {
                                                int p = (int)s.chars().filter(ch->ch==x).count();
                                                int q = (int)s.chars().filter(ch->ch==y).count();
                                                if(p==q) {
                                                    return x.compareTo(y);
                                                }
                                                return q-p;
                                            })
                                            .collect(Collectors.toList())
                                            .stream()
                                            .map(String::valueOf)
                                            .collect(Collectors.joining());
        System.out.println(ans);
    }
}