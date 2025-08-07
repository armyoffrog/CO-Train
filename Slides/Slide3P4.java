import java.util.ArrayList;

public class Slide3P4 {

    static boolean primeNumber(int testNumber){

        double value = 0;

        for (int i = 2; i < testNumber; i++){

            if (testNumber % i == 0) {

                return false;

            }

        }

        return true;

    }

    public static void main(String[] args){ 
        
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

        for (int i = 0; i <= 50; i++) {

            if (i != 0 && i != 1){
            
                if (primeNumber(i)){

                    System.out.println(i + " works");

                    primeNumbers.add(i);

                }else{

                    System.out.println(i+" does not work");

                }
            
            }

        }

        System.out.println(primeNumbers);

    }
}
