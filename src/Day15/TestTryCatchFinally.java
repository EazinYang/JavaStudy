package Day15;

public class TestTryCatchFinally {
    public static void main(String[] args){
        try{
            int a=1;
            int b=0;
            System.out.println(a/b);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("最终块");
        }
    }
}
