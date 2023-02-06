package Day15;

public class TestFinallyReturn {
    public static void main(String[] args){
        String str=getNum(1);
        System.out.println(str);
    }

    public static String getNum(int a){
        try{
//            System.out.println(a/0);
            if(a>0){
                return "整数";
            }else if(a>0){
                return "负数";
            }else {
                return "零";
            }
        }catch (Exception e){
            System.out.println("异常");
        }finally {
            return "最终";
        }
    }
}
