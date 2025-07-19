
public class Hello2 {

    public static void main(String[] args){

        int a = 10;
        int b = 3;
        int c = 5;
        int D = b * b - 4 * a * c;

        if (D > 0) {

        System.out.println("2 real roots");

        } else if (D < 0){

            System.out.println("0 real roots");

        } else {

            System.out.println("1 real root");

        }

    }

}
