package patterns.chapter02_number_patterns;

import java.util.Scanner;

public class Pattern01BinaryPattern {
    public static void main(String[] args) {
        System.out.println("Enter rows");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                if(i%j == 0) {
                    System.out.print(" "+"0");
                }
                else {
                    System.out.print(" "+"1");
                }
            }
            System.out.println();
        }
    }
}
