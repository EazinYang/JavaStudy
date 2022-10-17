package studyAbstrack;

public class TestTemplate {
    public static void main(String[] args){
        MyCalTime my=new MyCalTime();
        long time=my.getTime();
        System.out.println("耗时："+time+"毫秒");
    }

}
