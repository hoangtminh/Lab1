import java.util.Scanner;

public class Ex2_2_6 {
    public static void main(String[] args) {
        firstDegreeEquation();
        linearSystem();
        secondDegreeEquation();
    }

    private static void firstDegreeEquation() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        if (a != 0) {
            System.out.println( -b / a);
        } else if (b == 0) {
            System.out.println("Vo so nghiem");
        } else {
            System.out.println("Vo nghiem");
        }

        sc.close();
    }

    private static void linearSystem() {
        Scanner sc = new Scanner(System.in);
        double a1 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double c1 = sc.nextDouble();

        double a2 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double c2 = sc.nextDouble();

        if (a1 / a2 != b1 / b2) {
            double x1 = (c1 * b2 - c2 * b1) / (a1 * b2 - a2* b1);
            double x2 = (a1 * c2 - a2 * c1) / (a1 * b2 - a2* b1);
            System.out.println(x1 + " " + x2);
        } else if (a1 / a2 == c1 / c2) {
            System.out.println("Vo so nghiem");
        } else {
           System.out.println("Vo nghiem"); 
        }

        sc.close();
    }

    private static void secondDegreeEquation() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a != 0) {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Vo nghiem");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println(x);
            } else {
                double x1 = (-b + Math.floor(delta) / (2 * a));
                double x2 = (-b - Math.floor(delta) / (2 * a));
                System.out.println(x1 + " " + x2);
            }
        } else {
            if (b != 0) {
                double x = -c / b;
                System.out.println(x);
            } else {
                if (c != 0 ) {
                    System.out.println("Vo nghiem");
                } else {
                    System.out.println("Vo so nghiem");
                }
            }
        }

        sc.close();
    }
}