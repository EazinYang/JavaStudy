package Day22;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test06 {
    public static void main(String[] args) throws IOException {
        //(1)选择IO流
        //这里选择字节流，因为字节流可以处理所有类型文件
        FileInputStream fis=new FileInputStream("D:/JavaPri/JavaStudy/src/Day22/1.txt");

        //(2)读
        byte[] arr=new byte[10];
        int len;
        while ((len=fis.read(arr))!=-1){
            System.out.println(Arrays.toString(arr));

            //字节数组-->字符串 new String(byte[] ,off,len)
            //可能乱码,因为utf-8的中文是3个字节，每次读取10个字节组成字符串打印，读取到第四个中文时，
            // 这个中文被拆解字节了,然后打印出来了
            System.out.println(new String(arr,0,len));
        }

        fis.close();
    }
}
