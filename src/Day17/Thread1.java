package Day17;

public class Thread1 extends Thread {
    private static int i = 1;
    private static Object lock = new Object();

    public Thread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (i <= 100) {
            synchronized (lock) {
                if (i <= 99) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                    i++;
                    try {
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                    i++;
                    lock.notify();
                }
            }
        }
    }
}