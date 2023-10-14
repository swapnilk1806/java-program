package collage;

import java.util.Scanner;

public class BubbleSort {
    public static void Sort(int [] arr){
        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-1-j; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void Print(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Nnmber : ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        for (int i=0; i<arr.length; i++){
            System.out.print(i+1+" : ");
            arr[i] = sc.nextInt();
        }
       Sort(arr);
        Print(arr);
    }
}
