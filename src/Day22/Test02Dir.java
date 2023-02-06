package Day22;

import org.junit.Test;

import java.io.File;
@SuppressWarnings("all")
public class Test02Dir {
    @Test
    public void test1(){
        File dir=new File("D:/360安全浏览器下载/pyOpenSSL-20.0.1.txt/pyOpenSSL-20.0.1.txt");
        String[] list=dir.list();
        for(String sub:list){
            System.out.println(sub);
        }
    }

    @Test
    public void test2(){
        File dir=new File("D:/360安全浏览器下载/pyOpenSSL-20.0.1.txt/pyOpenSSL-20.0.1.txt");
        listAllSub(dir);
    }
    public void listAllSub(File dir){
        if(dir.isDirectory()){
            File[] listFiles=dir.listFiles();
            for(File sub:listFiles){
                listAllSub(sub);//递归：自己调用自己
            }
        }else {
            System.out.println(dir);
        }
    }


    @Test
    public void test3(){
        File dir=new File("D:/360安全浏览器下载/pyOpenSSL-20.0.1.txt/pyOpenSSL-20.0.1.txt");
        long size=getSize(dir);
        System.out.println(size);
    }
    public long getSize(File file){
        if(file.isFile()){
            return file.length();
        }else if(file.isDirectory()){
            long sum=0;
            File[] listFiles=file.listFiles();
            for(File sub:listFiles){
                sum+=getSize(sub);//累加每一个下一级的大小
            }
            return sum;
        }
        return 0;
    }

    @Test
    public void test4(){
        //(1.txt)如果时文件夹，先把它的下一级删除
        File dir=new File("DS:/S360安全浏览器下载/SpyOpenSSL-20.0.1.txt/SpyOpenSSL-20.0.1.txt");
        deleteDir(dir);
    }
    public void deleteDir(File file){
        //(1.txt)如果时文件夹，先把它的下一级删除
        if(file.isDirectory()){
            File[] listFiles=file.listFiles();
            //经过这个foreach，可以把file的所有下一级删除
            for(File sub:listFiles){
                deleteDir(sub);
            }
        }
        //文件就成了空文件夹，就可以直接删除
        //如果是文件也可以直接删除
        file.delete();
    }
}
