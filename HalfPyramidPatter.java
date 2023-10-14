package collage;

import java.util.Scanner;

public class HalfPyramidPatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = sc.nextInt();

        for (int i=0; i<=num; i++){
            for (int j=0; j<=num-i; j++){
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}
