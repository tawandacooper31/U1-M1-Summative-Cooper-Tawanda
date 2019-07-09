
import java.util.Scanner;

public class ArrayFunUserArray {
    public static  void main(String[] args) {
        Scanner input = new Scanner(System.in);// Input from user

        System.out.println("Enter Values :");

        int array[] = new int[5];

        for (int i = 0; i < 5; i++) // loop for user input

        {
            array[i] = input.nextInt();

        }
        for (int i = 0; i < 5; i++) // for loop to display values

        {
            System.out.println("Values are :" + array[i]);

        }
    }
}
