package chapter7;

import java.util.Arrays;
import java.util.Scanner;




public class DuplicateElimination2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        int counter = 0;
        boolean isFull = false;
        System.out.println("Enter a number between 10 and 100: ");
        int input = scanner.nextInt();

        while (!isFull) {
            if (input >= 10 && input <= 100) {
                boolean isDuplicated = false;
                if (counter == 0) {
                    numbers[counter] = input;
                    counter++;
                } else {
                    for (int i = 0; i < counter; i++) {
                        if (numbers[i] == input) {
                            isDuplicated = true;
                            break;
                        }
                    }
                }
                if (isDuplicated) {
                    System.out.println("You've entered an existing number. Enter another number");
                    input = scanner.nextInt();
                } else {
                    numbers[counter] = input;
                    counter++;
                }

            } else {
                System.out.println("You've entered an invalid number. Enter another number");
                input = scanner.nextInt();
            }

            if (counter == numbers.length) {
                isFull = true;
            } else {
                System.out.println(input + " has been added. Enter another number");
                input = scanner.nextInt();
            }
        }

        System.out.println(Arrays.toString(numbers));

    }
}