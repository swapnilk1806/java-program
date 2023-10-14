

package collage;

public class BackTrackArray {
    public static void BackTrack(int[] arr, int n){
        if(n==0){
            arr[n] -= 2;
            return;
        }
        BackTrack(arr,n-1);
         arr[n] -= 2;
    }
    public static void main(String[] args) {
        int[] arr = {12,22,32,42,52,62};
         BackTrack(arr,arr.length-1);
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
