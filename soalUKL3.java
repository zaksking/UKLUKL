import java.util.Scanner;
import java.util.Random;

public class soalUKL3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random acak = new Random();

        System.out.println("Mau berapa soal? ");
        int JSoal = scan.nextInt();

        for (int i = 1; i <= JSoal; i++) {
            int a = acak.nextInt(10) + 1;
            int b = acak.nextInt(10) + 1;
            int operator = acak.nextInt(3);

            int jawaban = 0;
            String simbol = "";

            if (operator == 0) {
                simbol = "x";
                jawaban = a * b;
            } else if (operator == 1) {
                simbol = "/";
                jawaban = a / b;
            } else if (operator == 2) {
                simbol = "+";
                jawaban = a + b;
            } else if (operator == 3) {
                simbol = "-";
                jawaban = a - b;
            }

            System.out.println("Berapa " + a + simbol + b);
            int user = scan.nextInt();

            if (user == jawaban) {
                System.out.println("Jawabannya benar");
            } else {
                System.out.println("Jawabannya salah seharusnya adalah " + jawaban);
            }
        }
    }
}
