package homework21;

import java.util.ArrayList;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args){
        ArrayList<Student> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("选择（1.txt、录入；0、退出）：");
            int select = input.nextInt();
            if(select == 0){
                break;
            }
            System.out.print("姓名：");
            String name = input.next();
            System.out.print("年龄：");
            int age = input.nextInt();

            Student stu = new Student(name,age);
            list.add(stu);
        }

        for (Student student : list) {
            System.out.println(student);
        }
        input.close();
    }
}
