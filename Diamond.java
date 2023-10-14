package collage;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        for (int i=0; i<=num+1; i++){
            for (int j=0; j<=num-i; j++){
                System.out.print("   ");
            }
            for (int j=0; j<=(i*2); j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i=0; i<=num; i++){
            for (int j=0; j<=i; j++){
                System.out.print("   ");
            }
            for (int j=0; j<=(num-i)*2; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
