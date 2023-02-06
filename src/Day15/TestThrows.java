package Day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestThrows {
    public static void main(String[] args){
        try{
            divide(1,1);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        try{
            copy("1.txt.txt","2.txt");
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }

    public static void divide(int a,int b)throws ArithmeticException,RuntimeException{
        System.out.println(a/b);
    }

    public static void copy(String srcFile,String destFile)throws FileNotFoundException {
        FileInputStream fis=new FileInputStream(srcFile);//读取文件内容
    }
}
