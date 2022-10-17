package studyAbstrack;

public class TestShirt {
    public static void main(String[] args){
//        Frock f=new Frock();报错
        Shirt s1=new Shirt(3);
        System.out.println("布料面积："+s1.calsArea());

        Frock s2=new Shirt(5);
        System.out.println("布料面积："+s2.calsArea());
    }
}
