package TestInterface;

import java.util.Arrays;

public class TestEmployee {
    public static void main(String[] args){
        Employee[] e=new Employee[5];
        e[0]=new Employee(3,"小明",18,3000);
        e[1]=new Employee(5,"小花",28,2900);
        e[2]=new Employee(2,"小军",19,2800);
        e[3]=new Employee(1,"小红",17,3100);
        e[4]=new Employee(4,"小云",21,3500);
        Arrays.sort(e);
        for(int i=0;i<e.length;i++){
            System.out.println(e[i].toString());
        }
        Arrays.sort(e,new SalartComparator());
        System.out.println("--------------------");
        for(int i=0;i<e.length;i++){
            System.out.println(e[i].toString());
        }
    }
}
