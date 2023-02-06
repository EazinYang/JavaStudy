package Day17;

import java.util.Arrays;
import java.util.Random;

public class Number extends Thread {
    volatile boolean type=false;
    int[] all=new int[100];
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            try{
                Thread.sleep(100);
                java.util.Random tools=new java.util.Random();
                all[i]=tools.nextInt(101);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        type=true;
        try {
            Thread.sleep(30000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(all));
    }
}
