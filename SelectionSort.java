

package collage;

import java.util.Scanner;

public class SelectionSort {
    public static void Sort(int arr[]){
        for (int i=0; i<arr.length; i++){
            int minPos = i;
            for (int j=i+1; j<arr.length; j++){
                if(arr[minPos]  > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
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
            Sort(arr);
            PrintData(arr);
    }
}

