package JiCheng;

public class Computer {
    private double cpu;
    private double memory;
    private double disk;
//    public Computer(double cpu,double memory){
//        this.cpu=cpu;
//        this.memory=memory;
//    }
//
//    public Computer(double cpu,double memory,double disk){
//        this(cpu,memory);
//        this.disk=disk;
//    }

    public void setCpu(double cpu){
        this.cpu=cpu;
    }
    public void setMemory(double memory){
        this.memory=memory;
    }
    public void setDisk(double disk){
        this.disk=disk;
    }

    public double getCpu(){
        return this.cpu;
    }
    public double getMemory(){
        return this.memory;
    }
    public double getDisk(){
        return this.disk;
    }

    public String getDetail(){
        return "CPU："+this.cpu+"，内存："+this.memory+"，硬盘："+this.disk;
    }
}
