public class Slide3P1 {

    public static void main(String[] args) {
     
        int[] array = {4,7,1};
        int largestNumber = 0;

        for (int element : array){

            if (element > largestNumber){

                largestNumber = element;

            }

        }

        System.out.println(largestNumber);

    }
    
}
