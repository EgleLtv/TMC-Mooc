
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int values = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                break;
            }
            if (number != 0) {
                sum = sum + number;
            }
            if (number !=0) {
                values = values + 1;
            }
        }
        System.out.println("Number of numbers: " + values);
        System.out.println("Sum of the numbers: " + sum);

    }
}
