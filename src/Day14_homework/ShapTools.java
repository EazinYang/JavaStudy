package Day14_homework;
/**
 * @author Eazin;
 */

public class ShapTools {
    /**
     * 这个方法打印一个5行5列的*组成的矩形
     */
    @Deprecated
    public static void printRectangle(){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==0||i==4){
                    System.out.print("*");
                }else {
                    if(j==0||j==4){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    /**
     * 这个方法打印一个line行column列由sign组成的矩形
     * @param line int 整数代表行
     * @param column int 整数代表列
     * @param sign  String 显示的图形
     */
    public static void printRectangle(int line,int column,String sign){
        for(int i=0;i<line;i++){
            for(int j=0;j<column;j++){
                if(i==0||i==line-1){
                    System.out.print(sign);
                }else {
                    if(j==0||j==column-1){
                        System.out.print(sign);
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
