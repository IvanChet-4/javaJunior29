package lesson18;

public class Pevets2 extends Thread{

    @Override
    public void run() {
        while (true){

            synchronized (Monitors.MIKROFON) {
                try {
                    Monitors.MIKROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (int i = 0; i < 2; i++){
                Thread.currentThread().setName("Певец - 2");
                System.out.println(Thread.currentThread().getName() + "  ----FAFA");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Monitors.MIKROFON){
                Monitors.MIKROFON.notify();
            }
        }
    }

}
