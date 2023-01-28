package my202212;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

}
