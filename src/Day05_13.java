public class Day05_13 {
    private String name;
    private int age;
    private String school;
    private String major;

    public static void main(String[] args){
        Day05_13 one=new Day05_13("小明",18);
        System.out.println(one.name+" "+one.age);
        Day05_13 two=new Day05_13("小红",19,"清华大学");
        System.out.println(two.name+" "+two.age+" "+two.school);
        Day05_13 three=new Day05_13("小花",20,"北京大学","女");
        System.out.println(three.name+" "+three.age+" "+three.school+" "+three.major);
    }

    public Day05_13(String n,int a){
        name=n;
        age=a;
    }

    public Day05_13(String n,int a,String s){
        name=n;
        age=a;
        school=s;
    }

    public Day05_13(String n,int a,String s,String m){
        name=n;
        age=a;
        school=s;
        major=m;
    }
}
