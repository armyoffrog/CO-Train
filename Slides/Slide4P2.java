import java.util.ArrayList;


public class Slide4P2 {

    static ArrayList factorials(ArrayList arrayNum) {

        ArrayList<Integer> newNum = new ArrayList<Integer>();

        for (int i = 0; i < arrayNum.size(); i++){

            int factor = 0;
            int numI = (int) arrayNum.get(i);

            for (int num = 2; num < numI; num++){

                factor *= num * numI;

            }

            newNum.add(factor);

        }

        return newNum;

    }

    public static void main(String[] args) {

    }

}
