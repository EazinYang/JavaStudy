package JiCheng;

public class NotePad extends Computer{
    private double verson;

    public void setVerson(double verson) {
        this.verson = verson;
    }

    public double getVerson(){
        return this.verson;
    }
    public void pri(){
        System.out.println("版本号："+this.verson);
    }
}
