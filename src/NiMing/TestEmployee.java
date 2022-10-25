package NiMing;

import TestInterface.A;

import java.util.Arrays;
import java.util.Comparator;

public class TestEmployee {
    public static void main(String[] args){
        Employee[] e=new Employee[3];
        e[0]=new Employee(3,"小明",3000);
        e[1]=new Employee(2,"小红",2000);
        e[2]=new Employee(1,"小军",2500);
        Arrays.sort(e,new Comparator(){

            @Override
            public int compare(Object o, Object t1) {
                Employee e1=(Employee)o;
                Employee e2=(Employee)t1;
                if(e1.getId()>e2.getId()){
                    return 1;
                }else if(e1.getId()<e2.getId()){
                    return -1;
                }
                return 0;
            }
        });
        for(int i=0;i<e.length;i++){
            System.out.println(e[i].toString());
        }
        Arrays.sort(e,new Comparator(){

            @Override
            public int compare(Object o, Object t1) {
                Employee e1=(Employee)o;
                Employee e2=(Employee)t1;
                if(e1.getSalary()>e2.getSalary()){
                    return -1;
                }else if(e1.getSalary()<e2.getSalary()){
                    return 1;
                }
                return 0;
            }
        });
        for(int i=0;i<e.length;i++){
            System.out.println(e[i].toString());
        }
    }
}
