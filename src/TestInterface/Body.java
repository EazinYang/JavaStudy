package TestInterface;

public class Body {
    private String owner;
    private int weight;
    private boolean health;
    private Organ heart;

    public Body(){}

    public Body(String owner,int weight,boolean health){
        this.owner=owner;
        this.weight=weight;
        this.health=health;
        this. heart=getHeartClass();
    }

    class Heart extends Organ{
        private int heartRate;
        private String collor;
        private double size=weight*0.005;

        public Heart(){
            if(health==true){
                this.collor="鲜红色";
                this.heartRate=100;

            }else{
                this.collor="暗红色";
                this.heartRate=110;
            }
        }

        @Override
        public void doWork() {
            System.out.println("心率："+this.heartRate+"次/分，大小："
                    +this.size+"克，颜色："+this.collor+"，为血液流动提" +
                    "供动力，把血液运行至"+owner+"身体各个部分");
        }
    }

    public Organ getHeartClass(){
        Organ o1=new Heart();
        return o1;
    }

    public Organ getHeart() {
        return heart;
    }

    public void setHeart(Organ heart) {
        this.heart = heart;
    }

    @Override
    public String toString() {
        return "Body{" +
                "owner='" + owner + '\'' +
                ", weight=" + weight +
                ", health=" + health +
                '}';
    }
}
