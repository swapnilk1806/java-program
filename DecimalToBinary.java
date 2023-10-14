package collage;

import java.util.Scanner;

public class DecimalToBinary {
    public  static void DTB(int num){
        int pow = 0;
        double Binary =0;

        while(num>0){
            int rem = num %2;
            Binary += rem *Math.pow(10,pow);
            pow++;
            num = num /2;
        }
        System.out.println("Binary is number l :" + Binary);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Binary Number : ");
        int num = sc.nextInt();
        DTB(num);
    }
}
