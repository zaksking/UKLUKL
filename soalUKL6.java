import java.util.Scanner;
public class soalUKL6 {
    public static void main(String[] args) {
        int totalBiaya = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nama peminjam = ");
        String namaPeminjam = scan.nextLine();
        System.out.println("Judul buku = ");
        String judulBuku = scan.nextLine();
        System.out.println("Pilih kategori buku (A, B atau C)");
        String kategoriBuku = scan.nextLine();
        System.out.println("Lama pemninjaman buku (hari)= ");
        int lamaPeminjaman = scan.nextInt();

        if (kategoriBuku.equalsIgnoreCase("a")) {
            totalBiaya = lamaPeminjaman * 2000;
        }else if (kategoriBuku.equalsIgnoreCase("b")) {
            totalBiaya = lamaPeminjaman * 1500;
        }else if (kategoriBuku.equalsIgnoreCase("c")) {
            totalBiaya = lamaPeminjaman * 1000;
        }
        int denda = 0;

        if (lamaPeminjaman > 7) {
            int terlambat= lamaPeminjaman - 7; 
            denda = terlambat * 500;
        }

        System.out.println("Nama peminjam adalah = "+namaPeminjam);
        System.out.println("Judul buku yang dipinjam = "+judulBuku);
        System.out.println("Kategori bukunya adalah = "+kategoriBuku);
        System.out.println("Biaya peminjaman awal = "+ totalBiaya);
        System.out.println("Masa peminjaman = "+lamaPeminjaman+" hari");
        System.out.println("biaya denda adalah = "+denda);
        System.out.println("Biaya akhir adalah = "+ (denda + totalBiaya));
    }
}
