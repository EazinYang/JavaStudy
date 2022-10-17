public class Day04_1 {
    //求任意两个整数的最大值
    int max(int a,int b){
        return a>b ? a:b;
    }

    //求任意三个整数的最大值
    int threeNumberMax(int x,int y,int z){
        //本类同级别调用
        return max(max(x,y),z);
    }
}
