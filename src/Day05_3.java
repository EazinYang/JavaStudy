public class Day05_3 {
    public static void main(String[] args){
        System.out.println(max(1,4));
        System.out.println(max(1.0,4.0));
        System.out.println(max(1,4,8));
    }
    //写一个方法，找两个整数的最大值
    public static int max(int a,int b){
        return a>b ? a:b;
    }
    //写一个方法，找2个小数的最大值
    public static double max(double a,double b){
        return a>b ? a:b;
    }
    //写一个方法，可以找3个整数的最大值
    public static int max(int a,int b,int c){
        int max= a>b ? a:b;
        max = max>c ? max:c;
        return max;
    }
}
