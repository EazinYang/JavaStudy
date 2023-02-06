package Day22;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFileWriter {
    public static void main(String[] args) throws IOException {
        TestFileWriter t=new TestFileWriter();
        t.test01();
    }

    public void test01() throws IOException {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入一句话：");
        String str=input.nextLine();

        //1、选择IO流并创建对象
//        FileWriter fw=new FileWriter("D:/JavaPri/JavaStudy/src/Day22/2.txt");//覆盖文本
        FileWriter fw=new FileWriter("D:/JavaPri/JavaStudy/src/Day22/2.txt",true);//追加写入到文件末尾

        //2、写数据
        fw.write(str);

        //3、关闭
        fw.close();
        input.close();
    }

    public void test02() throws IOException {

    }
}
