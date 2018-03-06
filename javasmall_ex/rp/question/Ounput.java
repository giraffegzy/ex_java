package javasmall_ex.rp.question;


public class Ounput implements Runnable{
    private Resource r ;

    public Ounput(Resource r) {
        this.r = r;
    }

    public void run() {
        while (true) {
            synchronized (r) {
                if (!r.flag){
                    try {
                        r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(r.name + "-----" + r.sex);
                r.flag=false;
                r.notify();
            }
        }
    }
}
