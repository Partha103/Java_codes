public class GettersSetters {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getcolor());
        p1.settip(5);
        System.out.println(p1.gettip());
    }
}

class Pen {
    private String color;
    private int tip;

    String getcolor() {
        return this.color;
    }

    int gettip() {
        return this.tip;
    }

    void setColor(String color) {
        this.color = color;
    }

    void settip(int tip) {
        this.tip = tip;
    }
}
