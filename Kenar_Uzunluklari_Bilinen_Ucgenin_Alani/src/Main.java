import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double a, b, c, u;
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarın Santimetre Değerini Giriniz : ");
        a = girdi.nextDouble();
        System.out.print("2. Kenarın Santimetre Değerini Giriniz : ");
        b = girdi.nextDouble();
        System.out.print("3. Kenarın Santimetre Değerini Giriniz : ");
        c = girdi.nextDouble();

        u = (a+b+c)/2;
        System.out.println("Üçgenin Alanı : " + Math.sqrt(u * (u - a) * (u - b) * (u - c)) + " cm^2");


    }
}