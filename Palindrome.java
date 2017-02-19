/**A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.(Wikipedia)
Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes*/

import java.io.*;
import java.util.*;

public class Palindrome {
    
    String str;
	      
	
  	 public String firstCharacters(String str) {
  		// System.out.println(str.substring(0, 1));
        return str.substring(0, 1);
    }
  	 
  	public String lastCharacters(String str) {
  		//System.out.println(str.substring(str.length()-1));
    	return str.substring(str.length()-1);
    }

  	public String middleCharacters(String str) {
  		//System.out.println(str.substring(1,str.length()-1));
    	return str.substring(1,str.length()-1);
    }
  	
  	public String isPalindrome(String str) {
  		
  		if( str.length() <= 1) {
  			//System.out.println(str);
  		return "Yes";
  		}

  		if (firstCharacters(str).compareTo(lastCharacters(str)) != 0) {
  			//System.out.println("It is not palandrome");
  		    return "No";
  		}
  		
  		// recursive case
        return isPalindrome(middleCharacters(str));

  	}
  	
 public void  checkPalindrome(String str) {
  	   //System.out.println("Is this word a palindrome? " + str );

  	   System.out.println(isPalindrome(str));
  	 
  	}
  
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
         Palindrome pal = new Palindrome();
       
        pal.checkPalindrome(A);
       
} 
} 
