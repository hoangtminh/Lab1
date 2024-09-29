import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the height of triangle: ");
        int height = scanner.nextInt();
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height-i-1; j++) {
                System.out.print(" ");
            }
            
            for (int k = 0; k < 2*i + 1; k++) {
                System.out.print("*");
            }
            for (int j = 0; j < height-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }

        scanner.close();
    }
}
