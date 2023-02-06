package Day17;

public class Workbench {
    private static final int MAX=10;
    private int count;

    public synchronized void put(){//往工作台放一盘菜
        while(count>=MAX){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        count++;
        System.out.println(Thread.currentThread().getName()+"放了一盘菜，剩余："+count);
        notifyAll();
    }

    public synchronized void take(){//从工作台取走一盘菜
        while(count<=0){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        count--;
        System.out.println(Thread.currentThread().getName()+"取走一盘菜，剩余："+count);
        notifyAll();
    }
}
