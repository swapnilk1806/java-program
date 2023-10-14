

package collage;

import java.util.Scanner;

public class Bsearch {

    public static boolean TwiceArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length;j++){
                if(i != j){
                    if(arr[i] == arr[j]){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Nnmber : ");
        int num = sc.nextInt();
        int [] arr = new int[num];

        for (int i=0; i<arr.length; i++){
            System.out.print(i+1+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println(TwiceArray(arr ));
    }
}
