package collage;

public class setBit {
    public static int setB(int num, int i){
        int bitmas = 1<<i;
        return num | bitmas;
    }
    public static void main(String[] args) {

        System.out.println(setB(10,4));
    }
}
