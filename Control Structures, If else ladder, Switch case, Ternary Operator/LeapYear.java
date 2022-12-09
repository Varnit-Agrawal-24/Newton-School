/*
Leap Year

Problem Statement
Given a year(an integer variable) as input, 
find if it is a leap year or not.
Note: Leap year is the year that is multiple of 4.
      But, multiples of 100 which are not multiples of 
      400 are not leap years.

Input
The input contains a single integer N

Constraint:
1 <= n <= 104
Output
Print "YES" if the year is a leap year else print "NO".
Example
Sample Input:
2000

Sample Output:
YES

Sample Input:
2003

Sample Output:
NO

Sample Input:
1900

Sample Output:
NO

 */

import java.util.*;


class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int leapYear=sc.nextInt();
        if (leapYear%4==0 && (leapYear%100!=0 || leapYear%400==0)){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
    }
}