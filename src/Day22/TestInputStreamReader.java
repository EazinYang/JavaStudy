package Day22;

import org.junit.Test;

import java.io.*;

public class TestInputStreamReader {
    //文件格式与平台的格式不一致时，会出现乱码
    @Test
    public void test1() throws IOException {
        //解码：字节-->字节
        FileInputStream fis=new FileInputStream("D:/JavaPri/JavaStudy/src/Day22/1.txt");
        InputStreamReader isr=new InputStreamReader(fis,"GBK");//将fis流中的字节流按照GBK进行解码为字符流
        //数据：1.txt(GBK)-->fis(纯字节)-->isr(GBK)解成字符流-->按字符读取
        char[]arr =new char[100];
        int len=isr.read(arr);
        System.out.println(new String(arr,0,len));
        isr.close();
        fis.close();
    }
}
