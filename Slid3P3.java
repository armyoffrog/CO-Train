import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Slid3P3 {

    public static void main(String[] args){

        List <Integer> list = new ArrayList<>(Arrays.asList(18, 19, 26, 16, 20, 23, 13, 30, 15, 28));
        int largestValue = 0;

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) <= 21){

                if (largestValue < list.get(i)) {

                    largestValue = list.get(i);

                }

            }

        }

        System.out.println(largestValue);

    }   
}
