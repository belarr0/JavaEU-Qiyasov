import java.util.Scanner;

class Phone{
    int number;
    String model;
    int weight;
    String name;

    void receiveCall(){
        System.out.println("Call: " + name + " " + "|" + getNumber() + "|");
    }
    int getNumber(){
        return number;
    }
    void setData(int n, String m, int w, String nm){
        number = n;
        model = m;
        weight = w;
        name = nm;
    }
}

class Person{
    String fullName;
    int age;

    void talk(){
        System.out.println(fullName + " say " + age);
    }
    int move(){
        return age;
    }
}

class Goods{
    String name;
    int price;
    int rate;
}
class Category{
    String name;
    //String arr[] = {"battery", "glue", "pen"};
}
public class Start {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        /*
        Phone samsung = new Phone();
        Phone xiaomi = new Phone();
        Phone nokia = new Phone();

        samsung.setData(1256, "Y8D4", 300, "Bryan");
        xiaomi.setData(8426, "R7B2", 320, "Jo");
        nokia.setData(4685, "Q7LL", 320, "Peter");

        samsung.receiveCall();
        xiaomi.receiveCall();
        nokia.receiveCall();
        */


        Person anon1  = new Person();   //Bryan
        Person anon2 = new Person();    //Jo
        Person anon3 = new Person();    //Peter

        System.out.print("Name: ");
        anon1.fullName = in.next();
        anon1.age = 26;

        System.out.print("Name: ");
        anon2.fullName = in.next();
        anon2.age = 44;

        System.out.print("Name: ");
        anon3.fullName = in.next();
        anon3.age = 32;

        anon1.talk();
        anon2.talk();
        anon3.talk();

    }
}
