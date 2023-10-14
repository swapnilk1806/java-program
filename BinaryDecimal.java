

package collage;

import java.util.Scanner;

public class BinaryDecimal {

    public static void BTD(int num){
        int Decimal = 0;
        int pawer=0;
        while (num>0){
            int lastDigit = num%10;
            Decimal += lastDigit * (int)Math.pow(2,pawer);
            pawer++;
            num = num /10;
        }
        System.out.println("Decimal of Given Number : "+(Decimal));
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Binary Number : ");
        int num = sc.nextInt();

        BTD(num);
    }
}
