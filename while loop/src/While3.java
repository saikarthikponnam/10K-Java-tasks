import java.util.Scanner;
import java.util.Random;

public class While3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int number = r.nextInt(100) + 1;
        int guess = 0;

        while (guess != number) {
            System.out.print("Guess number: ");
            guess = sc.nextInt();

            if (guess < number) {
                System.out.println("Too low");
            } else if (guess > number) {
                System.out.println("Too high");
            } else {
                System.out.println("Correct!");
            }
        }
    }
}