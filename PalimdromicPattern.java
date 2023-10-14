package collage;

import java.util.Scanner;

public class PalimdromicPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        for (int i=1; i<+num; i++){
            for (int j=1; j<=num-i; j++){
                System.out.print("  ");
            }
            for (int j=1; j<=i; j++){
                System.out.print((i-j+1)+" ");
            }
            for (int j=1; j<i; j++){
                System.out.print((j+1)+" ");
            }
            System.out.println();
        }
    }
}
