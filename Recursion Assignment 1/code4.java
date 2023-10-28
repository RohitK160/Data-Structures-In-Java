//using recursion in java using brute force approach

public class code4 {
    public static void main(String[] args) {
        long number = 12345;
        int length = calculateDigitLength(number);
        System.out.println("Length of digits in " + number + " is: " + length);
    }

    public static int calculateDigitLength(long number) {
        if (number < 10) {
            return 1; 
        } else {
            return 1 + calculateDigitLength(number / 10);
        }
    }
}
