import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int buffer = 0;

        for (int i = 1; i <= numberOfElements; i++) {
            int nextElement = scanner.nextInt();
            if (nextElement % 4 == 0 && nextElement > buffer) {
                buffer = nextElement;
            } //if
        } //for
        System.out.println(buffer);
    } //main
} //class