package collage.DataStructure;

public class BitFindTwoPower {
    public static boolean IsPower(int n){
        return (n & ( n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(IsPower(150));
    }
}
