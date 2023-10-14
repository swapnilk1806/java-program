

package collage;

import java.util.Scanner;

public class SubArray {

    public static void SubArrayList(int arr[]){
      for(int i=0; i<arr.length; i++){
          for (int j=0; j<arr.length; j++){
              for (int k=i; k<=j; k++){
                  System.out.print(arr[k]+" ");
              }
              System.out.println();
          }
          System.out.println();
      }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int arr[] = new int[num];

        for (int i=0; i<num; i++){
            System.out.print(i+1+" ");
            arr[i] = sc.nextInt();
        }

        SubArrayList(arr);
    }
}
