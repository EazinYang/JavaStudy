package Day22;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
@SuppressWarnings("all")
public class Test03 {
    @Test
    public void test01(){
        //列出D:/JavaPri/JavaStudy/src的java文件
        File dir=new File("D:/JavaPri/JavaStudy/src");
        File[] listFile=dir.listFiles(new FileFilter() {
            //file表示dir这个目录的下一级的每一个文件或目录
            @Override
            public boolean accept(File file) {
                return file.getName().endsWith(".java");
            }
        });
        for(File file:listFile){
            System.out.println(file);
        }
    }

    @Test
    public void test02(){
        //列出D:/JavaPri/JavaStudy/src的java文件
        //并且源文件名包含Test这个单词
        File dir=new File("D:/JavaPri/JavaStudy/src");
        File[] listFile=dir.listFiles(new FileFilter() {
            //file表示dir这个目录的下一级的每一个文件或目录
            @Override
            public boolean accept(File file) {
                return file.getName().endsWith(".java")&& file.getName().contains("Test");
            }
        });
        for(File file:listFile){
            System.out.println(file);
        }
    }
}
