package collage;

import java.util.Scanner;

public class RecNumberPrint {

    public static void Print(int n){
        if(n==0){
            return;
        }
        Print(n-1);
        System.out.print(n + " ");
    }
    public static void RevPrint(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        RevPrint(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

//        int [] arr = new int[num];
//        for (int i=0; i<arr.length; i++){
//            System.out.print(i+1+" : ");
//            arr[i] = sc.nextInt();
//        }
        System.out.println("Original print Number : ");
        Print(num);
        System.out.println(" \n Reverce print Number : ");
        RevPrint(num);
    }
}
