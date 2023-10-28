//WAP to check whether the given number is palindrome or not.

public class code10 {
    public static void main(String[] args) {
        int number = 12321; 
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int number) {
        String numberStr = String.valueOf(number); 
        return isPalindromeHelper(numberStr, 0, numberStr.length() - 1);
    }

    private static boolean isPalindromeHelper(String str, int start, int end) {
        if (start >= end) {
            return true; 
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false; 
        }

        return isPalindromeHelper(str, start + 1, end - 1); 
    }
}
