import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next().toUpperCase();
        boolean inputPrefixComparison = input.startsWith("J");

        System.out.println(inputPrefixComparison);
    }
}