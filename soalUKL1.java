import java.util.Scanner;

public class soalUKL1 {

    public static boolean prima(int i) {
        if (i < 1)
            return false;
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bilangan;
        int n = 0;
        System.out.println("Masukan angkanya ");
        bilangan = scan.nextInt();

        if (bilangan < 0) {
            System.out.println("bilangan negatif! tidak bisa");
        } else {
            if (bilangan > 0 && bilangan < 10) {
                if (prima(bilangan)) {
                    System.out.println(bilangan + " adalah bilangan prima");
                } else {
                    System.out.println("ini bukan bilangan prima");
                }
            } else if (bilangan > 1000) {
                System.out.println("Bilangan tidak bisa melebihi 1000");
            }
        }
    }
}

// kurang daei 0 ket negatif, 1-10 munculnya tiga adalah prima, lebih dari 10
// ket input salah
