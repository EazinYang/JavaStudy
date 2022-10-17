public class Person {
    private  int age;
    private String name;

    public void setAge(int a){
        if(a>=0 && a<=130){
            age=a;
        }
    }

    public void setName(String i){
        name=i;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public Person(String i,int a){
        age=a;
        name=i;
    }
}
