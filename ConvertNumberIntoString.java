

package collage;

public class ConvertNumberIntoString {
    static String str[] = {"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
    public static void NumberIntoString(int num){
        if(num ==0){
            return;
        }
        int lastDigit = num % 10;
        NumberIntoString(num/10);
        System.out.print(str[lastDigit] + " ");
    }
    public static void main(String[] args) {
        System.out.println();

        NumberIntoString(1234);

        System.out.println();

    }
}
