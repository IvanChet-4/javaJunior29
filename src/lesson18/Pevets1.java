package lesson18;

public class Pevets1 extends Thread {
private boolean needStop = false;



    @Override
    public void run() {
        int count = 0;
        while (!needStop){
            count++;
            if (count > 3){
                needStop = true;
            }

            for (int i = 0; i < 3; i++){
                Thread.currentThread().setName("Певец - 1");
                System.out.println(Thread.currentThread().getName() + "  LALA----");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Monitors.MIKROFON){
                Monitors.MIKROFON.notify();
            }


            synchronized (Monitors.MIKROFON){
                try {
                    Monitors.MIKROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
