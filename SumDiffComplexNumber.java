

package collage;

/**
 * @author swapnil kadam
 *
 */
class Complex{
    int real;
    int imag;
    Complex(int real,int imag){
        this.imag = imag;
        this.real = real;
    }
    public static Complex add(Complex a,Complex b){
        return new Complex((a.real+b.real),(a.imag+b.imag));
    }

    public static Complex Diff(Complex a,Complex b){
        return new Complex((a.real-b.real),(a.imag-b.imag));
    }
    public static Complex Product(Complex a,Complex b){
        return new Complex((a.real*b.real - a.imag*b.imag),(a.real*b.imag + a.imag * b.real));
    }
    public void PrintComplex(){

        if(real == 0 && imag != 0 || real == 0){
            System.out.println(imag+"i");
        }else if(real != 0 && imag == 0){
            System.out.println(real);
        }else {
            System.out.println(real+" + " + imag+"i");
        }
    }
}
public class SumDiffComplexNumber {
    public static void main(String[] args) {
        int a1 = 10;
        int a2 = 11;
        int b1 = 17;
        int b2 = 10;
        Complex c1 = new Complex(a1,a2);
        Complex c2 = new Complex(b1,b2);

        System.out.println("Original Complex Number : ");
        System.out.println("A : "+a1+" + "+a2+"i");
        System.out.println("B : "+b1+" + "+b2+"i");

        Complex s = Complex.add(c1,c2);
        Complex d = Complex.Diff(c1,c2);
        Complex p = Complex.Product(c1,c2);

        s.PrintComplex();
        d.PrintComplex();
        p.PrintComplex();
    }
}