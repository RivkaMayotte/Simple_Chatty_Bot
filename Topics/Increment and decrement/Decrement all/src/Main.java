import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        int numberFour = scanner.nextInt();

        System.out.print(--numberOne + " " + --numberTwo + " " + --numberThree + " " + --numberFour);
    }
}