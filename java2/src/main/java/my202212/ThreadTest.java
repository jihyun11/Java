package my202212;

public class ThreadTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        thread.start();
        thread1.start();
        thread2.start();
        MyThread myThread = new MyThread(); //클래스 상속 사용
        myThread.start();
        MyThread2 myThread2 = new MyThread2(); //인터페이스 사용
        Thread thread3 = new Thread(myThread2); //인터페이스 사용
        thread3.start();
    }
}
