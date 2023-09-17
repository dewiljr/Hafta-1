public class Main {
    public static void main(String[] args) {

        int j, test=0, i ;

        for (j = 2 ; j <= 100 ; j++ )
        {
            for (i = 2 ; i < j ; i++)
            {
                if (j % i==0)
                {
                    test = 1;
                    break;
                }
                else {
                    test=0;
                }
            }
            if (test==0){
                System.out.print(j+ " ");

            }
        }

    }
}