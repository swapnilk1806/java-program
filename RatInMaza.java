

package collage;

public class RatInMaza {
    public static void print(int maza[][]){
        for (int i=0; i<maza.length; i++){
            for (int j=0; j<maza.length; j++){
                System.out.print(maza[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void Maza(int arr[][],int maza[][],int row,int col){
        if(arr.length ==row && arr.length == col){
            print(maza);
            return;
        }
        if(arr[row][col+1] == 1){
            maza[row][col] = arr[row][col];
            Maza(arr,maza,row,col+1);
        }else if(arr[row+1][col] == 1){
            maza[row][col] = arr[row][col];
            Maza(arr,maza,row+1,col);
        }
    }
    public static void main(String[] args) {
        int arr[][]= {{1,0,0,0}, {1,1,0,0}, {0,1,0,0},{1,1,1,1}};
        int [][] arr1 = new int[4][4];
        for (int i=0; i<arr1.length; i++){
            for (int j=0; j<arr1.length; j++){
                arr1[i][j] = '0';
            }
        }
    Maza(arr,arr1,0,0);
    }
}
