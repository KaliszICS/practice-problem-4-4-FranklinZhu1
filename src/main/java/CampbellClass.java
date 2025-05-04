public class CampbellClass {
    
    /**
     * A utility class to perform certain functions.
     */

    /**
     * A private constructor that takes in no arguments and does nothing.
     */

    private CampbellClass() {} // to pass the test case

    /**
     * A function to convert an integer to a string.
     * 
     * @param n the integer to be converted
     * @return the integer as a string
     */

    public static String convertString(int n) {
        return Integer.toString(n);
    }

    /**
     * A function to convert a double to a string.
     * 
     * @param x the double to be converted
     * @return the double as a string
     */

    public static String convertString(double x) {
        return Double.toString(x);
    }

    /**
     * A function to convert a character to a string.
     * 
     * @param c the character to be converted
     * @return the character as a string
     */

    public static String convertString(char c) {
        return Character.toString(c);
    }

    /**
     * A function to convert a boolean to a string.
     * 
     * @param b the boolean to be converted
     * @return the boolean as a string
     */

    public static String convertString(boolean b) {
        return Boolean.toString(b);
    }

    /**
     * A function to convert an integer number of meters to centimeters.
     * 
     * @param meters the integer number of metres to be converted
     * @return the integer number of centimeters
     */

    public static int convertMetersToCenti(int meters) {
        return meters*100;
    }

    /**
     * A function to convert a double number of meters to centimeters.
     * 
     * @param meters the double number of metres to be converted
     * @return the double number of centimeters
     */

    public static double convertMetersToCenti(double meters) {
        return meters*100;
    }

    /**
     * A function to remove all non-alphabetic characters of a string.
     * 
     * @param s the string to have its non-alphabetic characters removed
     * @return the string without its non-alphabetic characters
     */

    public static String removeNonAlpha(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); ++i) {
            if ((65 <= s.charAt(i) && s.charAt(i) <= 90) || (97 <= s.charAt(i) && s.charAt(i) <= 122)) ans += s.charAt(i);
        }
        return ans;
    }

    /**
     * A function to remove all non-alphabetic characters of a string, with the option to convert the final string to uppercase or lowercase.
     * 
     * @param s the string to have its non-alphabetic characters removed
     * @param caps a boolean indicating if the string should be in uppercase or lowercase; uppercase if true, lowercase if false
     * @return the string without its non-alphabetic characters, in either uppercase or lowercase
     */

    public static String removeNonAlpha(String s, boolean caps) {
        String ans = "";
        for (int i = 0; i < s.length(); ++i) {
            if ((65 <= s.charAt(i) && s.charAt(i) <= 90) || (97 <= s.charAt(i) && s.charAt(i) <= 122)) ans += s.charAt(i);
        }
        if (caps) return ans.toUpperCase();
        return ans.toLowerCase(); // if not caps (lowercase)
    }

}