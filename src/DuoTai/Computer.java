package DuoTai;

public class Computer {
    private double cpu;
    private double memory;
    private double disk;
    public int price;

    public Computer(double cpu,double memory,double disk,int price){
        this.cpu=cpu;
        this.memory=memory;
        this.disk=disk;
        this.price=price;
    }

    public String getDetail(){
        return "CPU："+this.cpu+"，内存："+this.memory+"，硬盘："+this.disk;
    }
}
