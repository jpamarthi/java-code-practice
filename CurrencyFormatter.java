/**Output Format

On the first line, print US: u where  is  formatted for US currency. 
On the second line, print India: i where  is  formatted for Indian currency. 
On the third line, print China: c where  is  formatted for Chinese currency. 
On the fourth line, print France: f, where  is  formatted for French currency.

Sample Input

12324.134
Sample Output

US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €**/

import java.util.*;
import java.text.*;

public class CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        
        System.out.println("US: " + NumberFormat.getCurrencyInstance(new Locale("en","US")).format(payment));
        System.out.println("India: "  + NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment));
        System.out.println("China: "  + NumberFormat.getCurrencyInstance(new Locale("zh","CN")).format(payment));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(new Locale("fr","FR")).format(payment));
    }
} 

