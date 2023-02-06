package Day22;

import org.junit.Test;

import java.io.*;

public class TestBuffered {
    @Test
    public  void test01() throws IOException {
        //用它来读取一个文件，因为控制台只能显示文本数据，所以我们这里用纯文本文件来演示。
        FileReader fr=new FileReader("D:/JavaPri/JavaStudy/src/Day22/1.txt");
        BufferedReader br=new BufferedReader(fr);

        //数据：1.txt-->fr-->br
        String str;
        while ((str=br.readLine())!=null){
            System.out.println(str);
        }
        br.close();
        fr.close();
    }

    @Test
    public  void test02() throws IOException {
        long start=System.currentTimeMillis();
        FileReader fr=new FileReader("D:/JavaPri/JavaStudy/src/Day22/1.txt");
        BufferedReader br=new BufferedReader(fr);
        FileWriter fw=new FileWriter("D:/JavaPri/JavaStudy/src/Day22/2.txt");
        BufferedWriter bw=new BufferedWriter(fw);

        //数据：1.txt-->fr-->br-->str-->bw-->fw-->2.txt
        String str;
        while ((str=br.readLine())!=null){
            bw.write(str);
        }
        bw.close();
        fw.close();
        br.close();
        fr.close();
        long end=System.currentTimeMillis();
        System.out.println("毫秒："+(end-start));
    }
}
