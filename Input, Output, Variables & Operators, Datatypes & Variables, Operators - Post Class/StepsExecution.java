/*
Steps Execution

Problem Statement=>

Take 4 digit number input from the user, 
add 8 to it and then divide it by 3(Only take integer part) 
Now, the modulus of that number is taken with 5 and
then multiply the resultant value by 5. Display the final result.

Input
You don't have to worry about the input, you just have to complete the function stepsExecute

Constraints
1000 <= number <= 9999

Output
Print the final result

Example
Sample Input :
2345
Sample Output :
20
*/
import java.io.*; 
import java.util.*;
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print( (((n+8)/3)%5)*5 );
    }
}