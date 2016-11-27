package fibonachi;

/**
 * Created by Sergey on 11/15/2016.
 */
public class fib {
    public static void main(String[] args) throws Exception
    {
        int n1=0, n2=1, n3=0;
        //int sum=0;
        System.out.println("1="+n1);
        System.out.println("2="+n2);
        TheNextNum (n1, n2);
    }

    private static void TheNextNum(int n1, int n2) {
        int n3;
        for (int i = 1; i<=28; i++) {
            n3=n1+n2;
            System.out.println((i+2)+"="+n3);
            n1=n2; n2=n3;
        }
    }

}


