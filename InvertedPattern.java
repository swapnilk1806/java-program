

package collage;

import java.util.Scanner;

public class InvertedPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter How many Nnmber : ");
        int num = sc.nextInt();

        for (int i=0; i<=num; i++){
            for (int j=0; j<=num-i; j++){
                System.out.print("   ");
            }
            for (int j=0; j<i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
