package collage;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter NUmber : ");
        int num = sc.nextInt();

        for (int i=0; i<=num; i++){
            for (int j=0; j<=(i*2); j++){
                System.out.print("   ");
            }
            for (int j=0; j<=i; j++){
                System.out.print(i+1 + " ");
            }
            System.out.println();
        }
    }
}
