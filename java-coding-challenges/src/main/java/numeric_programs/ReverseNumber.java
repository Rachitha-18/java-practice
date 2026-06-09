package numeric_programs;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter no ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int rev=0, rem, temp=num;
        for (; num>0; num=num/10) {
           rem =num% 10;
           rev= rev*10+rem;
        }
        System.out.println("Reverse\t"+rev);
        if(temp ==rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
