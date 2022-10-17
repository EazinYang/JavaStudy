package JiCheng;

public class PC extends Computer{
    private double cache;

//    public PC(double cpu,double memory,double disk,double cache){
//        super(cpu,memory,disk);
//        this.cache=cache;
//    }

    public void setCache(double cache){
        this.cache=cache;
    }

    public double getCache() {
        return this.cache;
    }

    public void output(){
        System.out.println("缓存："+this.cache);
    }

    public String getDetail(){
        return super.getDetail()+"缓存："+this.cache;
    }
}
