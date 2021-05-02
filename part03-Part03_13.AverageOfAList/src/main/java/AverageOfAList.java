
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        // Then it computes the average of the numbers on the list
        // and prints it.
        int sum = 0;
        for (int add:list) {
            sum = sum+add;
        }
        System.out.println("Average: " + 1.0*sum/list.size());
    }
}
