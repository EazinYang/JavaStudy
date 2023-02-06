package homework19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Homework8 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入一串字母：");
        String str = input.nextLine();
        System.out.println("str=" + str);

        LinkedHashSet set = new LinkedHashSet();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        System.out.print("去重后：");
        String result = "";
        for (Object object : set) {
            result += object;
        }
        System.out.println(result);
    }
}
