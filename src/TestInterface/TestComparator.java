package TestInterface;

import java.util.Arrays;

public class TestComparator {
    public static void main(String[] args){
        Student s1=new Student("小明",18,100);
        Student s2=new Student("小红",17,100);
        AgeComparator c=new AgeComparator();
        if(c.compare(s1,s2)>0){
            System.out.println("s1>s2的年龄");
        }else if(c.compare(s1,s2)<0){
            System.out.println("s1<s2的年龄");
        }else {
            System.out.println("s1=s2年龄");
        }
        Student[] all=new Student[3];
        all[0]=s1;
        all[1]=s2;
        all[2]=new Student("小军",20,99);
        //Array工具类
        //public static void sort(Object[] a,Comparator c)
        //第一个形参，需要排序的数组，Objcet[]说明可以是任意类型的对象数组
        //第二个形参，比较器对象，Comparator接口不能创建对象，只能传入实现类对象
        Arrays.sort(all,new AgeComparator());
        for(int i=0;i<all.length;i++){
            System.out.println(all[i].getAge());
        }

    }
}
