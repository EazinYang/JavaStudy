package studyAbstrack;

public class PayrollSystem {
    public static void main(String[] args){
        Employee[] employees=new Employee[2];
        employees[0]=new SalariedEmployee("张军",new Mydate(1997,1,1),3000,24,24);
        employees[1]=new HourlyEmployee("李红",new Mydate(1999,10,1),10,240);

        java.util.Scanner input=new java.util.Scanner(System.in);
        System.out.print("请输入本月月份：");
        int month=input.nextInt();
        for(int i=0;i<employees.length;i++){
            if(employees[i].getBirthday().getMonth()==month){
                System.out.println(employees[i].toString()+"，实发工资："+(employees[i].earnings()+100));
            }else{
                System.out.println(employees[i].toString()+"，实发工资："+employees[i].earnings());
            }
        }

    }
}
