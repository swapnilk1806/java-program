

package collage;

import java.util.Scanner;

public class ArrayPairsList {

    public static void ArrayPairs(int arr[]){
        for (int i=0; i<arr.length; i++){

            for (int j=i; j<arr.length; j++){
                System.out.print("(");
                System.out.print(arr[i] + " , "+arr[j]);
                System.out.print(")  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Nnmber : ");
        int num = sc.nextInt();
        int [] arr = new int[num];


        for (int i=0; i<num; i++){
            System.out.print(i+1 + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Given Array is subArray");
        ArrayPairs(arr);
    }
}
