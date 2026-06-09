package numeric_programs;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter no ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Is prime number\n");
        if (isPrime(num))
            System.out.println("True");
        else
            System.out.println("False");
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
