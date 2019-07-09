import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {

        int x = 0;

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter a number between 1 and 10");
            x = input.nextInt();
            if (x >= 1 && x <= 10) {
                System.out.println(x);
                break;


            } else {
                System.out.println("You must enter a number between 1 and 10, please try again.");

                x = input.nextInt();
            }

        } while (x < 1 || x > 10);

    }
}

