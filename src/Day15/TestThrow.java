package Day15;

public class TestThrow {
    public static void main(String[] args){
        int a=10;
        int b=0;
        if(b==0){
            throw new RuntimeException("除数不能为0");
        }else {
            System.out.println("商："+a/b);
        }
    }
}
