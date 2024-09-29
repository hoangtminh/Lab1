import java.util.Scanner;

public class Ex5 {
    public static int a[] = new int[1000];

    private static void merge(int l, int r, int m) {
        int tmp1[] = new int[1000];
        int  tmp2[] = new int[1000];
        for (int i = l; i <= m; i++ ) {
            tmp1[i] = a[i];
        }
        for (int i = m+1; i <= r; i++ ) {
            tmp2[i] = a[i];
        }

        int i = l;
        int j = m+1;
        int k = l;

        while (i <= m && j <= r) {
            if (tmp1[i] <= tmp2[j]) {
                a[k] = tmp1[i];
                i++;
            } else {
                a[k] = tmp2[j];
                j++;
            }
            k++;
        }
        while (i <= m) {
            a[k] = tmp1[i];
            k++;
            i++;
        }
        while (j <= r) {
            a[k] = tmp2[j];
            k++;
            j++;
        }
        
    }

    private static void sort(int l, int r) {
        if (r <= l) {
            return;
        } else {
            int m = (int)(l + r) / 2;
            System.err.println(l + " " + m + " " + r);
            sort(l,m);
            sort(m+1,r);
            merge(l, r, m);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++ ){
            a[i] = scanner.nextInt();
        }

        sort(0, n-1);

        for (int i = 0; i < n; i++ ){
            System.out.print(a[i] + " ");
        }

        scanner.close();
    }
}
