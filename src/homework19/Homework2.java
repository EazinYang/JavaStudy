package homework19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Homework2 {
    @SuppressWarnings("all")
    public static void main(String[] args){
        ArrayList list = new ArrayList();

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

            list.add(new Student(name,age));
        }

        for (Object object : list) {
            System.out.println(object);
        }
    }
}
