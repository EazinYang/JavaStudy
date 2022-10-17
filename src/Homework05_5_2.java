import java.util.EmptyStackException;

public class Homework05_5_2 {
    public static void main(String[] args){
        Homework05_5_1[] Employee=new Homework05_5_1[5];
        Employee[0]=new Homework05_5_1();
        Employee[0].id=1;
        Employee[0].name="小明";
        Employee[0].salary=3000.00;
        Employee[0].age=20;
        Employee[1]=new Homework05_5_1();
        Employee[1].id=2;
        Employee[1].name="小红";
        Employee[1].salary=3000.00;
        Employee[1].age=18;
        Employee[2]=new Homework05_5_1();
        Employee[2].id=3;
        Employee[2].name="小黄";
        Employee[2].salary=3000.00;
        Employee[2].age=25;
        Employee[3]=new Homework05_5_1();
        Employee[3].id=4;
        Employee[3].name="小军";
        Employee[3].salary=3000.00;
        Employee[3].age=30;
        Employee[4]=new Homework05_5_1();
        Employee[4].id=5;
        Employee[4].name="小丽";
        Employee[4].salary=3000.00;
        Employee[4].age=25;
        sort(Employee);
    }

    public  static void print(Homework05_5_1[] all){
        for(int i=0;i<all.length;i++){
            System.out.println(all[i].id+"\t"+all[i].name+"\t"+all[i].salary+"\t"+all[i].age);
        }
    }

    public static void sort(Homework05_5_1[] all){
        for(int i=0;i<4;i++){
            for(int j=i+1;j<5;j++){
                int x;
                String y;
                double z;
                int a;
                if(all[i].age<all[j].age){
                    x=all[i].age;
                    all[i].age=all[j].age;
                    all[j].age=x;
                    y=all[i].name;
                    all[i].name=all[j].name;
                    all[j].name=y;
                    z=all[i].salary;
                    all[i].salary=all[j].salary;
                    all[j].salary=z;
                    a=all[i].id;
                    all[i].id=all[j].id;
                    all[j].id=a;
                }
            }
        }
        print(all);
    }
}
