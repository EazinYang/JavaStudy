package TestInterface;

public class TestBody {
    public static void main(String[] args){
        Body b1=new Body("小明",45000,true);
        Body b2=new Body("小红",50000,false);
        System.out.println(b1);
        b1.getHeart().doWork();
        System.out.println(b2);
        b2.getHeart().doWork();
        Doctor d=new Doctor();
        d.swapHeart(b1,b2);
        System.out.println("-------------------------------------");
        System.out.println(b1);
        b1.getHeart().doWork();
        System.out.println(b2);
        b2.getHeart().doWork();
    }
}
