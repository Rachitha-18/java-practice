package numeric_programs;

import java.util.Scanner;

public class FibonacciSeriesRecursive {
    public static void main(String[] args) {
        System.out.println("Enter no of terms");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=0;i<num;i++){
            System.out.println(fibo(i) +" ");
        }
    }

    private static int fibo(int n) {
        int[] fib = new int[2];
        fib[0]=0;
        fib[1]=1;
        for (int i=1;i<=n;i++){
            fib[i%2] = fib[0]+fib[1];
        }
    return fib[n%2];
    }
}
