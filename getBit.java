package collage;

public class getBit {
    public static int GetB(int num,int i){
        int bitmack = 1<<i;
        return num & bitmack;
    }
    public static void main(String[] args) {

        System.out.println(GetB(10,1));
    }
}
