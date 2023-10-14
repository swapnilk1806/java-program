package collage;

import java.util.Scanner;

public class Triplets {

    public static void TRP(int [] arr){
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                for (int k=0; k<arr.length; k++){

                    if ((i != j) && (i != k) &&(j !=k) ){
                        if(arr[i] == arr[j] || arr[i]==arr[k] || arr[j]== arr[k]){
                            if((arr[i] + arr[j] + arr[k]) == 0){
                                System.out.println(arr[i] +" "+ arr[j] +" "+ arr[k]);
                            }
                        }
                    }
                }
            }
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
        TRP(arr);
    }
}
