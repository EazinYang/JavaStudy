package Day17;

public class Rabbit extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=30;i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("兔子跑了" + i + "米");
            if (i == 10 || i == 20) {
                System.out.println("兔子在休息...");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
