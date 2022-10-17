public class Day05_4 {
    public static void main(String[] args){
        System.out.println(sum(1,2));

        int[] arr1=new int[0];
        System.out.println("0个元素的累加和："+sum(arr1));

        int [] arr2={1,2,3,4,5};
        System.out.println("5个元素的累加和："+sum(arr2));

        System.out.println("0个元素的累加和："+sum());
        System.out.println("5个元素的累加和："+sum(1,2,3,4,5));
        System.out.println("3个元素的累加和："+sum(1,2,3));

//        System.out.println("0个元素的累加和："+max());//错误，因为max有一个非可变参数，必须传值
        System.out.println("0个元素的累加和："+max(5));//5赋值给了给非可变参数
        System.out.println("0个元素的累加和："+max(5,1,5,6,8));//第一个5赋值给了非可变参数，剩下的给了可变参数
    }
    //声明一个方法，功能：可以求2个整数的和
    public static int sum(int a,int b){
        return a+b;
    }
    //声明一个方法，功能：可以求0-n个整数的累加和
//    public static int sum(int[] nums){
//        int sum=0;
//        for(int i=0;i<nums.length;i++){
//            sum+=nums[i];
//        }
//        return sum;
//    }
    public static int sum(int... nums){//可变参数
        //nums当成数组用
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }

    //声明一个方法，功能：可以求1-n个整数的最大值
    //int num1就是非可变参数部分
    //int... nums是可变参数
    public static int max(int num1,int... nums){
        int max=num1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
}
