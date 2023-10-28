//WAP to count the occurrence of a specific digit in a given number.

public class code8 {
    public static void main(String[] args) {
        int number = 122134; 
        int targetDigit = 2; 
        int count = countDigitOccurrences(number, targetDigit);
        System.out.println("The digit " + targetDigit + " occurs " + count + " times in " + number);
    }

    public static int countDigitOccurrences(int number, int targetDigit) {
        if (number == 0) {
            return 0; 
        } else {
            int lastDigit = number % 10; 
            int remainingDigits = number / 10; 

           
            int count = (lastDigit == targetDigit) ? 1 : 0;

            
            return count + countDigitOccurrences(remainingDigits, targetDigit);
        }
    }
}
