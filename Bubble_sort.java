

package collage;

import java.util.Scanner;


public class Bubble_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        int [] arr = new int[num];

        for (int i=0; i<num; i++){
            System.out.print(i+1 + " : ");
            arr[i] = sc.nextInt();
        }
        BubbleSort(arr);
        System.out.println("Bubble Sort : ");
        for (int i=0; i<num; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void BubbleSort(int[] arr) {
        for (int i=0; i<arr.length-1; i++){
            for (int j=0; j<arr.length-1-i;j++){
                if(arr[j]  > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
