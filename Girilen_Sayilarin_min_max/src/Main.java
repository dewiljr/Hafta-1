import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        int girilecekSayiMiktari, girilenSayi, i=1, maxNumber=0, minNumber=0 ;

        Scanner inp = new Scanner(System.in);

        //kullanıcıdan kaç sayı girilecek onu alıyoruz.

        System.out.println("Kaç tane sayı gireceksiniz : ");
        girilecekSayiMiktari= inp.nextInt();

        for (i=0; i < girilecekSayiMiktari; i++ )
        {
            System.out.println("Sayı Giriniz : ");

            //kullanıcıdan sayıları alıyoruz.
            girilenSayi = inp.nextInt();

            if (girilenSayi<minNumber){
                minNumber = girilenSayi;
            }
            if (girilenSayi>maxNumber)
            {
                maxNumber = girilenSayi;
            }
        }


        System.out.println("En Büyük Sayı : " + maxNumber);
        System.out.println("En Küçük Sayı : " + minNumber);
    }
}