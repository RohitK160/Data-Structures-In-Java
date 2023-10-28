/// WAP to display the first 10 natural numbers in reverse order.

public class code2 {
    public static void main(String[] args) {
        printReverseNumbers(10);
    }

    public static void printReverseNumbers(int n) {
        if (n > 0) {
            System.out.println(n);
            printReverseNumbers(n - 1); 
        }
    }
}
