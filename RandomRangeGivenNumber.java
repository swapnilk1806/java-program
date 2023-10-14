package collage;

public class RandomRangeGivenNumber {
    public static void main(String[] args) {
        for (int i=0; i<300; i++){
            int val =0;
            for (int j=0; j<10; j++){
                val += Math.floor(Math.random()*1000);

            }
            System.out.println(val);
        }
    }
}
