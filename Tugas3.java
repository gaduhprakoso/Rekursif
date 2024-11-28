import java.util.Scanner;
public class Tugas3 {

    static int fibonacciMarmut(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        }
        return fibonacciMarmut(bulan - 1) + fibonacciMarmut(bulan - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bulan ke-n: ");
        int bulan = sc.nextInt();

        int hasil = fibonacciMarmut(bulan);
        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulan + ": " + hasil);
    }
}