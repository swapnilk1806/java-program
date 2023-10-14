

package collage;

public class RandomNumberGenrete {
    public static void main(String[] args) {
        int num = (int )Math.random();

        int step2 = (num * 100);
        int step3 = step2 + 1;

        System.out.println(step3);

//        or

        System.out.println((int) Math.floor(Math.random() * 100+1));
    }
}
