package DuoTai;

public class PC extends Computer{
    private double cache;

    public PC(double cpu,double memory,double disk,int price,double cache){
        super(cpu,memory,disk,price);
        this.cache=cache;
    }

    public String getDetail(){
        return super.getDetail()+"缓存："+this.cache;
    }
}
