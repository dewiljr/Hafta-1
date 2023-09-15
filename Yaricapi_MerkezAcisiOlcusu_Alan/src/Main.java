import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double r, pi=3.14, merkezAci;

        Scanner girdi = new Scanner(System.in);

        System.out.print("Dairenin Yarıçapını Giriniz : ");
        r = girdi.nextDouble();
        System.out.print("Dairenin Merkez Açısını Giriniz : ");
        merkezAci = girdi.nextDouble();

        double alan = pi * r * r * merkezAci / 360;

        System.out.println("Daire Diliminin Alanı : " + alan);
    }
}