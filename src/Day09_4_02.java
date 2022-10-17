public class Day09_4_02 extends Day09_4_01{
    int num;
    public void printNum(int num){
        System.out.println(num);//局部变量
        System.out.println(this.num);//成员变量,子类自己的int num
        System.out.println(super.num);//父类的变量
    }
}
