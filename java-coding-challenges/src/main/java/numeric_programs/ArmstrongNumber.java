package numeric_programs;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter no ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum=0, rem, temp=num,cube=0;
        while (num > 0 ){
            rem =num% 10;
            cube = (int)Math.pow(rem,3);
            sum= sum+cube;
            num = num/10;
        }
        System.out.println("Arm Strong\t"+sum);
        if(temp ==sum)
            System.out.println("Is Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
