

package collage;

import java.util.Scanner;

public class CountingSort {

    public static void Counting(int arr[]){
        int largest = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){
            largest = Math.max(largest,arr[i]);
        }

        int count[] = new int[largest+1];

        for (int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int j =0;
        for (int i=0 ; i<count.length; i++){
        while (count[i]  > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

//        int j=0;
//        for (int i=0; i<arr.length-1; i++){
//            while (count[i] > 0){
//                arr[j] = i;
//                j++;
//                count[i] --;
//            }
//        }
    }

    public static  void Print(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter Number : ");
//        int num = sc.nextInt();
//
//        int arr[] = new int[num];
//        for (int i=0; i<arr.length;i++){
//            System.out.print(i+1+" : ");
//            arr[i] = sc.nextInt();
//        }
        System.out.println("Sorted data print");
        int [] arr = {12,56,34,89,0,12,45};
        Counting(arr);
        Print(arr);
    }
}
