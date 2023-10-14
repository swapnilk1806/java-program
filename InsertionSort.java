package collage;

import java.util.Scanner;
import java.util.SortedMap;

/**
 * @author swapnil kadam
 */

public class InsertionSort {

    public static void insertionSort(int arr[]){

        for (int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev >=0 &&  arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }

    }

    public static  void Print(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();
         int arr [] = new int[num];

        for (int i=0; i<arr.length; i++){
            System.out.print(i+1+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorted data print");
        insertionSort(arr);
        Print(arr);
    }
}
