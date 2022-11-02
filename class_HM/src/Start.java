import java.util.Scanner;

class Calculator{
    int n1;
    int n2;
    char action;

    void talk_plus(){
     System.out.print(n1 + n2);
    }
    void talk_minus(){
        System.out.print(n1 - n2);
    }
    void talk_division(){
        System.out.print(n1 / n2);
    }
    void talk_multiplication(){
        System.out.print(n1 * n2);
    }
    void talk_square(){
        System.out.print(Math.pow(n1, n2));
    }


    int talk_minus(int f, int s){
        return f - s;
    }
    int talk_division(int f, int s){
        return f / s;
    }
    int talk_plus(int f, int s){
        return f + s;
    }
    int talk_multiplication(int f, int s){
        return f * s;
    }
    double talk_square(double f, double s){
        return Math.pow(f, s);
    }
}

public class Start {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        int q = 3;
        int w = 15;
        int e = 67;

        Calculator math = new Calculator();

        System.out.print("Enter first number: ");
        math.n1 = in.nextInt();
        System.out.print("Enter first number: ");
        math.n2 = in.nextInt();

        System.out.print("choose an action (+, -, *, /, s): ");
        char action = in.next().charAt(0);

        switch (action){
            case ('+'):
                math.talk_plus();
                break;
            case ('-'):
                math.talk_minus();
                System.out.print(math.talk_minus(q, e));
                break;
            case ('*'):
                math.talk_multiplication();
                break;
            case ('/'):
                System.out.print(math.talk_division(q, e));
                break;
            case ('s'):
                math.talk_square();
                break;
        }


    }
}
