package demolock;


public class demodead {
    public static void main(String[] args) {
        deadlock dl = new deadlock();
        Thread t1 = new Thread(dl);
        Thread t2 = new Thread(dl);
        t1.start();t2.start();
    }
}
