import java.util.Random;

public class Zoo {

    public static void main(String[] args) {

        System.out.println(args[0]);
        System.out.println(args[1]);

        Random number = new Random();
        System.out.println(number.nextInt(10));
    }

}
