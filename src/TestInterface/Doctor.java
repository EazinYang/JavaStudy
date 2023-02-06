package TestInterface;

public class Doctor {
    void swapHeart(Body b1,Body b2){
        Body b3=new Body();
        b3.setHeart(b1.getHeart());
        b1.setHeart(b2.getHeart());
        b2.setHeart(b3.getHeart());

        boolean h=b1.getHealth();
        b1.setHealth(b2.getHealth());
        b2.setHealth(h);
    }
}
