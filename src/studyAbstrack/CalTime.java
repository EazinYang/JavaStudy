package studyAbstrack;

//模板类
abstract class CalTime {
    //可以计算任意一段代码的运行时间
    public long getTime(){
        //获取系统开始时间
        long start=System.currentTimeMillis();

        //执行代码
        doWork();

        //获取结束时间
        long end=System.currentTimeMillis();

        //计算时间差
        return end-start;
    }

    public abstract void doWork();
}
