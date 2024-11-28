import java.util.Scanner;

public class Tugas2 {

    public static int PenjumlahanRekursif(int n, int x) {
        if (x == n) {
            System.out.print(x);
            return x;
        } else {
            System.out.print(x + "+");
            return x + PenjumlahanRekursif(n, x + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai f: ");
        int f = sc.nextInt();

        int hasil = PenjumlahanRekursif(f, 1);

        System.out.println(" = " + hasil);
    }
}