package studyAbstrack;

public class TestAnimal {
    public static void main(String[] args){
        Animal[] a=new Animal[3];
        a[0]=new Oviparity("ιΈ");
        a[1]=new Viviparity("η");
        a[2]=new Oviparity("θ");
        for(int i=0;i<a.length;i++){
            a[i].giveBirthTo();
        }
    }
}
