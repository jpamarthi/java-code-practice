/**Given a string, find out the lexicographically smallest and largest substring of length .

[Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is smaller than "cat", "dog" is smaller than "dorm". Capital letter always comes before smaller letter, so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]

Input Format

First line will consist a string containing english alphabets which has at most  characters. 2nd line will consist an integer .

Output Format

In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.

Sample Input

welcometojava
3
Sample Output

ava
wel
Explanation

Here is the list of all substrings of length :

wel
elc
lco
com
ome
met
eto
toj
oja
jav
ava
Among them ava is the smallest and wel is the largest.*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaStrings {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        int length = sc.nextInt();
        String smallest="";
        String largest="";
        for(int i = 0;i<=inputString.length()-length;i++){
        	System.out.println("i value : " + i);
            String subString = inputString.substring(i,i+length);
            System.out.println("substring : " + subString);
            
            if(i == 0){
                smallest = subString;
            }
            
            System.out.println(subString + ":" + largest + ":" + subString.compareTo(largest));
            if(subString.compareTo(largest)>0){
                largest = subString;
                System.out.println("largest : " + largest);
            }else if(subString.compareTo(smallest)<0)
                smallest = subString;
            
            System.out.println("smallest : " + smallest);
        }
        System.out.println(smallest);
        System.out.println(largest);
        
    }
}


