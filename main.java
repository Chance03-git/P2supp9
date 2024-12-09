import java.util.ArrayList;
import java.util.List;

public class Main{

    /**
     * Returns a list of all even numbers from the provided list of integers.
     *
     * @param numbers List of integers to process.
     * @return List of integers containing only even numbers from the input.
     */
    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }

    // Test Cases
    public static void runTests() {
        List<Integer> testInput1 = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> expected1 = List.of(2, 4, 6);
        System.out.println("Test 1: " + (getEvenNumbers(testInput1).equals(expected1) ? "Passed" : "Failed"));

        List<Integer> testInput2 = List.of();
        List<Integer> expected2 = List.of();
        System.out.println("Test 2: " + (getEvenNumbers(testInput2).equals(expected2) ? "Passed" : "Failed"));

        List<Integer> testInput3 = List.of(1, 3, 5, 7);
        List<Integer> expected3 = List.of();
        System.out.println("Test 3: " + (getEvenNumbers(testInput3).equals(expected3) ? "Passed" : "Failed"));
    }

    public static void main(String[] args) {
        // Run test cases
        runTests();

        // Example usage
        List<Integer> numbers = List.of(10, 15, 20, 25, 30);
        System.out.println("Even numbers from the list: " + getEvenNumbers(numbers));
    }
}
