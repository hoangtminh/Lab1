import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What's your name? ");
        String name = keyboard.nextLine();
        System.out.println("How old are you?" );
        int age = keyboard.nextInt();
        System.out.println("How tall are you (m)?");
        double height = keyboard.nextDouble();

        System.out.println("Hello " + name + "! You are " + age + " years old, your height is " + height + "m");
        keyboard.close();
    }
}
