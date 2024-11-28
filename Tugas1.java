import java.util.Scanner;

public class Tugas1 {

    public static void deretDescendingRecursive(int n) {
        if (n < 0) {
            return;
        }
        System.out.print(n + " ");
        deretDescendingRecursive(n - 1);
    }

    public static void deretDescendingIterative(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai n: ");
        int n = sc.nextInt();

        System.out.print("Dengan Rekursif: ");
        deretDescendingRecursive(n);

        System.out.print("\nDengan Iteratif: ");
        deretDescendingIterative(n);
    }
}
