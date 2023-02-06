package homework18;

public class Homework13 {
    public static void main(String[] args){
        String str = "1.txt.hello2.world3.java4.string";
        //把第一个1.去掉
        str = str.replaceFirst("\\d\\.", "");
        //按照数字.的格式进行拆分
        String[] split = str.split("\\d\\.");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }


}
