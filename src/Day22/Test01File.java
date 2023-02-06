package Day22;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
@SuppressWarnings("all")
public class Test01File {
    public void test01(){
        File ioBJ1=new File("D:/BaiduNetdiskDownload/JSE-11(集合与泛型).pptx");
        File ioBJ2=new File("D:\\BaiduNetdiskDownload\\JSE-11(集合与泛型).pptx");
        File ioBJ3=new File("D:"+File.separator+"BaiduNetdiskDownload+"+File.separator+"JSE-11(集合与泛型).pptx");
    }
    @Test
    public void test02(){
        File file=new File("D:/BaiduNetdiskDownload/JSE-11(集合与泛型).pptx");
        System.out.println("文件名："+file.getName());//返回文件名
        System.out.println("文件大小："+file.length()+"字节");//返回文件大小，字节
        System.out.println("文件是否是隐藏文件："+file.isHidden());
        System.out.println("文件是否存在："+file.exists());
        System.out.println("文件是否可读"+file.canRead());
        System.out.println("文件是否可写"+file.canWrite());

        String parent=file.getParent();//返回父目录的名称
        File dir=file.getParentFile();//返回父目录的file对象
        System.out.println("文件的父目录："+parent);

        System.out.println("文件最后修改时间"+file.lastModified());
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("文件最后修改时间"+sf.format(new Date(file.lastModified())));
    }

    @Test
    public void test03() throws IOException {
        File file1=new File("D:/BaiduNetdiskDownload/JSE-11(集合与泛型).pptx");
        System.out.println("文件的路径："+file1.getPath());
        System.out.println("文件的绝对路径："+file1.getAbsolutePath());
        System.out.println("文件的规范路径："+file1.getCanonicalPath());

        File file2=new File("BaiduNetdiskDownload/JSE-11(集合与泛型).pptx");
        System.out.println("文件的路径："+file2.getPath());//文件的路径：BaiduNetdiskDownload\JSE-11(集合与泛型).pptx
        System.out.println("文件的绝对路径："+file2.getAbsolutePath());//文件的绝对路径：D:\JavaPri\JavaStudy\BaiduNetdiskDownload\JSE-11(集合与泛型).pptx
        //非规范路径：带.../或./或/
        System.out.println("文件的规范路径："+file2.getCanonicalPath());//文件的规范路径：D:\JavaPri\JavaStudy\BaiduNetdiskDownload\JSE-11(集合与泛型).pptx
    }

    @Test
    public void test04() throws IOException {
        File file1=new File("D:/BaiduNetdiskDownload/不存在的文件.txt");
        if(!file1.exists()){
            System.out.println("文件不存在，创建这个文件");
            file1.createNewFile();
        }

        File file2=new File("D:/BaiduNetdiskDownload/不存在的一级目录");
        if(!file2.exists()){
            System.out.println("文件不存在，创建这个文件");
            file2.mkdir();
        }

        File file3=new File("D:/BaiduNetdiskDownload/不存在的一级目录/不存在的二级目录");
        if(!file3.exists()){
            System.out.println("文件不存在，创建这个文件");
            file3.mkdirs();
        }
    }
    @Test
    public void test05() throws IOException {
        File file1=new File("D:/BaiduNetdiskDownload/JSE-11(集合与泛型).pptx");
        file1.delete();

        File file2=new File("D:/BaiduNetdiskDownload/JSE");
        file2.delete();
    }

    @Test
    public void test06() throws IOException {
        File file=new File("D:/BaiduNetdiskDownload/JSE");
        File dest=new File("D:/BaiduNetdiskDownload/重命名");
        file.renameTo(dest);
    }

    @Test
    public void test07() throws IOException {
        File file=new File("D:/BaiduNetdiskDownload/JSE-11(集合与泛型).pptx");
        if(file.isFile()){
            System.out.println("是一个文件");
        }else if(file.isDirectory()){
            System.out.println("是一个文件夹");
        }else if(file.exists()){
            System.out.println("file对象对应的文件或目录存在");
        }else {
            System.out.println("不存在");
        }

    }
}
