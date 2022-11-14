class Student {
    String fName;
    String lName;
    String group;
    double avMark;
    int stup;

    Student(String fn, String ln, String g, double av, int s){
        this.fName = fn;
        this.lName = ln;
        this.group = g;
        this.avMark = av;
        this.stup = s;
    }
}
class Aspirant extends Student{
    String Sincework;
    Aspirant (String fn, String ln, String g, double av, int s, String sw){
        super(fn, ln, g, av, s);
        this.Sincework = sw;
    }

    void talk(){
        System.out.println(avMark);
    }
}

public class Start {
    public static void main (String[] args){
        Student first = new Student("Bob", "Jackson", "044", 10.0, 180);
        Aspirant second = new Aspirant("Bob", "Jackson", "044", 10.0, 180, "Since");

    }
}
