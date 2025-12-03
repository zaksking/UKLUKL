import java.util.Scanner;
public class soalUKL4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan jumlah angka yang akan dimasukan");
        int jumlahAngka = scan.nextInt();
        int[] angka = new int[jumlahAngka];
        for(int k = 0; k < jumlahAngka; k++) {
            System.out.println("Masukan angkanya ");
            angka[k] = scan.nextInt();
        }

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] == -1) continue; 

            int count = 0;

            for (int j = 0; j < angka.length; j++) {
                if (angka[i] == angka[j]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(angka[i] + " muncul sebanyak " + count);
            }

            for (int j = i + 1; j < angka.length; j++) {
                if (angka[i] == angka[j]) {
                    angka[j] = -1;
                }
            }
        }
    }
}