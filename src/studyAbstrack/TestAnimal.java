package studyAbstrack;

public class TestAnimal {
    public static void main(String[] args){
        Animal[] a=new Animal[3];
        a[0]=new Oviparity("鸟");
        a[1]=new Viviparity("狗");
        a[2]=new Oviparity("蛇");
        for(int i=0;i<a.length;i++){
            a[i].giveBirthTo();
        }
    }
}
