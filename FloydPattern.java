package collage;

import java.util.Scanner;

public class FloydPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num =sc.nextInt();
        int count =1;
        for (int i=0; i<=num; i++){
            for (int j=0; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
