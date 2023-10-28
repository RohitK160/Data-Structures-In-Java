//WAP to print the sum of n natural numbers.

public class code3{
    public static void main(String[] args) {
        int n = 5; 
        int sum = calculateSum(n);
        System.out.println("Sum of first " + n + " natural numbers: " + sum);
    }

    public static int calculateSum(int n) {
        if (n == 1) {
            return 1; 
        } else {
            return n + calculateSum(n - 1); 
        }
    }
}
