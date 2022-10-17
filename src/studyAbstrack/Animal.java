package studyAbstrack;

abstract class Animal {
    String name;

    public Animal(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public abstract void giveBirthTo();
}
