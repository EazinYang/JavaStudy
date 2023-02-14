package Day22;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TestOutputStreamWriter {
    @Test
    public void test01()throws IOException{
        //当前平台是UTF-8,文件是GBK
        //String：编码的方法：getBytes()
        //编码：字符->字节
        String str="今天真开心";
        FileOutputStream fos=new FileOutputStream("D:/JavaPri/JavaStudy/src/Day22/1.txt");
        OutputStreamWriter oss=new OutputStreamWriter(fos,"GBK");
        oss.write(str);//数据：str(字符)-->oss(字符)按照GBK编码为字节流-->fos-->1.txt
        oss.close();
        fos.close();
    }
}
