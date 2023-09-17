import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int givenNumber, i, space, j, k=0 ;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Basamak Sayısını Giriniz : ");
        givenNumber = inp.nextInt();

        for (i=0; i<givenNumber; i++)
        {
            for (space=0; space<k; space++)
            {
                System.out.print(" ");
            }
                for (j = 2 * givenNumber - 1; j >= (2 * i + 1); j--) {
                    System.out.print("*");
                }
                System.out.println(" ");
                k++;
                }

    }
}
