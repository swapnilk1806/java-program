package collage;

public class QuickSort {

//    public static int partion(int arr[],int si,int ei){
//        int pivot = arr[ei];
//        int i = si-1;
//        for (int j=si; j<ei; j++){
//            if(arr[j]< pivot){
//                i++;
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//        i++;
//        arr[ei] = arr[i];
//        arr[i] = pivot;
//        return i;
//    }

    public static int partion(int[] arr,int si,int ei){
        int pivot = arr[ei];
        int i = si-1;
        for (int j=si; j<ei; j++){
            if(arr[j]  < pivot){
                i++;
                int temp = arr[i];
                arr[i]  = arr[j];
                arr[j] = temp;
            }

        }
        i++;
        arr[ei] = arr[i];
        arr[i] = pivot;
        return i;
    }
    public static void Quick(int arr[], int low,int high){
        if(low <= high){
            int part = partion(arr,low,high);
            Quick(arr,low,part-1);
            Quick(arr,part+1,high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,30,50,40,20};

        System.out.println("Sorted elements print");
        Quick(arr,0,arr.length-1);
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
