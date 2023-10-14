package collage;

import java.util.Scanner;

public class ArrayReverse {

//    public static  void ArrayRE(int []arr){
//        int num = arr.length;
//        int temp;
//        for (int i=0; i<arr.length; i++){
//             temp = arr[i];
//            arr[i] = arr[num-i-1];
//            arr[num-i-1] = temp;
//        }
//        System.out.println("Array is Reverse : ");
//        for (int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//    }

    public static void Array(int arr[]){
        int start = 0;
        int last = arr.length-1;
        while(start < last){
            int temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            last--;
            start++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        int [] arr = new int[num];

        for (int i=0; i<num; i++){
            System.out.print(i+1+" : ");
            arr[i] = sc.nextInt();
        }
        Array(arr);
//        ArrayRE(arr);
        System.out.println("Array is Reverse : ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
