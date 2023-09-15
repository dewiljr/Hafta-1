import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double km, tutar, perKm = 2.20, total, baslangic = 10 ;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        km = input.nextDouble();
        total = km * perKm;
        total += baslangic;
        total = (total < 20) ? 20 :  total;
        System.out.println("Ücret : " + total + "TL");

    }
}