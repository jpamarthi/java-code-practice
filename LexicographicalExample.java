/** Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of  and .
Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in  and  and print them on a single line, separated by a space.
Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output: 
For the first line, sum the lengths of  and . 
For the second line, write Yes if  is lexicographically larger than  or No if it is not. 
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

Sample Input

hello
java
Sample Output

9
No
Hello Java
Explanation

String  is "hello" and  is "java".

 has a length of , and  has a length of ; the sum of their lengths is . 
When sorted alphabetically/lexicographically, "hello" comes before "java"; therefore,  is not larger than  and the answer is No.

When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java". */

import java.io.*;
import java.util.*;

public class LexicographicalExample {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
         int lengthVariables = A.length() + B.length();
        
        System.out.println(lengthVariables);
        
        String lexicalOrder = (A.compareTo(B) > 1) ? "Yes" : "No";
        
        System.out.println(lexicalOrder);
        
        System.out.println(A.toUpperCase().charAt(0)+A.substring(1) + " " + B.toUpperCase().charAt(0)+B.substring(1));
        
        sc.close();
    }
}

