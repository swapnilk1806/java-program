

package collage;

public class MergeSort {

//    public static void MergeSort(int arr[],int si,int mid,int ei){
//        int i = si;
//        int j = mid+1;
//        int k =0;
//        int Q[] = new int[arr.length];
//
//        while (i<= mid && j<=ei){
//            if(arr[i] < arr[j]){
//                Q[k] = arr[i];
//                k++;
//                i++;
//            }else{
//                Q[k] = arr[j];
//                j++;
//                k++;
//            }
//        }
//        while(i<=mid){
//            Q[k] = arr[i];
//            k++;
//            i++;
//        }
//
//        while(j<=ei){
//            Q[k] = arr[j];
//            j++;
//            k++;
//        }
//
//        for (i=si,k=0; i<=ei; i++,k++){
//            arr[i]= Q[k];
//        }
//    }

    public static void MergeSort(int [] arr,int low,int mid,int high){

        int [] Q = new int[arr.length];
        int i = low;
        int j = mid+1;
        int k =0;

        while(i <= mid && j<= high){
            if(arr[i] < arr[j]){
                Q[k] = arr[i];
                i++;
                k++;
            }else {
                Q[k] = arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            Q[k] = arr[i];
            i++;
            k++;
        }

        while(j<=high){
            Q[k] = arr[j];
            j++;
            k++;
        }

        for (i=low,k=0; i<=high; i++,k++){
            arr[i] = Q[k];
        }
    }
    public static void Merge(int arr[],int low,int high){
        if(low<high){
            int mid = (low+high)/2;
            Merge(arr,low,mid);
            Merge(arr,mid+1,high);
            MergeSort(arr,low,mid,high);
        }
    }
    public static void main(String[] args) {
        int [] arr = {6,4,8,9,0,12};
     Merge(arr,0,arr.length-1);


     for (int i=0; i<arr.length; i++){
         System.out.println(arr[i]);
     }
    }
}
