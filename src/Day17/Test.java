package Day17;

public class Test {
    public static void main(String[] args){
        Workbench tai=new Workbench();
        Cook c1=new Cook("厨师一",tai);
        Cook c2=new Cook("厨师二",tai);
        Waiter w1=new Waiter("服务员1",tai);
        Waiter w2=new Waiter("服务员2",tai);
        Waiter w3=new Waiter("服务员3",tai);
        c1.start();
        c2.start();
        w1.start();
        w2.start();
        w3.start();
    }
}
