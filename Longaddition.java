/**Sample Input

5
1000000001 1000000002 1000000003 1000000004 1000000005
Output

5000000015 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Longaddition {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long temp = 0;
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            temp = temp + arr[arr_i] ;
        }
        System.out.println(temp);
    }
     
}
