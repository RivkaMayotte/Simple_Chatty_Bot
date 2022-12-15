import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upperRange = 10;
        int lowerRange = 0;

        int input = scanner.nextInt();
        boolean withinRange = input < upperRange && input > lowerRange;

        System.out.println(withinRange);
    }
}