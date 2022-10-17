public class Day05_7 {
    public static void main(String[] args){
        /*
        要用一个数组，存储5个元对象
        声明一个数组
        数组的元素的类型时Circle
         */
        Day05_8[] arr=new Day05_8[5];//不是创建Day05_8的对象，而是创建数组对象
        //为数组的元素赋值
        for(int i=0;i<arr.length;i++){
            arr[i]=new Day05_8();
            arr[i].radius=i+1;
        }
        //遍历数组，打印每一个圆的信息
        for(int i=0;i<arr.length;i++){
            arr[i].printInfo();
        }
    }
}
