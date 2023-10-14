package collage;

import java.util.Scanner;

public class SolidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num= sc.nextInt();

        for (int i=0; i<=num; i++){
            for (int j=0; j<=num-i; j++){
                System.out.print("   ");
            }
            for (int j=0; j<=num; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
