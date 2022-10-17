package DuoTai;

public class NotePad extends Computer{
    private double verson;

    public NotePad(double cpu,double memory,double disk,int price,double verson){
        super(cpu,memory,disk,price);
        this.verson=verson;
    }

    public void pri(){
        System.out.println("版本号："+this.verson);
    }
}
