/*
Problem Statement
Write a program to find roots of a quadratic equation.
Note: Try to do it using Switch Case.

Input
The first line of the input contains the three float values 
a, b, and c of equation 
ax^2 + bx + c.

Constraints
1<= a, b, c <= 50
Output
Print the two roots in two different lines and for imaginary roots 
print real and imaginary part of one root with (+/- and i )sign in between 
in one line and other in next line. For clarity see sample Output 2.

Note Imaginary roots can also be there and roots are considered upto 2 decimal places.

Example
Sample Input 1 :
4 -2 -10

Sample Output 2 :
1.85
-1.35

Sample Input 2 :
2 1 10

Sample Output 2:
-0.25+i2.22
-0.25-i2.22
 */
import java.util.*;

class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        float a= sc.nextFloat();
        float b= sc.nextFloat();
        float c= sc.nextFloat();
        float d= (b*b)-(4*a*c);
        if(d>=0){
            float a1=(-(b)+(float)(Math.sqrt(d)))/(2*a);
            float a2=(-(b)-(float)(Math.sqrt(d)))/(2*a);
            System.out.printf("%.2f\n%.2f",a1,a2);
        }
        else{
            float r=(-(b))/(2*a);
            float i=((float)Math.sqrt(Math.abs(d)))/(2*a);
            System.out.printf("%.2f+i%.2f\n%.2f-i%.2f",r,i,r,i);
        }

    }
}