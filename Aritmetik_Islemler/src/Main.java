import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, c, d;

        //Önce İşlemi Tanıtıyoruz
        System.out.println("a+b*c-b İşlemi İçin");
        //Burada Kullanıcıdan Verilerimizi Alıyoruz
        System.out.print("Lütfen a Sayısını Giriniz : ");
        a = inp.nextInt();
        System.out.print("Lütfen b Sayısını Giriniz : ");
        b = inp.nextInt();
        System.out.print("Lütfen c Sayısını Giriniz : ");
        c = inp.nextInt();

        //Burada Programımıza İşlemimizi Yaptırıyoruz
        d = a+b*c-b;

        System.out.print("Cevabınız : " + d);


    }
}