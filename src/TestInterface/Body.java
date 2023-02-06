package TestInterface;

import java.util.Random;

public class Body {
    private String owner;
    private double weight;
    private boolean health;
    private Organ heart;

    public Body(){}

    public Body(String owner,double weight,boolean health){
        this.owner=owner;
        this.weight=weight;
        this.health=health;
        Heart heart=new Heart();
        heart.size=weight*0.005;
        Random rand=new Random();
        if(health){
            heart.collor="鲜红色";
            heart.heartRate=rand.nextInt(41)+60;
        }else {
            heart.collor="暗红色";
            do{
                heart.heartRate=rand.nextInt();
            }while (heart.heartRate<=40||heart.heartRate>=101);
        }
        this.heart=heart;
    }

    class Heart extends Organ{
        private int heartRate;
        private String collor;
        private double size;

        @Override
        public void doWork() {
            //owner属性是创建Heart对象的哪个Body对象
            //即非静态内部类的对象，一直记录着是哪个外部类的对象创建的它 Body.this
            System.out.println("心率："+this.heartRate+"次/分，大小："
                    +this.size+"克，颜色："+this.collor+"，为血液流动提" +
                    "供动力，把血液运行至"+owner+"身体各个部分");
        }
    }

    public Organ getHeart() {
        return heart;
    }

    public boolean getHealth(){
        return this.health;
    }

    public void setHealth(boolean health) {
        this.health = health;
    }

    public void setHeart(Organ heart) {
        this.heart = heart;
    }

    @Override
    public String toString() {
        return "姓名："+owner+"，体重："+weight+"健康与否："+health;
    }
}
