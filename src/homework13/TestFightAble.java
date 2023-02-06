package homework13;

import java.util.Scanner;

public class TestFightAble {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("请选择：");
        String role=input.next();
        FightAble f=Player.select(role);
        f.commonFight();
        f.specialFight();
    }
}
