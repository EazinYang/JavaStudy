package homework18;

public class Homework5 {
    public static void main(String[] args){
        double num = Math.random() * 100;
        System.out.println("随机数为：" +num);
        String str = num + "";
        str = str.substring(0,str.indexOf(".") + 3);
        System.out.println("截取小数点后两位后为：" + str);
    }
}
