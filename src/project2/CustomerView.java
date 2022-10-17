package project2;

import java.util.Scanner;
import java.util.SplittableRandom;

public class CustomerView {
    private CustomerList customers=new CustomerList(10);

    public static void main(String[] args){
        CustomerView start=new CustomerView();
        start.enterMainMenu();
    }

    public void enterMainMenu(){//显示主菜单
        System.out.println("----------------------------------添加客户----------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t 1添加客户");
        System.out.println("\t\t\t\t\t\t\t\t 2修改客户");
        System.out.println("\t\t\t\t\t\t\t\t 3删除客户");
        System.out.println("\t\t\t\t\t\t\t\t 4客户列表");
        System.out.println("\t\t\t\t\t\t\t\t 5退\t出");
        System.out.print("请选择(1-5)：");
        java.util.Scanner input=new java.util.Scanner(System.in);
        int number=input.nextInt();
        switch (number){
            case 1:
                addNewCustomer();
                break;
            case 2:
                modifyCustoemer();
                break;
            case 3:
                deleteCustomer();
                break;
            case 4:
                listAllCustomers();
        }
    }

    private void addNewCustomer(){//添加客户页面
        System.out.println("\n----------------------------------添加客户----------------------------------");
        java.util.Scanner input=new java.util.Scanner(System.in);
        System.out.print("姓名：");
        String name=CMUtility.readString(255);
        System.out.print("性别：");
        char gender=CMUtility.readChar();
        System.out.print("年龄：");
        int age=CMUtility.readInt();
        System.out.print("电话：");
        String phone=CMUtility.readString(255);
        System.out.print("邮箱：");
        String email=CMUtility.readString(255);
        Customer add=new Customer();
        add.setName(name);
        add.setGender(gender);
        add.setAge(age);
        add.setPhone(phone);
        add.setEmail(email);
        boolean succesee=customers.addCustomer(add);
        if(succesee){
            System.out.println("---------------------------------添加完成----------------------------------");
            System.out.println();
            enterMainMenu();
        }else {
            System.out.println("客户数量已满，无法添加！");
            System.out.println();
            enterMainMenu();
        }
    }

    public void modifyCustoemer(){
        System.out.println("\n----------------------------------修改客户----------------------------------");
        System.out.print("请选择修改客户编号(-1退出)：");
        java.util.Scanner input=new java.util.Scanner(System.in);
        int number=input.nextInt();
        if(number==-1){
            System.out.println();
            enterMainMenu();
        }
        else if(number>customers.getTotal()){
            System.out.println("不存在该用户！");
            modifyCustoemer();
        }else {
            Customer alterCustomer=new Customer();
            alterCustomer=customers.getCustomer(number-1);
            System.out.print("姓名"+"("+alterCustomer.getName()+")：");
            String name=CMUtility.readString(255,alterCustomer.getName());
            System.out.print("性别"+"("+alterCustomer.getGender()+")：");
            char gender=CMUtility.readChar(alterCustomer.getGender());
            System.out.print("年龄"+"("+alterCustomer.getAge()+")：");
            int age=CMUtility.readInt(alterCustomer.getAge());
            System.out.print("电话"+"("+alterCustomer.getPhone()+")：");
            String phone=CMUtility.readString(11,alterCustomer.getPhone());
            System.out.print("邮箱"+"("+alterCustomer.getEmail()+")：");
            String email=CMUtility.readString(255,alterCustomer.getEmail());
            Customer cust=new Customer();
            cust.setGender(gender);
            cust.setAge(age);
            cust.setEmail(email);
            cust.setPhone(phone);
            cust.setName(name);
            boolean succesee=customers.replaceCustomer(number-1,cust);
            if(succesee){
                System.out.println("----------------------------------修改完成----------------------------------");
                System.out.println();
                enterMainMenu();
            }else {
                System.out.println("客户不存在，修改失败！");
                System.out.println();
                enterMainMenu();
            }
        }
    }

    public void deleteCustomer(){
        System.out.println("\n----------------------------------删除客户----------------------------------");
        System.out.print("请选择待删除客户编号(-1退出)：");
        int number=CMUtility.readInt();
        if(number==-1){
            System.out.println();
            enterMainMenu();
        }else {
            System.out.print("确认删除(Y/N)：");
            char confirm=CMUtility.readChar();
            boolean success=false;
            if(confirm=='Y'||confirm=='y'){
                success=customers.deleteCustomer(number-1);
            }else {
                System.out.println();
                enterMainMenu();
            }
            if(success){
                System.out.println("----------------------------------删除完成----------------------------------");
                System.out.println();
                enterMainMenu();
            }
        }
    }

    public void listAllCustomers() {
        System.out.println("\n-------------------------------客户列表----------------------------------");
        String col="编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t邮箱\n";
        Customer[] cus=customers.getCustomers();
        for(int i=0;i<cus.length;i++){
            int b=i+1;
            col+=b+"\t\t\t"+cus[i].getName()+"\t\t"+cus[i].getGender()+"\t\t\t"+cus[i].getAge()+"\t\t\t"+cus[i].getPhone()+"\t"+cus[i].getEmail()+"\n";
        }
        System.out.println(col);
        System.out.println("-------------------------------客户列表完成-------------------------------");
        System.out.println();
        enterMainMenu();
    }
}
