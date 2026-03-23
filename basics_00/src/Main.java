public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 5);
        r.printData();
        r.area();
        new Rectangle(3,4);
        System.out.println(Rectangle.referenceCount());
    }
}