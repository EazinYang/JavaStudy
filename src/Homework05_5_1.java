public class Homework05_5_1 {
    int id;
    String name;
    double salary;
    int age;

    void printInfo(){
        System.out.println(id+name+salary+age);
    }

    void setInfo(int i,String n,double s,int a){
            id=i;
            name=n;
            salary=s;
            age=a;
    }
}
