import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int givenNumber, i, test=0;

        Scanner inp = new Scanner(System.in);

        //öncelikle kullanıcıdan mükemmel sayının testi için sayı alıyoruz

        System.out.print("Lütfen Test Etmek İstediğiniz Sayıyı Giriniz : ");
        givenNumber = inp.nextInt();

        //burada sayıya kadar mod sayısını alacağımız için for döngüsünde mod sayısını girilen sayıya kadar getiriyoruz
        for ( i=1 ; i<givenNumber; i++)
        {
            //burada sayının alt çarpanlarını buluyoruz
            if (givenNumber % i == 0)
            {
                //alt çarpanları birbiriyle topluyoruz
                test = test + i ;
            }
        }
        //burada alt çarpanlarının toplamının sayının kendisini mi veriyor onu kontrol ediyoruz
        if (test == givenNumber) {
            System.out.print(givenNumber + " Mükemmel Sayıdır!");
        }
        else
        {
            System.out.print("Mükemmel Sayı Değildir!");
        }
    }
}
