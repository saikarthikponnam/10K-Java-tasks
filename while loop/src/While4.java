import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int fact = 1;

        while (n > 0) {
            fact *= n;
            n--;
        }

        System.out.println("Factorial = " + fact);
    }
}