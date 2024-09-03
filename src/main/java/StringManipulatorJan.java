

public class StringManipulatorJan {


    public String reverse(String input) {
        // reverse the given text passed as a parameter
        StringBuilder inputReversed = new StringBuilder(input);
        return inputReversed.reverse().toString();

    }

    public String capitalize(String input) {
        // capitalize the text passed as a parameter
        return input.toUpperCase();
    }
}
