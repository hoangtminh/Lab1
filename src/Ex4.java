import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input month: ");
        int month = scanner.nextInt();
        System.out.print("Input year: ");
        int year = scanner.nextInt();

        String days;

        switch (month) {
            case 1,3,5,7,8,10,12:
                days = "31";
                break;
            case 4,6,9,11:
                days = "30";
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    days = "29";
                } else {
                    days = "28";
                }
                break;
            default:
                days = "Invalid";
                break;
        }

        System.out.println(days);
        scanner.close();
    }
}
