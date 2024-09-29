import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int c[][] = new int[m][n];

        for (int i = 0; i < m; i++ ) {
            for (int  j = 0; j < n; j++ ) {
                a[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++ ) {
            for (int  j = 0; j < n; j++ ) {
                b[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < m; i++ ) {
            for (int  j = 0; j < n; j++ ) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i = 0; i < m; i++ ) {
            for (int  j = 0; j < n; j++ ) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }

        scanner.close();
    }
}
