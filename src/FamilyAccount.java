public class FamilyAccount {
    public static void main(String[] args){
        boolean loopFlag=true;
        int balance=10000;
        int income=0;
        int spending=0;
        String detail="收支\t\t收支金额\t\t账户金额\t\t说明\t\t\n";
        String description="";
        while (loopFlag){
            System.out.println("-----------------家庭收支记账软件-----------------");
            System.out.println("\t\t\t\t\t1收支明细");
            System.out.println("\t\t\t\t\t2登记收入");
            System.out.println("\t\t\t\t\t3登记支出");
            System.out.println("\t\t\t\t\t4退出");
            System.out.println();
            System.out.print("\t\t\t\t\t请选择(1.txt-4)：");
            java.util.Scanner input=new java.util.Scanner(System.in);
            int options=input.nextInt();
            switch (options){
                case 1:
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println(detail);
                    break;
                case 2:
                    System.out.print("本次收入金额：");
                    income=input.nextInt();
                    System.out.print("本次收入说明：");
                    description=input.next();
                    balance+=income;
                    detail+="收入\t\t"+income+"\t\t"+balance+"\t\t\t"+description+"\n";
                    break;
                case 3:
                    System.out.print("本次支出金额：");
                    spending=input.nextInt();
                    System.out.print("本次支出说明：");
                    description=input.next();
                    balance-=spending;
                    detail+="支出\t\t"+spending+"\t\t\t"+balance+"\t\t\t"+description+"\n";
                    break;
                case 4:
                    System.out.print("确认是否退出(Y/N)：");
                    char confirm=input.next().charAt(0);
                    if(confirm=='Y' || confirm=='y'){
                        loopFlag=false;
                    }
            }
        }
    }
}
