package homework18;

import java.util.Scanner;

public class Homework9 {
    @SuppressWarnings("all")
    public static void main(String[] args){
        User[] user=new User[3];
        user[0]=new User("LiuDeHua","ldh123456");
        user[1]=new User("LiMing","lm123456");
        user[2]=new User("ZhouXingChi","zxc123456");
        for(int i=0;i<user.length;i++){
            System.out.println(user[i]);
        }
        Scanner input=new Scanner(System.in);
        System.out.print("请输入用户名：");
        String accout=input.next();
        System.out.print("请输入密码：");
        String password=input.next();
        boolean flag= false;
        for(int i=0;i<user.length;i++){
            if(accout.equals(user[i].getAccount())&&password.equals(user[i].getPassword())){
                System.out.println("登录成功!");
                flag=true;
                break;
            }else if(accout.equals(user[i].getAccount())&&password.equals(user[i].getPassword())==false){
                System.out.println("登录失败！");
                System.out.println("密码有误！");
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("登录失败！");
            System.out.println("没有该用户！");
        }
    }
}
