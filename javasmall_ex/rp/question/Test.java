package javasmall_ex.rp.question;


public class Test {
    public static void main(String[] args) {
        Resource r = new Resource();
        Input in = new Input(r);
        Ounput ot = new Ounput(r);

        Thread tin = new Thread(in);
        Thread tout = new Thread(ot);

        tin.start();
        tout.start();
    }
}
