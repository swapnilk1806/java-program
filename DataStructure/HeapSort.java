package collage.DataStructure;

public class HeapSort {

    public static void heapfiy(int [] arr ,int i ,int size){
        int left = 2 * i + 1;
        int right = 2 * i +2;
        int index = i;

        if (left < size && arr[left] > arr[index]) {
            index = left;
        }

        if (right < size && arr[right] > arr[index]){
            index = right;
        }

        if(i != index){
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

            heapfiy(arr,index,size);
        }
    }
    public static void Heap(int [] arr){
        int n = arr.length-1;

        for (int i= n/2; i>=0; i--){
            heapfiy(arr,i,n);
        }

        for (int i=n-1; i>=0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapfiy(arr,0,i);
        }
    }
    public static void main(String[] args) {
        int [] arr = {5,3,2,6,5,8};
        Heap(arr);


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}
