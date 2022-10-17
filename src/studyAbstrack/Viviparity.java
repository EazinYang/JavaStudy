package studyAbstrack;

public class Viviparity extends Animal{

    public Viviparity(String name){
        super(name);
    }

    @Override
    public void giveBirthTo() {
        System.out.println(getName()+"是胎生动物");
    }
}
