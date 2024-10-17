import java.util.Scanner;

public class ArrayAsin {
    int[] numbers;

    // Initializing the array
    public ArrayAsin() {
        numbers = new int[5];
    }

    // Input numbers from the user
    public void inputNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        // No need to close the scanner here if we plan to use it again later
    }

    // Display the array
    public void displayArray() {
        System.out.print("Array's content: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Calculate and display the sum
    public void displaySum() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of all integers: " + sum);
    }

    // Calculate and display the average
    public void displayAverage() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Average of the integers: " + average);
    }

    // Find and display the highest value
    public void displayHighest() {
        int highest = numbers[0];
        for (int num : numbers) {
            if (num > highest) {
                highest = num;
            }
        }
        System.out.println("Highest value: " + highest);
    }

    // Find and display the lowest value
    public void displayLowest() {
        int lowest = numbers[0];
        for (int num : numbers) {
            if (num < lowest) {
                lowest = num;
            }
        }
        System.out.println("Lowest value: " + lowest);
    }

    // Execute the program
    public static void main(String[] args) {
        ArrayAsin arrayAsin = new ArrayAsin();
        arrayAsin.inputNumbers();
        arrayAsin.displayArray();
        arrayAsin.displaySum();
        arrayAsin.displayAverage();
        arrayAsin.displayHighest();
        arrayAsin.displayLowest();
    }
}
