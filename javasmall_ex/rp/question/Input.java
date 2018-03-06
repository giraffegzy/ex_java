package javasmall_ex.rp.question;

/**
 * Created by lenovo on 2017/11/24.
 */
public class Input implements  Runnable {
    private Resource r;
    public Input(Resource r) {
        this.r =r;
    }

    public void run() {
        int i =0;
        while (true) {
            synchronized (r) {
                if (r.flag){
                    try {
                        r.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (i % 2 == 0) {
                    r.name = "a";
                    r.sex = "男";
                } else {
                    r.name = "b";
                    r.sex = "nv";
                }
                r.flag=true;
                r.notify();

            }
            i++;
        }
    }
}
