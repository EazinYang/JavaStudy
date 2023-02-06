package Day22;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopy {
    @Test
    public void test1() throws IOException {
        copy("D:/JavaPri/JavaStudy/src/Day22/3.png","D:/JavaPri/JavaStudy/src/Day22/4.png");
    }
    @Test
    public void test2() throws IOException {
        copy("D:/JavaPri/JavaStudy/src/Day22/1.txt","D:/JavaPri/JavaStudy/src/Day22/2.txt");
        //这里没有乱码，因为把1.txt的所有字节复制到2.txt中，然后一起显示，没有缺字节
    }

    //复制任意类型文件的功能
    //任意类型的文件，只能选择字节流
    public void copy(String srcFileName,String desFileName) throws IOException {
        FileInputStream fis=new FileInputStream(srcFileName);
        FileOutputStream fos=new FileOutputStream(desFileName);

        byte[] arr=new byte[10];
        int len;
        //数据：srcFileName-->fix-->arr-->fos-->destFileName
        while ((len=fis.read(arr))!=-1){
            fos.write(arr,0,len);
        }

        fis.close();
        fos.close();
    }

}
