import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int day;
        String month;

        Scanner inp = new Scanner(System.in);

        System.out.print("Doğduğunuz Ayı Giriniz(örneğin ocak, şubat...) : ");
        month = inp.nextLine();

        System.out.print("Doğduğunuz Günü Giriniz : ");
        day = inp.nextInt();

        if (day<1 || day>31)
        {
            System.out.println("Geçersiz Gün Girdiniz");
        }

        else if (month.equals("ocak")){
            if (day<22){
                System.out.println("Oğlak Burcusunuz");
            }
            else {
                System.out.println("Kova Burcusunuz");
            }
        }
        else if (month.equals("şubat"))
        {
            if (day<20)
            {
                System.out.println("Kova Burcusunuz");
            }
            else
            {
                System.out.println("Balık Burcusunuz");
            }
        }
        else if (month.equals("mart"))
        {
            if (day<21)
            {
                System.out.println("Balık Burcusunuz");
            }
            else
            {
                System.out.println("Koç Burcusunuz");
            }
        }
        else if (month.equals("nisan"))
        {
            if (day<21)
            {
                System.out.println("Koç Burcusunuz");
            }
            else
            {
                System.out.println("Boğa Burcusunuz");
            }
        }
        else if (month.equals("mayıs"))
        {
            if (day<22)
            {
                System.out.println("Boğa Burcusunuz");
            }
            else
            {
                System.out.println("İkizler Burcusunuz");
            }
        }
        else if (month.equals("haziran"))
        {
            if (day<23)
            {
                System.out.println("İkizler Burcusunuz");
            }
            else
            {
                System.out.println("Yengeç Burcusunuz");
            }
        }
        else if (month.equals("temmuz"))
        {
            if (day<23)
            {
                System.out.println("Yengeç Burcusunuz");
            }
            else
            {
                System.out.println("Aslan Burcusunuz");
            }
        }
        else if (month.equals("ağustos"))
        {
            if (day<23)
            {
                System.out.println("Aslan Burcusunuz");
            }
            else
            {
                System.out.println("Başak Burcusunuz");
            }
        }
        else if (month.equals("eylül"))
        {
            if (day<23)
            {
                System.out.println("Başak Burcusunuz");
            }
            else
            {
                System.out.println("Terazi Burcusunuz");
            }
        } else if (month.equals("ekim"))
        {
            if (day<23)
            {
                System.out.println("Terazi Burcusunuz");
            }
            else
            {
                System.out.println("Akrep Burcusunuz");
            }
        }
        else if (month.equals("kasım"))
        {
            if (day<22)
            {
                System.out.println("Akrep Burcusunuz");
            }
            else
            {
                System.out.println("Yay Burcusunuz");
            }
        }
        else if (month.equals("aralık")) {
            if (day < 22) {
                System.out.println("Yay Burcusunuz");
            } else {
                System.out.println("Oğlak Burcusunuz");
            }

        }
        else
        {
            System.out.println("Yanlış Ay Girdiniz");
        }
    }
}