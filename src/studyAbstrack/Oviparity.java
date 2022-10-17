package studyAbstrack;

public class Oviparity extends Animal{

    public Oviparity(String name){
        super(name);
    }

    @Override
    public void giveBirthTo() {
        System.out.println(getName()+"是卵生动物");
    }
}
