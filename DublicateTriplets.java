

package collage;

import java.util.Scanner;

public class DublicateTriplets {

    public static void Dublicate(int arr[],int index){
        int count =0;

        while(count < index){
            int num = arr[0];

            for (int i=0; i<arr.length-1; i++){
             arr[i] = arr[i+1];
            }
          arr[arr.length-1] = num;
            count++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        int [] arr = new int[num];

        for (int i=0; i<arr.length; i++){
            System.out.print(i+1+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Rotate index : ");
        int val = sc.nextInt();
        Dublicate(arr,val);
        System.out.println("--------");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
