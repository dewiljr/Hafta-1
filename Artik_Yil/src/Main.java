import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int girilenYil;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yılı Giriniz : ");
        girilenYil = inp.nextInt();


        if (girilenYil % 400 == 0 )
        {
            System.out.println(girilenYil + " Artık Bir Yıldır!");
        }
        else if (girilenYil % 100 == 0 )
        {
            System.out.println(girilenYil + " Artık Bir Yıl Değildir!");
        }
        else if (girilenYil % 4 == 0)
        {
            System.out.println(girilenYil + " Artık Bir Yıldır!");
        }
        else
        {
            System.out.println(girilenYil + " Artık Bir Yıl Değildir!");
        }


    }
}