import java.util.Scanner;

public class PersonalAssistant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Hello! My name is Cortana.");
        System.out.println("I was created in 2019.");
        System.out.println("Please, remind me your name.");

        // reading a name

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        // reading all remainders

        int rem1 = scanner.nextInt();
        int rem2 = scanner.nextInt();
        int rem3 = scanner.nextInt();

        int age = ((rem1 % 3) * 70 + (rem2 % 5) * 21 + (rem3 % 7) * 15) % 105;

        System.out.println("Your age is " + age +"; that's a good time to start programming!");
    }
}