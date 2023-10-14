

package collage;

import java.util.Scanner;

public class MatrixSumDigonal {

    public static int DigonalSum(int [][] arr){
        int sum=0;
        int n= arr.length;
        for (int i=0; i<arr.length; i++){
            if (i==i){
                sum += arr[i][i];
            }
            if((n-i-1) != i){

                sum += arr[n-i-1][i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        int arr[][] = new int[num][num] ;

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                System.out.print(i+1+" " +(j+1)+" : ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Digonal Sum : "+DigonalSum(arr));
    }
}
