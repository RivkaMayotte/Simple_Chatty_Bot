import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int threeDigitNumber = scanner.nextInt();
        int thirdDigit = threeDigitNumber / 100;
        int firstSecondDigits = threeDigitNumber % (thirdDigit * 100);
        int secondDigit = firstSecondDigits / 10;
        int firstDigit = firstSecondDigits % 10;
        int reversedNumber = firstDigit * 100 + secondDigit * 10 + thirdDigit;

        System.out.println(reversedNumber);
    }
}