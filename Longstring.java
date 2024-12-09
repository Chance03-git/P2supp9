import java.util.List;

public class Longstring {
    // Test Cases
    public static void runTests() {
        List<String> testInput1 = List.of("apple", "banana", "cherry");
        String expected1 = "banana";
        System.out.println("Test 1: " + (getLongestString(testInput1).equals(expected1) ? "Passed" : "Failed"));

        List<String> testInput2 = List.of("short", "longer", "longest");
        String expected2 = "longest";
        System.out.println("Test 2: " + (getLongestString(testInput2).equals(expected2) ? "Passed" : "Failed"));

        List<String> testInput3 = List.of();
        String expected3 = null;
        System.out.println("Test 3: " + (getLongestString(testInput3) == expected3 ? "Passed" : "Failed"));

        List<String> testInput4 = List.of("same", "size", "test");
        String expected4 = "same"; // Ties are resolved by first occurrence
        System.out.println("Test 4: " + (getLongestString(testInput4).equals(expected4) ? "Passed" : "Failed"));
    }

    public static void main(String[] args) {
        // Run test cases
        runTests();

        // Example usage
        List<String> strings = List.of("cat", "elephant", "tiger", "lion");
        System.out.println("Longest string: " + getLongestString(strings));
    }
}
