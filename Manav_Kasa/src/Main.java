import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5, total;

        Scanner inp = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        armutKg = inp.nextInt();
        System.out.print("Elma Kaç Kilo ? : ");
        elmaKg = inp.nextInt();
        System.out.print("Domates Kaç Kilo ? : ");
        domatesKg = inp.nextInt();
        System.out.print("Muz Kaç Kilo ? : ");
        muzKg = inp.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanKg = inp.nextInt();

        total = (armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) + (patlican * patlicanKg);
        System.out.println("Toplam Tutar : " + total + " TL");

    }
}