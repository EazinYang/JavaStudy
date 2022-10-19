package TestComparable;

import java.util.Arrays;

public class TestComparable {
    public static void main(String[] args){
        Student s1=new Student("小明",19,69);
        Student s2=new Student("小花",18,59);
        if(s1.compareTo(s2)>0){
            System.out.println("s1>s2的成绩");
        }else if(s1.compareTo(s2)<0){
            System.out.println("s1<s2的成绩");
        }else {
            System.out.println("s1=s2的成绩");
        }

        Student[] all=new Student[3];
        all[0]=s1;
        all[1]=s2;
        all[2]=new Student("小花",18,94);
        Arrays.sort(all);//这里排序过程中，调用了元素本身的comparaTo()方法
        //因为元素本身是Student类型，它实现了java.lang.Comparable接口
        //本身具备比较大小的能力，即拥有comparaTo方法
        for(int i=0;i<all.length;i++){
            System.out.println(all[i].toString());
        }
    }
}
