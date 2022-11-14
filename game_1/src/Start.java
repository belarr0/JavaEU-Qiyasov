import java.util.Scanner;

public class Start {
    static void guessnumgame()
    {
        Scanner in = new Scanner(System.in);

        int num = -20 + (int) (20 * Math.random());
        int guess;
        int trial = 5;

        for (int i = 0; i < trial; i++){
            System.out.print("Ur number: ");
            guess = in.nextInt();

            if(guess == num){
                System.out.println("U won, gj");
                break;
            }
            else if(guess > num && i != trial - 1){
                System.out.println("Ur number greater");
            }
            else if(guess < num && i != trial - 1){
                System.out.println("Ur number less");
            }
            if(i == trial - 1){
                System.out.println("---------------");
                System.out.println("Trial is over, number was : " + num);

                if(num == guess - 1 || num == guess + 1){
                    System.out.println("You was close");
                }
            }
        }
    }


    public static void main (String[] args){
        System.out.println("Guess the number (-20 to 20): ");
        System.out.println("---------------");

        guessnumgame();

    }
}
