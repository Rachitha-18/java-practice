package patterns.chapter02_number_patterns;

import java.util.Scanner;

public class Pattern01BinaryPattern01 {
    public static void main(String[] args) {
        System.out.println("Enter rows");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int k=0;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+k++%2);
            }
            System.out.println();
        }
    }
}
