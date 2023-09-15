import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km, yas, tip,hata=0;
        double yasIndirimi = 1, sonuc=0, gdIndirimi = 1, normalTutar;

        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        km = inp.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yas= inp.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        tip = inp.nextInt();
        if (km<1)
        {
            System.out.println("Hatalı Veri Girdiniz!");
            hata = hata + 1;
        }
        else
        {
            normalTutar = km/10;
            sonuc = normalTutar * yasIndirimi * gdIndirimi;
        }
        if (yas<1)
        {
            System.out.println("Hatalı Veri Girdiniz!");
            hata = hata + 1;
        }
        else if (yas<12)
        {
            yasIndirimi=5/10;
        }
        else if (11<yas && yas<25)
        {
            yasIndirimi=9/10;
        }
        else if (yas>64) {
            yasIndirimi=7/10;
        }
        else
        {
            yasIndirimi=1;
        }
        if (tip==1)
        {
            gdIndirimi = 1;
        }

        else if (tip==2)
        {
            gdIndirimi = 16/10;
        }
        else
        {
            System.out.println("Hatalı Veri Girdiniz!");
            hata = hata + 1;
        }
        if (hata == 0 )
        {
            System.out.println("Bilet fiyatınız bu : " + sonuc + "TL");
        }



    }
}