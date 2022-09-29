import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        /*
        int p = 10000000;
        int d = 8;
        int b = 14;
        int c = b - d;

        for(int i = 1; i <= 10; i++){
            p += p * c / 1000;
        }
        System.out.println(p);
         */

        /*
        int p = 10000000;
        int b = 14;
        int d = 8;
        for(int i = 1; i <= 10; i++){
            if (b > 7) b -= 1;
            if  (d > 6) d -=1;
            p += p * (b - d) / 1000;
        }
        System.out.println(p);
         */

        /*
        Scanner in = new Scanner(System.in);

        System.out.print("Enter deposit amount: ");
        float sum = in.nextFloat();
        System.out.print("Enter the term of the deposit in months: ");
        int period = in.nextInt();

        for(int i = 1; i <= period; i++){
            sum += sum * 0.07;
        }
        System.out.print("period: " + period + " " + "sum: " + sum);
         */

        /*
        for(int i = 1; i <= 10; i++){
            System.out.println("");
            for(int j = 1; j <= 10; j++){
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
         */

        Scanner in = new Scanner(System.in);
        int a = 0;
        do
        {
            System.out.print("Enter the first number: ");
            int n1 = in.nextInt();
            System.out.print("Enter the second number: ");
            int n2 = in.nextInt();
            System.out.println(n1 + " * " + n2 + " = " + n1 * n2);

            System.out.println("To exit the program, press the number 1, to continue any other number");
            a = in.nextInt();
        }
        while(a != 1);
    }
}

