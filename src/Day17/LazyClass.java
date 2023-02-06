package Day17;

public class LazyClass {
    private static LazyClass instance;

    private LazyClass(){}

    public static LazyClass getInstance(){
        if(instance==null){//提高效率
            synchronized (LazyClass.class){//当前类的class对象
                if(instance==null){//安全判断
                    instance=new LazyClass();
                }
            }
        }
        return instance;
    }
//
//    public static LazyClass getInstance(){//有线程安全问题，多个线程都进入到instance==null中，导致创建多个对象
//        if(instance==null){//安全判断
//            instance=new LazyClass();
//        }
//        return instance;
//    }

//    public synchronized static LazyClass getInstance(){//存在性能问题，多个线程需要等待锁
//        if(instance==null){
//            instance=new LazyClass();
//        }
//        return instance;
//    }
}
