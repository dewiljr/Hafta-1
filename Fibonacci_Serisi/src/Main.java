import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int entry, i, j, x=0, y=1;

        System.out.print("Fibonacci serisinin eleman sayısını yazınız : ");
        entry = inp.nextInt();

        System.out.print(x + " " +  y + " ");

        for (i=2; i<entry; i++)
        {
            j=x+y;
            System.out.print(j + " ");
            x=y;
            y=j;

        }
    }
}