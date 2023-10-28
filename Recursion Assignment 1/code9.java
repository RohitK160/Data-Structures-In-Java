//WAP to print string in reverse order.

public class code9 {
    public static void main(String[] args) {
        String inputString = "Hello, World!"; 
        printStringInReverse(inputString);
    }

    public static void printStringInReverse(String str) {
        if (str == null || str.isEmpty()) {
            return; 
        } else {
            
            System.out.print(str.charAt(str.length() - 1));

            
            printStringInReverse(str.substring(0, str.length() - 1));
        }
    }
}
