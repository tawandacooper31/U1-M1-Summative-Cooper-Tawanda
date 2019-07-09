import java.util.Scanner;
import java.util.Arrays;
public class ArrayFun5Words {

    //MAIN METHOD
    public static void main(String[] args) {

        //SCANNER STATEMENT
        Scanner scanner = new Scanner(System.in);
        String[] funArray = new String[5];

        //ASK USER TO ENTER FIVE WORDS
        System.out.println("Enter five words: ");
        for (int i = 0; i < 5; i++) {//GOES THROUGH THE ARRAY

            funArray[i] = scanner.nextLine();
        }
        for (int i = 0; i < 5; i++);

        {
            System.out.println ("funArray[5]");//PRINTS OUT THE ARRAY

        }
    }
}
