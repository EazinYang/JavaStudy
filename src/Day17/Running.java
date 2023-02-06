package Day17;

public class Running {
    public static void main(String[] args){
        Sportman t=new Sportman("兔子",30,100,10000);
        Sportman w=new Sportman("乌龟",30,1000,1000);
        t.start();
        w.start();
        //等t和w线程结束后，才能让main线程执行
        while (true){
            if(t.isFinish() || w.isFinish()){
                t.interrupt();
                w.interrupt();
                t.setStop(true);
                w.setStop(true);
                break;
            }
        }

        if(t.isFinish() && w.isFinish()){
            System.out.println(t.getName()+","+w.getName()+"平局");
        }else if(t.isFinish()){
            System.out.println(t.getName()+"赢了");
        }else {
            System.out.println(w.getName()+"赢了");
        }
    }
}
