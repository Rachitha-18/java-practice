package numeric_programs;

import java.util.Scanner;

public class ReverseNumberWhile {
    public static void main(String[] args) {
        System.out.println("Enter no ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int rev=0, rem, temp=num;
        while (num > 0) {
            rem =num% 10;
            rev= rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse\t"+rev);
        if(temp ==rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
