public class Day05_12_1 {
    private String name;
    private int age;
    private int score;

    public void setVari(String n,int a,int s){
        name=n;
        age=a;
        score=s;
    }

    public String getInfo(){
        String info="姓名："+name+"，年龄："+age+"，成绩："+score;
        return info;
    }
}
