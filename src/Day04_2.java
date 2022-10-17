public class Day04_2 {
    public static void main(String args[]) {
        //创建Day04_01对象
        Day04_1 tools=new Day04_1();

        //调用max()
        int m=tools.max(4,6);
        System.out.println("4,6最大值是："+m);
        System.out.println("5,2最大值是"+tools.max(5,2));
        System.out.println("3,2,7的最大值是："+tools.threeNumberMax(3,2,7));
    }
}
