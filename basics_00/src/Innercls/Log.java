package Innercls;

public class Log {
    private String msg;
    private static int key = 10;

    public void logger(String msg) {
        this.msg = msg;
        System.out.println("[Log]:" + msg);
    }

    /*
    * Inner classes can be static or non static
    * if non static can access all members of outer class
    * if static only static members are allowed
    * */
    public class ConsoleLog {
        public void accessOuterFields() {
            System.out.println("msg: " + msg);
            System.out.println("key: "+ key);
        }

        public void accessOuterMethods() {
            logger("Test msg");
        }
    }
}
