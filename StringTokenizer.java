/*Sample Input

He is a very very good boy, isn't he?
Sample Output

10
He
is
a
very
very
good
boy
isn
t
he*/


import java.io.*;
import java.util.*;
import java.util.Scanner.*;
import java.util.StringTokenizer.*;

public class StringTokenizer {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        
        StringTokenizer tokenizer = new StringTokenizer(s, " !,?.\\_'@");
        System.out.println(tokenizer.countTokens());

        while(tokenizer.hasMoreElements()) {
            System.out.println(tokenizer.nextToken());
        }
        scan.close();
    }
}
