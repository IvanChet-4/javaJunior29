package lesson18;
//Поток Thread и Runnable
public class Main {
    public static void main(String[] args) {

        SecondThread secondThread = new SecondThread();
        secondThread.start();

        Thread myThread = new Thread(new MyThread());
        myThread.start();

        for (int i = 0; i < 10; i++){
            Thread.currentThread().setName("Поток-1");
            System.out.println(i + " --- " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);//
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
