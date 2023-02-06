package Day14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
*@author Eazin
 */
public class TestAnnotation2 {
    /**
    *这是Java的主方法，是Java程序的入口
    *@param args String[] 命令行参数，使用java命令时，在后面输入参数，例如
    *java类名 参数1 参数2 ...
     */
    public static void main(String[] args){
    }
    /**
     *这是一个求两个整数中最大值的方法
     * @param a int 其中一个整数
     * @param b int 另一个整数
     * @return int 返回值
     */
    public static int getMax(int a,int b){
        return a>b?a:b;
    }
    /**
     * 这是一个复制文件的方法
     * @param src String 源文件
     * @param dest String 目标文件
     * @throws FileNotFoundException 当源文件找不到时会抛出该异常
     */
    public static void copyFile(String src,String dest) throws FileNotFoundException{
        FileInputStream fis=new FileInputStream(src);
    }
}
