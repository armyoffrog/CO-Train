import java.lang.reflect.Array;
import java.util.ArrayList;


public class Slide4P2 {

    static ArrayList factorials(ArrayList arrayNum) {

        ArrayList<Integer> newNum = new ArrayList<Integer>();

        for (int i = 0; i < arrayNum.size(); i++){

            int factor = 0;

            for (int num = 2; num < i; num++){

                factor += num * i;

            }

            newNum.add(factor);

        }

        return newNum;

    }

    public static void main(String[] args) {

    }

}
