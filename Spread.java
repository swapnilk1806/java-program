
package collage;

public class Spread {
    public static int SumCalculate(int ...arr){
        int sum = 0;
        int i =0;
        for (int val : arr){
            sum += val;
        }
        return sum;
    }
    public static void main(String[] args) {




        System.out.println(SumCalculate(10,9,8,7,6,5,4,3,2,1));


    }
}
