//WAP to find the factorial of a number.

public class code7 {
    public static void main(String[] args) {
        int number = 5; 
        long factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static long calculateFactorial(int number) {
        if (number == 0 || number == 1) {
            return 1; 
        } else {
            return number * calculateFactorial(number - 1);
        }
    }
}
