package numeric_programs;

import java.util.Scanner;

public class ArmstrongNumberRange {
    public static void main(String[] args) {
        System.out.println("Enter starting no ");
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        System.out.println("Enter ending no ");
        int end = in.nextInt();
        System.out.println("Is Arm Strong\n");
        for (int i = start; i <= end; i++) {
            if (isArmStrong(i))
                System.out.println(i);
        }
    }

    private static boolean isArmStrong(int i) {
        int sum, temp, cube = 0;
        sum = 0;
        temp = i;
        int digits=String.valueOf(i).length();
        while (temp > 0) {
            int rem = temp % 10;
            cube = (int) Math.pow(rem, digits);
            sum += cube;
            temp /= 10;
        }
        return sum == i;

    }
}
