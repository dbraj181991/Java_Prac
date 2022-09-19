package selennium;

public class MethodChaining {
    public static void main(String[] args) {
        MethodChaining m = new MethodChaining();
        m.t1();

    }

    public void t1() {
        System.out.println("print t1");
        t2();

    }

    public void t2() {
        System.out.println("print t2");
        t3();


    }

    public void t3() {
        System.out.println("print t3");
        t1();


    }

}
