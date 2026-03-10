import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rnd = new Random();

        int roll = 1;

        System.out.println("Roll  Die1  Die2  Die3  Sum");
        System.out.println("--------------------------------");

        while(true) {

            int d1 = rnd.nextInt(6) + 1;
            int d2 = rnd.nextInt(6) + 1;
            int d3 = rnd.nextInt(6) + 1;

            int sum = d1 + d2 + d3;

            System.out.printf("%4d %5d %5d %5d %5d\n", roll, d1, d2, d3, sum);

            if(d1 == d2 && d2 == d3) {
                System.out.println("\nTriple rolled! Game ends.");
                break;
            }

            roll++;
        }

    }

}