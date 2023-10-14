package collage;

public class OccuranceOfNumber {
    public  static void Number(int []arr,int key,int i) {
        if (i == arr.length) {
            return;
        }
        if(arr[i] == key){
            System.out.println(i + " ");
        }
        Number(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,10,20,30,40,50,60};
        Number(arr,60,0);
    }

}
