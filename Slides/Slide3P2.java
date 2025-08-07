import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Slide3P2 {

    public static void main(String[] args){

        List <Double> list = new ArrayList<>(Arrays.asList(1.0,4.0,6.0,4.0,5.0));

        double sum = 0.0;
        double average = 0.0;

        list.addAll(Arrays.asList(8.0,5.0,2.0));

        for (int i = 0; i < list.size(); i++) {

            sum += list.get(i);

            if (i == (list.size() - 1)) {

                average = sum / list.size();
                System.out.println(average);

            }

        }

    }

}