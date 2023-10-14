package collage;

public class overload {
    public static void arrD(int ...arr){
       int sum =0;
       for (int val : arr){
           System.out.println(val);
       }
    }
    public static void main(String[] args) {
        arrD(1,2,3,4,5,6,10,12,13);
        System.out.println();
    }
}
