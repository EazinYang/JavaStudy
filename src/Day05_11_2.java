public class Day05_11_2 {
    public static void main(String[] args){
        Day05_11_1[] student=new Day05_11_1[3];
        java.util.Scanner input=new java.util.Scanner(System.in);
        for(int i=0;i<student.length;i++) {
            System.out.print("请输入姓名：");
            String name = input.next();
            System.out.print("请输入成绩：");
            int score = input.nextInt();
            student[i] = new Day05_11_1();
            student[i].name = name;
            student[i].score = score;
        }
        for(int j=0;j<student.length;j++){
            System.out.println("姓名："+student[j].name+",成绩："+student[j].score);
        }
        for(int x=0;x<student.length-1;x++){
            for(int y=x+1;y<student.length;y++){
                if(student[x].score>student[y].score){
                    String n=student[x].name;
                    int s=student[x].score;
                    student[x].name=student[y].name;
                    student[x].score=student[y].score;
                    student[y].name=n;
                    student[y].score=s;
                }
            }
        }
        for(int j=0;j<student.length;j++){
            System.out.println("姓名："+student[j].name+",成绩："+student[j].score);
        }
    }

}
