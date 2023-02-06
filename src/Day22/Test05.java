package Day22;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test05 {
    //IOException是FileNotFoundException的父类，都是编译时异常
    @Test
    public void test01() throws IOException {
        //1.txt、选择IO流
        //因为是操作纯文本文件，所以选择字符流
        //因为是读取操作，所以选择字符输入流FileReader
        FileReader fr=new FileReader("D:/JavaPri/JavaStudy/src/Day22/1.txt");
        //2、读取文件内容
        //数据流向：1.txt.txt-->fr流中-->从流中开始读取
        int data=fr.read();
        System.out.println(data);//49

        char[] arr=new char[10];
        int len=fr.read(arr);
        System.out.println(len);//10
        //3、关闭
        fr.close();
    }
    @Test
    public void test02() throws IOException {
        FileReader fr = new FileReader("D:/JavaPri/JavaStudy/src/Day22/1.txt");
        char[] arr=new char[10];
        while(true){
            int len=fr.read(arr);
            if(len==-1){
                break;
            }
            System.out.print(new String(arr,0,len));
        }
        fr.close();
    }
}
