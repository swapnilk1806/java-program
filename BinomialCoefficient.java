

package collage;

import java.util.Scanner;

public class BinomialCoefficient {

    public static long fact(int n){
        if(n == 1){
            return 1;
        }
        return n * fact(n -1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter n value : ");
//        int n = sc.nextInt();
//
//        System.out.print("Enter r value : ");
//        int r = sc.nextInt();
//
//        long nCr = fact(n)/(fact(r)*fact(n-r) );
//        System.out.println("Binomial Coefficient : "+nCr);

    }
}
