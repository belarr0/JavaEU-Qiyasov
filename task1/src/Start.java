import javax.annotation.processing.SupportedSourceVersion;

public class Start {
    public static void main (String[] args){
/*
        int n = 56;

        int r1 = 56 / 10;
        int r2 = 56 % 10;

        System.out.println(r2 + "" + r1);

 */

/*
        int n = 123;

        int n1 = n / 100;
        int n2 = (n / 10) % 10;
        int n3 = n % 10;

        System.out.println(n1 + n2 +  n3);
        System.out.println(n1 * n2 *  n3);
*/


        int pal = 2332;

        int n1 = pal / 1000;
        int n2 = pal % 1000 / 100;
        int n3 = pal % 100 / 10;
        int n4 = pal % 10;

        System.out.print("Pal? - ");

        if(n1 == n4 && n2 == n3){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }

        //System.out.println(n1 + " " + n2 + " " +  n3 + " " + n4);

    }
}
