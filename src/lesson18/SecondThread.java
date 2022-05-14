package lesson18;

public class SecondThread extends Thread {


    @Override
    public void run() {
       for (int i = 100; i < 120; i++){
           Thread.currentThread().setName("Поток-2");
           System.out.println(i + " --- " + Thread.currentThread().getName());
           try {
               Thread.sleep(500);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
