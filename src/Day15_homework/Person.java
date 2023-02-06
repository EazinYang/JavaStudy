package Day15_homework;


public class Person {
    private String name;
    private int lifeValue;

    public Person(){}

    public Person(String name,int lifeValue){
        setName(name);
        setLifeValue(lifeValue);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLifeValue(int lifeValue) {
        if(lifeValue<0){
            throw new NoLifeValueException("生命值不能为负数："+lifeValue);
        }else {
            this.lifeValue = lifeValue;
        }
    }

    public String getName() {
        return name;
    }

    public int getLifeValue() {
        return lifeValue;
    }
}
