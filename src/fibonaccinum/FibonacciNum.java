
package fibonaccinum;

import java.util.Scanner;

/**
 *
 * @author Jenisha Munikar
 */
public class FibonacciNum {

    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the term");
        n=s.nextInt();
        int a=fibo(n);
        System.out.println(a);
    }
    public static int fibo(int n)
    {
        if(n==0||n==1)
        {
           return n;
        }
        else{
            return (fibo(n-1)+fibo(n-2));
        }
    }
}
