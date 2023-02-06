package Day17;

public class Ticket extends Thread {
    private static int total=100;
    private static Object lock=new Object();//锁的选择一，单独造一个锁

    public Ticket(String name){
        super(name);
    }

    public void run(){
//        //synchronized(this)//这里使用this不行，因为这个this，对于三个线程来说不是同一个
//        while (true){
//            synchronized (lock){
//                if(total>0) {
//                    System.out.println(getName() + "卖出一张票");
//                    total--;
//                    System.out.println("剩余" + total);
//                }else {
//                    break;
//                }
//            }
//        }
        while (total>0){//线程停止的条件
            saleOneTicket();
        }
    }

    public synchronized static void saleOneTicket(){
        if(total>0) {//线程安全问题的条件
            System.out.println(Thread.currentThread().getName() + "卖出一张票");
            total--;
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("剩余" + total);
        }
    }

//    //同步方法，锁的是方法的一次调用过程
//    //非静态方法的锁对象是this，这里使用this，不是合格的锁对象
//    public synchronized void saleOneTicket(){
//        if(total>0) {//线程安全问题的条件
//            System.out.println(getName() + "卖出一张票");
//            total--;
//            try{
//                Thread.sleep(10);
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//            System.out.println("剩余" + total);
//        }
//    }
}
