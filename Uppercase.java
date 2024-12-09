public class Uppercase {
    /**
     * Converts all characters in the given string to uppercase.
     *
     * @param input The input string.
     * @return A new string with all characters converted to uppercase.
     */
    public static String toUpperCase(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        return input.toUpperCase();
    }
    // Test Cases
    public static void runTests() {
        String testInput1 = "hello";
        String expected1 = "HELLO";
        System.out.println("Test 1: " + (toUpperCase(testInput1).equals(expected1) ? "Passed" : "Failed"));

        String testInput2 = "Java Programming";
        String expected2 = "JAVA PROGRAMMING";
        System.out.println("Test 2: " + (toUpperCase(testInput2).equals(expected2) ? "Passed" : "Failed"));

        String testInput3 = "123abc!";
        String expected3 = "123ABC!";
        System.out.println("Test 3: " + (toUpperCase(testInput3).equals(expected3) ? "Passed" : "Failed"));
    }

    public static void main(String[] args) {
        // Run test cases
        runTests();

        // Example usage
        String input = "example string";
        System.out.println("Original: " + input);
        System.out.println("Uppercase: " + toUpperCase(input));
    }
}

