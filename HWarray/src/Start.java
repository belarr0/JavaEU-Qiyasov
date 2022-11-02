import java.util.Scanner;

public class Start {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

    int num1 = 2;       //1
    int num2 = 2;

    for(int i = 0; i < 19; i++){
        System.out.print(num2 + " ");
        num2 = num1 + num2;
        num1 = num2;
    }


/*
        System.out.print("Enter your number: ");    //2
        int num = in.nextInt();
        int count = 1;

        for (int i = 1; i <= num; i++) {
            count = count * i;
        }
        System.out.print("answer: " + count);
*/


        /*
        System.out.print("Enter your number: ");        //3
        int num = in.nextInt();

        if(num % 2 == 0){
            for (int i = 1; i <= num; i++) {
                if(num % i == 0){
                    System.out.print(num / i + " ");
                }
            }
        }else{
            System.out.print("answer: " + num + " or " + "1");
        }

         */
    }
}
