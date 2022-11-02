class Phone{
    int number;
    String model;
    int weight;
    String name;

    Phone(int n, String m, int w, String nm){
        this.number = n;
        this.model = m;
        this.weight = w;
        this.name = nm;
    }
    Phone(int n, String m){
        this.number = n;
        this.model = m;
    }

    void talk(){
        System.out.println("num: |" + number + "| model: |" + model + "| weight: |" + weight + "|");
    }

    void receiveCall(){
        System.out.println("Call: " + name + " " + "- |" + getNumber() + "|");
    }
    int getNumber(){
        return number;
    }
}

public class Start {
    public static  void main (String[] args){
        Phone ph1 = new Phone(2561, "Y8N4", 300, "Jo");
        Phone ph2 = new Phone(9824, "G56M", 400, "Peter");
        Phone ph3 = new Phone(6482, "Q9P1", 350, "Bob");

        Phone ph4 = new Phone(9882, "G5P1");
        Phone ph5 = new Phone(2524, "Y86M");

        ph1.talk();
        ph2.talk();
        ph3.talk();

        ph1.receiveCall();
        ph2.receiveCall();
        ph3.receiveCall();
    }
}
