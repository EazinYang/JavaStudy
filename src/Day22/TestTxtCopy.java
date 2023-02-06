package Day22;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestTxtCopy {
    @Test
    public void test01() throws IOException {
        copy("D:/JavaPri/JavaStudy/src/Day22/1.txt","D:/JavaPri/JavaStudy/src/Day22/2.txt");
    }

    public void copy(String srcFileName,String destFileName) throws IOException {
        //1、选择IO流，并创建IO流
        FileReader fr=new FileReader(srcFileName);
        FileWriter fw=new FileWriter(destFileName);

        //2、一边读一边写
        char[] arr=new char[10];
        int len;
        while((len=fr.read(arr))!=-1){
            fw.write(arr,0,len);
        }

        //3、关闭
        fw.close();
        fr.close();
    }
}
