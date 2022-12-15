import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String greeting = scanner.nextLine();
        String programmingLanguage = scanner.nextLine();
        String profession = scanner.next();
        String profession1 = scanner.next();


        System.out.println(greeting);
        System.out.println(programmingLanguage);
        System.out.println(profession);
        System.out.println(profession1);

    }
}