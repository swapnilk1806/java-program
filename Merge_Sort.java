

package collage;

import java.util.Scanner;

public class Merge_Sort {

    public static void merge_sort(int arr[],int low,int mid,int high){
        int i = low;
        int j = mid+1;
        int k =0;
        int d[]  = new int[30];

        while ((i<=mid)&&(j<=high)) {
            if(arr[i] <= arr[j]){
                d[k] = arr[i];
                i++;
                k++;
            }else{
                d[k] = arr[j];
                k++;
                j++;
            }

        }
        while (i <= mid){
            d[k] = arr[i];
            i++;
            k++;
        }
        while(j<=high){
            d[k] = arr[j];
            k++;
            j++;
        }

        for (i=low,k=0; i<=high; i++,k++){
            arr[i] = d[k];
        }
    }
    public static void merge(int [] arr,int low,int high){
        if(low < high){
            int mid = (low + high)/2;
            merge(arr,low,mid);
            merge(arr,mid+1,high);
            merge_sort(arr,low,mid,high);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Nnmber : ");
        int num = sc.nextInt();

        for (int i=0; i<num; i++){
            System.out.print(i+1+" : ");
            arr[i] = sc.nextInt();
        }
        merge(arr,0,num-1);
        System.out.println("Sorted array Merge sort : ");
        for (int i=0; i<num; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
