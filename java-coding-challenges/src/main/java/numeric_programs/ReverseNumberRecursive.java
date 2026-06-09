package numeric_programs;

import java.util.Scanner;

public class ReverseNumberRecursive {
    public static void main(String[] args) {
        System.out.println("Enter no ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("Reverse\t");
        rev(num);
    }

    private static void rev(int num) {
        int rev = 0, rem, temp = num;
        if (num < 10) {
            System.out.println(num);
            return;
        } else {
            System.out.print(num % 10);
            rev(num / 10);
        }
    }
}
