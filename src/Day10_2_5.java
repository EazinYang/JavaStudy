public class Day10_2_5 {
    public static void main(String[] args){
        /*
        创建一个数组，可以存储各种图形的对象，包括圆对象，矩形对象，三角形对象...
         */
        //本态数组
//        Day10_2_7[] yuans=new Day10_2_7[3];//这个数组存圆
//        Day10_2_8[] jus=new Day10_2_8[3];//这个数组存矩形
        Day10_2_6[] all=new Day10_2_6[3];//这个数组就可以存储各种图形的对象
        //左边的元素all[0]是Day10_2_6类型，右边是子类Day10_2_7类型
        all[0]=new Day10_2_7(1.2);
        //左边的g2是Day10_2_6类型，右边
        Day10_2_6 g2=new Day10_2_8(2,4);
        //左边的元素all[0]是Day10_2_6类型，右边是子类Day10_2_8类型
        all[1]=g2;

        all[2]=new Day10_2_7(4.2);

        //遍历所有图形的面积
        for(int i=0;i<all.length;i++){
            //执行哪个getArea()方法，要看all[i]存储的是哪个子类的对象
            System.out.println("面积："+all[i].getArea());
        }
    }
}
