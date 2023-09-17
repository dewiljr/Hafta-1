import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, x ;
        double b, y;

        System.out.print("Lütfen Ondalıklı Sayıya Dönüşecek Tam Sayıyı Yazın : ");
        a = inp.nextInt();

        System.out.print("Lütfen Tam Sayıya Dönüşecek Ondalıklı Sayıyı Yazın : ");
        y= inp.nextDouble();
        //burada direkt olarak eşitliyoruz çünkü double int'i kapsıyor
        b=a;

        System.out.println("İlk Sayınızın Ondalıklı Sayı Hali : " + b);
        //burada int'i double'a eşitliyoruz fakat sayı ondalıklı kısmını kaybediyor
        x= (int) y;

        System.out.println("İkinci Sayınızın Tam Sayı Hali : " + x);


    }
}