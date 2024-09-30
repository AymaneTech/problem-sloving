import java.util.Scanner;

public class LychrelNumber {
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter number: ");

        Integer number = SCANNER.nextInt();
        Integer palindrome = findPalindrome(number);
        System.out.println(palindrome);
    }

    public static Integer findPalindrome(Integer number) {
        while (!isPalindrome(number)) {
            number += reverseNumber(number);
        }
        return number;
    }

    public static Boolean isPalindrome(Integer number) {
        return number.equals(reverseNumber(number));
    }

    public static Integer reverseNumber(Integer number) {
        Integer reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + (number % 10);
            number /= 10;
        }
        return reversed;
    }
}
