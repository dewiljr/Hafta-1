import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        //Değişkenleri oluştur
        int mat, fiz, kim, trk, tar, muz;

        //Scanner sınıfımızı tanımladık
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan notları çek
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tar = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fiz = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kim = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        trk = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muz = inp.nextInt();

        int toplam = (mat + tar + fiz + kim + trk + muz);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız : " + sonuc);

        String durum = (sonuc >= 60) ? "Geçtiniz" : "Kaldınız";
        System.out.println(durum);

    }
}