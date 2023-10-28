//WAP to calculate the sum of digits of a given positive integer.

public class code6 {
    public static void main(String[] args) {
        int number = 12345; 
        int sum = calculateSumOfDigits(number);
        System.out.println("Sum of digits of " + number + " is: " + sum);
    }

    public static int calculateSumOfDigits(int number) {
        if (number < 10) {
            return number; 
        } else {
            return number % 10 + calculateSumOfDigits(number / 10); 
        }
    }
}
