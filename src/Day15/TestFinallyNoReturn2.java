package Day15;

public class TestFinallyNoReturn2 {
    public static void main(String[] args){
        int num=getNum(4);
        System.out.println(num);
    }

    public static int getNum(int a){
        int result=0;
        try{
            System.out.println(a/0);
            if(a>0){
                result=20;
                return result;
            }else if(a<0){
                result =-20;
                return result;
            }else {
                return result;
            }
        }catch (Exception e){
            System.out.println("exception");
            result=0;
            return result;
        }finally {
            result=30;
            System.out.println("finally");
//            return result;
        }
    }
}
