import java.util.ArrayList;
import java.util.Scanner;

public class soalUKL7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=== Analisis Laba dan Rugi Penjualan Cookies ===");
        System.out.print("Masukkan jumlah jenis cookies: ");
        int jumlah = scan.nextInt();

        ArrayList<String> nama = new ArrayList<>();
        ArrayList<Integer> produksi = new ArrayList<>();
        ArrayList<Integer> jual = new ArrayList<>();
        ArrayList<Integer> terjual = new ArrayList<>();
        ArrayList<Integer> totalBiaya = new ArrayList<>();
        ArrayList<Integer> totalPendapatan = new ArrayList<>();
        ArrayList<Integer> labaRugi = new ArrayList<>();

        int totalKeseluruhan = 0;
        int labaTertinggi = Integer.MIN_VALUE;
        String cookieTertinggi = "";

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nCookies ke-" + (i + 1) + ":");

            scan.nextLine(); 
            System.out.print("Nama cookies: ");
            String n = scan.nextLine();
            nama.add(n);

            System.out.print("Harga produksi per bungkus: ");
            int p = scan.nextInt();
            produksi.add(p);

            System.out.print("Harga jual per bungkus: ");
            int j = scan.nextInt();
            jual.add(j);

            System.out.print("Jumlah terjual: ");
            int t = scan.nextInt();
            terjual.add(t);

            int biaya = p * t;
            int pendapatan = j * t;
            int laba = pendapatan - biaya;

            totalBiaya.add(biaya);
            totalPendapatan.add(pendapatan);
            labaRugi.add(laba);

            totalKeseluruhan += laba;

            if (laba > labaTertinggi) {
                labaTertinggi = laba;
                cookieTertinggi = n;
            }
        }

        // OUTPUT
        System.out.println("\n-----------------------------------------------------------");
        System.out.println("Nama Cookies | Total Biaya | Total Pendapatan | Laba/Rugi | Status");
        System.out.println("-----------------------------------------------------------");

        for (int i = 0; i < jumlah; i++) {
            String status;
            if (labaRugi.get(i) > 0) {
                status = "Laba";
            } else if (labaRugi.get(i) < 0) {
                status = "Rugi";
            } else {
                status = "Impas";
            }

            System.out.printf("%s | Rp%,d | Rp%,d | Rp%,d | %s\n",
                    nama.get(i),
                    totalBiaya.get(i),
                    totalPendapatan.get(i),
                    labaRugi.get(i),
                    status
            );
        }

        System.out.println("-----------------------------------------------------------");
        System.out.printf("Total Laba/Rugi Keseluruhan: Rp%,d\n", totalKeseluruhan);
        System.out.printf("Cookies dengan Laba Tertinggi: %s (Rp%,d)\n",
                cookieTertinggi, labaTertinggi);
    }
}
