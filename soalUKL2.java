import java.util.Scanner;

public class soalUKL2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int uang;
        int pecahanUang[] = {50000, 20000, 10000, 5000, 200, 100};

        System.out.print("Masukan jumlah uang = ");
        uang = scan.nextInt();

        if (uang >= 100000) {
            System.out.println("maksimal hanya 6 digit!");
        } else {
            for (int i = 0; i < pecahanUang.length; i++) {
                int lembar = uang / pecahanUang[i];
                uang %= pecahanUang[i];
    
                if (lembar > 0) {
                    System.out.println(lembar + " lembar " + pecahanUang[i]);
                }
            }
        }

        //maksimal 6 digit, 2000 dan 1000 ket menjadi koin 
    }
}