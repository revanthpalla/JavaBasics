package Innercls;

/*
*  creating object for inner class
* Non-static Inner class
* Outerclass out = new Outerclass();
* Outerclass.Innerclass in = out.new Innerclass();
*
* Static Inner class
* Outerclass.Innerclass in = new Outerclass.Innerclass();
*
* */
public class Main {
    public static void main(String[] args) {
        Log l = new Log();
        l.logger("outer-class");
        Log.ConsoleLog cl = l.new ConsoleLog();
        cl.accessOuterFields();
        cl.accessOuterMethods();
    }
}
