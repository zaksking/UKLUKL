import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class soalUKL5 {
    public static int kocokAngka() {
        Random acak = new Random();
        return acak.nextInt(6) +1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        ArrayList<Integer> ListUser = new ArrayList<>();
        ArrayList<Integer> ListKomputer = new ArrayList<>();
        int Mkomputer = 0;
        int Muser = 0;
    System.out.println("welkom, ketik apa saja untuk melanjutkan");
        while (Muser < 5 && Mkomputer < 5)  {
                    int komputer = kocokAngka();
        scan.next();
        int user = kocokAngka();

        ListUser.add(user);
        ListKomputer.add(komputer);
        System.out.println("dadu komputer adalah = "+komputer);
        System.out.println("dadu user adalah = "+user);
        if (komputer > user) {
            System.out.println("komputer menang");
            Mkomputer++;
        } else if (komputer < user ) {
            System.out.println("User menang");
            Muser++;
        }else {
            System.out.println("seri");
        }
        }
        System.out.println("========GAME SELESAI========");
        if (Muser == 5) {
            System.out.println("yang menang adalah user");
        }else{
            System.out.println("komputer menang");
        }
    
    
        System.out.println("========dadu user dan komputer========");
        System.out.println("User = "+ListUser);
        System.out.println("Kmpt = "+ListKomputer);
    }
}
