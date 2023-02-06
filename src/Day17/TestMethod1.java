package Day17;

import org.junit.Test;

public class TestMethod1 {
    public static void main(String[] args){
        Thread t=Thread.currentThread();
        System.out.println(t.getName());//main

        MyThread my1=new MyThread();
        System.out.println(my1.getName());//Thread-0

        System.out.println(t.getPriority());//5
        System.out.println(my1.getPriority());//5

        System.out.println("最低优先级"+Thread.MIN_PRIORITY);//最低优先级1
        System.out.println("最高优先级"+Thread.MAX_PRIORITY);//最高优先级10
        System.out.println("普通优先级"+Thread.NORM_PRIORITY);//普通优先级5
//        MyThread my1=new MyThread();
//        my1.start();
//        //主线程休眠3秒钟后，中断MyThread线程
//        try {
//            Thread.sleep(3000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        my1.interrupt();
//        MyRunnable my=new MyRunnable();
//        Thread t=new Thread(my);
//        t.start();
//        for(int i=1.txt;i<=10;i++){
//            System.out.println("main："+i);
//            if(i==3){
//                try {
//                    t.join();//当main线程打印到3后，被t线程加塞，main线程就不能继续
//                }catch (InterruptedException e){
//                    e.printStackTrace();
//                }
//            }
//        }
    }

    @Test
    public void testSleep(){
        for(int i=10;i>1;i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);//毫秒
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
