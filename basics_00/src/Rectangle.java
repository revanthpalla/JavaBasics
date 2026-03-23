/* Access modifiers
 *  public, private, default, protected
 * public - anywhere accessable
 * private - within class
 * default - within package
 * protected - within package and child classes of other package
 * */
public class Rectangle {
    private int len = 0, brd = 0;
    private static int count = 0;

    public Rectangle() {++count;}
    /*
     * this acts as a current class reference
     * when we overload a constructor we need to create default constructor explicitly
     * this reference of every member function has access to address of obj it is called
     * */
    public Rectangle(int len, int brd) {
        this();
        this.len = len;
        this.brd = brd;
    }
    /* static functions accepts only static variables
     * ClassName.static_function_name()
     *
     * static methods cant access instance variables directly just like instance methods
     * class Test {
     * int a, b;
     * static void reader() {
     *   sout (a); // error
     * }
     *
     * static void reader() {
     *   Test t = new Test();
     *   sout (t.a); // allowed
     * }
     * }
     *
     * */
    public void printData() {
        System.out.printf("(%d, %d)", len, brd);
        System.out.print("\n");
    }

    public void area() {
        int a = len * brd;
        int p = 2 * (len + brd);
        System.out.println("Area = " + a);
        System.out.println("perimeter = " + p);
    }

    public static int referenceCount() {
        return count;
    }
}