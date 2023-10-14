

package collage;


public class SpiralMatrixPrint {
    public static void SprialMatrix(int [][] arr) {
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length - 1;

        while((startRow <= endRow) && (startCol <= endCol)){
            for (int j=startCol; j<=endCol;j++){
                System.out.print(arr[startRow][j] +" ");
            }

            for (int j=startRow+1; j<=endRow; j++){
                System.out.print(arr[j][endCol]+" ");
            }

           for (int j=endCol-1; j>=startRow; j--){
               System.out.print(arr[j][startCol]+" ");
           }

           for (int j=endRow-1; j>=startRow; j--){
               System.out.print(arr[j][startCol]+" ");
           }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter Number : ");
//        int num = sc.nextInt();

        int [][]arr = {{10,20,30,45},
                {40,50,60,68},
                {70,80,90,23},
                {100,110,120,90}};
        SprialMatrix(arr);

    }
}
