package collage;

import java.util.Scanner;

public class AdavanceBubbleSort {
    public static void BubbleSort(int arr[]){
        for (int i=0; i<arr.length-1; i++){
            boolean swap = false;
            for (int j=0; j<arr.length-1-i;j++){
                if(arr[j]  > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(swap == true){
                break;
            }
        }
    }

    public static void PrintData(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        int arr[] = new int[num];

        for (int i=0; i<arr.length; i++){
            System.out.print(i+1+" : ");
            arr[i] = sc.nextInt();
        }

//        BubbleSort(arr);
//        PrintData(arr);
        System.out.println();

        String name = "swapnil kadam";


    }
}
