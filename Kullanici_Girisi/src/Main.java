import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String username="patika", Password="java123", denemeUserName, girilenPassword, sifreCevap, yeniPassword;

        Scanner inp = new Scanner(System.in);


        System.out.print("Kullanıcı Adını Giriniz : ");
        denemeUserName = inp.nextLine();

        if (!denemeUserName.equals(username))
        {
            System.out.println("Kullanıcı Adınız Hatalı!");
        }

        else
        {
            System.out.print("Şifrenizi Giriniz : ");
            girilenPassword = inp.nextLine();

            if (girilenPassword.equals(Password))
            {
                System.out.println("Giriş Başarılı!");
            }
            else
            {
                System.out.println("Şifreniz Hatalı! ");
                System.out.print("Yeni Şifre Oluşturmak İster Misiniz? (E/H) : ");
                sifreCevap = inp.nextLine();

                if (sifreCevap.equals("E"))
                {
                    System.out.print("Yeni Şifrenizi Giriniz : ");
                    yeniPassword = inp.nextLine();

                    if (!yeniPassword.equals(Password))
                    {
                        System.out.print("Yeni Şifre Oluşturuldu!");
                    }
                    else
                    {
                        System.out.print("Yeni Şifreniz Eski Şifrenizle Aynı Olamaz!");
                    }
                }
                else
                {
                    System.out.print("Şifre Oluşturulma İşleminiz İptal Edilmiştir!");
                }
            }

        }


    }
}



