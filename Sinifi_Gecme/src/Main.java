import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double mat, fiz, trk, kim, muz, ortalama;
        int gecersiz=0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextDouble();
        if (0>mat || mat>100)
        {
            gecersiz = gecersiz + 1;
            mat = 0;
        }

        System.out.print("Fizik Notunuz : ");
        fiz = inp.nextDouble();
        if (0>fiz || fiz>100)
        {
            gecersiz = gecersiz + 1;
            fiz = 0;
        }

        System.out.print("Türkçe Notunuz : ");
        trk = inp.nextDouble();
        if (100<trk || trk<0 )
        {
            gecersiz = gecersiz + 1;
            trk = 0;
        }

        System.out.print("Kimya Notunuz : ");
        kim = inp.nextDouble();
        if (100<kim || kim<0)
        {
            gecersiz = gecersiz + 1;
            kim = 0;
        }

        System.out.print("Müzik Notunuz : ");
        muz = inp.nextDouble();
        if (100<=muz || muz<=0)
        {
            gecersiz = gecersiz + 1;
            muz = 0;
        }
        ortalama = (mat+fiz+trk+kim+muz)/(5-gecersiz);

            if (ortalama>=55)
            {
                System.out.print("Tebrikler Sınıf Geçtiniz!");
            }
            else
            {
                System.out.print("Sınıfta Kaldınız!");
            }

        System.out.println("Ortalamanız : "+ ortalama);

    }
}