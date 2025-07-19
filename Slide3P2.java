
public class Slide3P2 {

    public static void main(String[] args){

        ArrayList<double> list = {1.6,4.0,6.7,4.3,5.8};
        double sum;
        double average;

        list.add(9.0);
        list.add(7.1);
        list.add(4.7);

        for (int element : list){

            sum += element

        }

        average = sum / list.size();

        System.out.println(average);

    }

}
