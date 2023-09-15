import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double temelDeger, kdvOran, kdvTutar, kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücreti Giriniz : ");
        temelDeger =input.nextDouble();

        if (temelDeger <= 1000) {
            kdvOran = 0.18;
            kdvTutar = temelDeger * kdvOran;
            kdvliTutar = temelDeger + kdvTutar;
            System.out.println("KDV Oranınız : %18" );
            System.out.print("KDV'li Tutar : " + kdvliTutar + " TL");
        }
        if (1000 < temelDeger) {
            kdvOran = 0.08;
            kdvTutar = temelDeger * kdvOran;
            kdvliTutar = temelDeger + kdvTutar;
            System.out.println("KDV Oranınız : %8" );
            System.out.println("KDV'li Tutar : "+ kdvliTutar + " TL");

        }


    }
}