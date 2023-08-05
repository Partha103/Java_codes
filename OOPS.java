public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen(); // Created a pen object calles p1
        p1.setColor("Blue");
        p1.settip(5);
        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
}

class Pen { // a class pen
    String color;
    int tip;

    void setColor(String newcolor) {
        color = newcolor;
    }

    void settip(int newtip) {
        tip = newtip;
    }
}