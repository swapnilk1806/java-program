package collage;

import java.util.Scanner;

public class Bitmanipulation {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter Number : ");
//        int

        int a = 5;
        int b = 2;

        System.out.println(a<<b);
        // formula a<<b = a * 2 ^b = 5 * (2^2)  = 40

        a = 6;
        b = 1;

        System.out.println(a >> b);
        // formula a>>b = a / 2^b = 6 / (2^1) = 3

    }
}
