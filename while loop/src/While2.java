import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";

        while (!input.equals("exit")) {
            System.out.print("Enter text: ");
            input = sc.nextLine();
        }
    }
}