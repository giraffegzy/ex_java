package demolock;


public class deadlock implements Runnable {
private int i = 0;
    @Override
    public void run() {
        while (true){
            if (i%2==0){
                synchronized (lockA.locka){
                    System.out.println("if获得A锁");
                    synchronized (lockB.lockb){
                        System.out.println("if获得B锁");
                    }
                }
            }else {
                synchronized (lockB.lockb){
                    System.out.println("else获得B锁");
                    synchronized (lockA.locka){
                        System.out.println("else获得A锁");
                    }
                }
            }
            i++;
        }
    }
}
