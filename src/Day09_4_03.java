public class Day09_4_03 {
    private String name;
    private int age;

    public Day09_4_03(){
    }

    public Day09_4_03(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public double getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getInfo(){
        return "姓名："+name+"，年龄："+age;
    }
}

