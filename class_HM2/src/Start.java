class Person{
    String fullName;
    int age;

    Person(String n, int a){
        this.fullName = n;
        this.age = a;
    }
    Person(){
        String fullName;
        int age;
    }

    void move(){
        System.out.println(fullName + " say " + age);
    }
    void talk(){
        System.out.println(fullName + " say " + age);
    }
}

class Reader{
    String short_name;
    int number;
    int faculty;
    int born_data;
    int phone;

    int count;
    String books_name;

    Reader(String sh, int c){
        this.short_name = sh;
        this.count = c;
    }
    Reader(String sh, String bn){
        this.short_name = sh;
        this.books_name = bn;
    }


    void returnBook(){

    }
    void takeBook(){
        System.out.println(short_name + " took " + count + " books");
    }
}
public class Start {
    public static void main (String[] args){
        /*
        Person first = new Person("Jo", 30);
        Person second = new Person();

        first.talk();
        second.move();
         */


        Reader r1 = new Reader("Peter.W.W.", 3);

        r1.takeBook();
    }
}
