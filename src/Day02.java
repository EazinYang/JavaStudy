import javax.swing.*;
import java.security.PublicKey;
import java.util.Scanner;

public class Day02{
    public static void main(String[] args){

        lianXi21();
    }

    public static void input(){
        /*
        1.txt）准备一个数据的扫描仪（对象），指定数据的来源
        java.util.Scanner input = new java.util.Scanner(System.in);
        （1.txt）java.util.Scanner input是一个扫描仪的类型，是引用数据类型，首字母是大写，其中 java.util是包
        （2）input是一个变量名，它代表这个扫描仪
        （3）new java.util.Scanner(System.in)是给input赋值的
        （4）(System.in)是指定了数据的来源是表示的输入设备，默认代表键盘输入
         */
        java.util.Scanner input=new java.util.Scanner(System.in);
        System.out.println("请输入年龄：");//这个语句在输入之前执行
        //nextInt()是input这个对象的方法
        int age=input.nextInt();

        System.out.println("请输入姓名：");
        String name=input.next();//因为String输入太常用，所以方法名简化，没有用nextString

        System.out.println("请输入体重：");
        double weight=input.nextDouble();

        System.out.println("请输入是否漂亮");
        boolean beautiful=input.nextBoolean();

        System.out.println("请输入性别：");
        /*
        //因为输入单个char太少用了，Scanner中没有提供输入单个char的方法
        那么我们先输入字符串，然后通过索引为取第一个字符
         */
        char gender=input.next().charAt(0);

        System.out.println("姓名："+name);
        System.out.println("年龄："+age);
        System.out.println("体重："+weight);
        System.out.println("性别："+gender);
        System.out.println("是否片漂亮："+beautiful);
    }

    public static void lianXi1(){
        /*
        岳小鹏参加Java考试，他和父亲岳不群达成承诺：
        如果：
        成绩为100分时，奖励一辆BMW；
        成绩为(80，99]时，奖励一台iphone7plus；
        当成绩为[60,80]时，奖励一个 iPad；
        其它时，什么奖励也没有。
        请从键盘输入岳小鹏的期末成绩，并加以判断
         */
        System.out.println("请输入岳小鹏的期末成绩：");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int score =input.nextInt();
        if(score==100){
            System.out.println("奖励一辆BMW！");
        }else if(score>80 && score<=90){
            System.out.println("奖励一台iphone7plus！");
        }else if(score>=60 && score <=80){
            System.out.println("奖励一个iPad！");
        }else {
            System.out.println("继续努力！");
        }
    }

    public static void lianXi2(){
        /*
        编写程序：由键盘输入三个整数分别存入变量num1、num2、num3，
        对它们进行排序(使用 if-else if-else),并且从小到大输出。
         */
        System.out.println("请一次输入三个变量num1、num2、num3");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        if(num1 >= num2 && num1>num3 && num2>num3){
            System.out.println("排序结果为："+num3+"、"+num2+"、"+num1);
        }else if(num1>num2 && num1>num3 && num2<=num3){
            System.out.println("排序结果为："+num2+"、"+num3+"、"+num1);
        }else if(num1>=num2 && num1<num3){
            System.out.println("排序结果为："+num2+"、"+num1+"、"+num3);
        }else if(num1>=num3 && num1<num2){
            System.out.println("排序结果为："+num3+"、"+num1+"、"+num2);
        }else if(num2>num1 && num2>=num3 && num3>num1){
            System.out.println("排序结果为："+num1+"、"+num3+"、"+num2);
        }else if(num2>=num1 && num2<num3){
            System.out.println("排序结果为："+num1+"、"+num2+"、"+num3);
        }else{
            System.out.println("排序结果为："+num1+"、"+num2+"、"+num3);
        }
    }

    public static void lianXi3(){
        /*
        编写程序，声明2个int型变量并赋值。
        判断两数之和，如果大于等于50，打印“hello world!”
         */
        int x=50;
        int y=10;
        if(x+y>=50) {
            System.out.println("hello world!");
        }
    }

    public static void lianXi4(){
        double x=10.4;
        double y=19.9;
        if(x>10.0 && y<20.0){
            System.out.println(x+y);
        }
    }

    public static void lianXi5(){
        /*
        大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，
        当然要提出一定的条件：高：180cm以上；富：财富1千万以上；帅：是。
        * 如果这三个条件同时满足，则：“我一定要嫁给他!!!”
        * 如果三个条件有为真的情况，则：“嫁吧，比上不足，比下有余。”
        * 如果三个条件都不满足，则：“不嫁！”
         */
        int tall=180;
        int money=10000000;
        boolean shuai=true;
        if(tall>=180 && money>=10000000 && shuai==true){
            System.out.println("我一定要嫁给他！！！");
        }else if(tall>=180 || money>=10000000 || shuai==true){
            System.out.println("嫁吧，比上不足，比下有余。");
        }else{
            System.out.println("不嫁！");
        }
    }

    public static void lianXi6(){
        /*
        假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，
        提示用户输入一个两位数，然后按照下面的规则判定用户是否能赢。
        1.txt)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
        2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
        3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
        4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
        5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。
         */
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("请输入第一位彩票号码：");
        int oneNumber= input.nextInt();
        System.out.println("请输入第二位彩票号码：");
        int twoNumber= input.nextInt();

        int winNumber=(int)(Math.random()*90+10);
        int oneWinNumber=winNumber/10;
        int twoWinNumber=winNumber%10;
        System.out.println("中奖号码为："+oneWinNumber+","+twoWinNumber);

        if(oneNumber==oneWinNumber && twoNumber==twoWinNumber){
            System.out.println("恭喜你获得奖金10000美元！");
        }else if(oneNumber==twoWinNumber && twoNumber==oneWinNumber){
            System.out.println("恭喜你获得奖金3000美元！");
        }else if(oneNumber==oneWinNumber ||twoNumber==twoWinNumber){
            System.out.println("恭喜你获得奖金1000美元！");
        }else if(oneNumber==twoWinNumber ||twoNumber==oneWinNumber){
            System.out.println("恭喜你获得奖金500美元！");
        }else{
            System.out.println("很遗憾，你没有中奖！");
        }
    }

    public static void lianXi7(){
        java.util.Scanner input= new java.util.Scanner(System.in);
        char x=input.next().charAt(0);
        switch(x){
            case 'a':
                System.out.println('A');
                break;
            case 'b':
                System.out.println('B');
                break;
            case 'c':
                System.out.println('C');
                break;
            case 'd':
                System.out.println('D');
                break;
            case 'e':
                System.out.println('E');
                break;
            default:
                System.out.println("other");
        }
    }

    public static void lianXi8(){
        java.util.Scanner input=new java.util.Scanner(System.in);
        int season=input.nextInt();
        if(season>=3 && season<=5){
            System.out.println(season+"月是春季！");
        }else if(season>=6 && season<=8){
            System.out.println(season+"月是夏季！");
        }else if(season>=9 && season<=11){
            System.out.println(season+"月是秋季！");
        }else{
            System.out.println(season+"月是冬季！");
        }
    }

    public static void lianXi9(){
        java.util.Scanner input= new java.util.Scanner(System.in);
        System.out.println("请输入month：");
        int month= input.nextInt();
        System.out.println("请输入day：");
        int day=input.nextInt();
        if(month>1 && month<8){
            if(month%2==0){
                int bigMonth=(month/2)*31;
                int smallMonth=(month/2-1)*30;
                int sumDay=bigMonth+smallMonth+28+day;
                System.out.println("日期为2017年的第："+sumDay+"天！");
            }
            else{
                int bigMonth=(month/2+1)*31;
                int smallMonth=(month/2-1)*30;
                int sumDay=bigMonth+smallMonth+28+day;
                System.out.println("日期为2017年的第："+sumDay+"天！");
            }
        }else if(month>=8){
            if(month%2==0){
                int bigMonth=(month/2+1)*31;
                int smallMonth=(month/2-2)*30;
                int sumDay=bigMonth+smallMonth+28+day;
                System.out.println("日期为2017年的第："+sumDay+"天！");
            }else{
                int bigMonth=(month/2+1)*31;
                int smallMonth=(month/2-1)*30;
                int sumDay=bigMonth+smallMonth+28+day;
                System.out.println("日期为2017年的第："+sumDay+"天！");
            }
        }else{
            System.out.println("日期为2017年的第："+(31+day)+"天！");
        }
    }

    public static void lianXi10(){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int score=input.nextInt();
        if(score>=90){
            System.out.println("等级：A");
        }else if(score>=70 && score<90){
            System.out.println("等级: B");
        }else if(score>=60 && score<70){
            System.out.println("等级: C");
        }else{
            System.out.println("等级：D");
        }
    }

    public static void lianXi11(){
        java.util.Scanner input=new java.util.Scanner(System.in);
        System.out.println("请输入年份：");
        int year=input.nextInt();
        System.out.println("请输入月份：");
        int month=input.nextInt();
        System.out.println("请输入日期：");
        int day=input.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            if(month>1 && month<8){
                if(month%2==0){
                    int bigMonth=(month/2)*31;
                    int smallMonth=(month/2-1)*30;
                    int sumDay=bigMonth+smallMonth+29+day;
                    System.out.println("日期为"+year+"年的第："+sumDay+"天！");
                }
                else{
                    int bigMonth=(month/2+1)*31;
                    int smallMonth=(month/2-1)*30;
                    int sumDay=bigMonth+smallMonth+29+day;
                    System.out.println("日期为"+year+"年的第："+sumDay+"天！");
                }
            }else if(month>=8){
                if(month%2==0){
                    int bigMonth=(month/2+1)*31;
                    int smallMonth=(month/2-2)*30;
                    int sumDay=bigMonth+smallMonth+29+day;
                    System.out.println("日期为"+year+"年的第："+sumDay+"天！");
                }else{
                    int bigMonth=(month/2+1)*31;
                    int smallMonth=(month/2-1)*30;
                    int sumDay=bigMonth+smallMonth+29+day;
                    System.out.println("日期为"+year+"年的第："+sumDay+"天！");
                }
            }else{
                System.out.println("日期为"+year+"年的第："+(31+day)+"天！");
            }
        }else{
            if(month>1 && month<8){
                if(month%2==0){
                    int bigMonth=(month/2)*31;
                    int smallMonth=(month/2-1)*30;
                    int sumDay=bigMonth+smallMonth+28+day;
                    System.out.println("日期为"+year+"年的第："+sumDay+"天！");
                }
                else{
                    int bigMonth=(month/2+1)*31;
                    int smallMonth=(month/2-1)*30;
                    int sumDay=bigMonth+smallMonth+28+day;
                    System.out.println("日期为"+year+"年的第："+sumDay+"天！");
                }
            }else if(month>=8){
                if(month%2==0){
                    int bigMonth=(month/2+1)*31;
                    int smallMonth=(month/2-2)*30;
                    int sumDay=bigMonth+smallMonth+28+day;
                    System.out.println("日期为"+year+"年的第："+sumDay+"天！");
                }else{
                    int bigMonth=(month/2+1)*31;
                    int smallMonth=(month/2-1)*30;
                    int sumDay=bigMonth+smallMonth+28+day;
                    System.out.println("日期为"+year+"年的第："+sumDay+"天！");
                }
            }else{
                System.out.println("日期为"+year+"年的第："+(31+day)+"天！");
            }
        }
    }

    public static void lianXi12(){
        java.util.Scanner input =new java.util.Scanner(System.in);
        System.out.println("请输入年：");
        int year=input.nextInt();
        System.out.println("请输入月：");
        int month=input.nextInt();
        System.out.println("请输入日：");
        int day=input.nextInt();
        int days=day;
        switch(month) {
            case 12:
                days += 30;
            case 11:
                days += 31;
            case 10:
                days += 30;
            case 9:
                days += 31;
            case 8:
                days += 31;
            case 7:
                days += 30;
            case 6:
                days += 31;
            case 5:
                days += 30;
            case 4:
                days += 31;
            case 3:
                if (month % 2 == 0 && month % 100 != 0 || month % 400 == 0) {
                    days += 29;
                } else {
                    days += 28;
                }
            case 2:
                days += 31;
        }
        System.out.println(year+"年"+month+"月"+day+"日是当年的第"+days+"天");
    }

    public static void lianXi13(){
        java.util.Scanner input= new java.util.Scanner(System.in);
        System.out.println("请输入：");
        String str=input.next();
        int number1=(int)(((Math.random()*10+1))/2+1);
        int number2=(int)(((Math.random()*10+1))/2+1);
        int number3=(int)(((Math.random()*10+1))/2+1);
        System.out.println(number1+"、"+number2+"、"+number3+"、"+str);
        switch (str){
            case "豹子":
                if (number1==number2 && number1==number3){
                    System.out.println("恭喜你猜对了！");
                }else {
                    System.out.println("恭喜你猜错了！");
                }break;
            case "大":
                if ((number1+number2+number3)>9){
                    System.out.println("恭喜你猜对了！");
                }else {
                    System.out.println("恭喜你猜错了！");
                }break;
            case "小":
                if ((number1+number2+number3)<=9){
                    System.out.println("恭喜你猜对了！");
                }else {
                    System.out.println("恭喜你猜错了！");
                }
        }
    }

    public static void lianXi14(){
        for(int i=1;i<=150;i++){
            if (i%3==0){
                System.out.println("foo");
            }else if(i%5==0){
                System.out.println("biz");
            }else if(i%7==0){
                System.out.println("baz");
            }else {
                System.out.println("x");
            }
        }
    }

    public static void lianXi15(){
        int x=1;
        int y=0;
        while (x<=100){
            if(x%2!=0){
                y+=x;
            }
            x++;
        }
        System.out.println(y);
    }

    public static void lianXi16(){
        int j=0;
        int l=0;
        for (int i=1;i<=100;i++){
            if(i%7==0){
                j+=1;
                l+=i;
                i++;
            }
        }
        System.out.println(j+"、"+l);
    }

    public static void lianXi17(){
        for (int j=100;j<1000;j++){
            int x=j%10;
            int y=j%100/10;
            int z=j/100;
            if((x*x*x+y*y*y+z*z*z)==j) {
                System.out.println(j);
            }
        }
    }

    public static void lianXi18(){
        java.util.Scanner input=new java.util.Scanner(System.in);
        int m;
        while(true){
            System.out.println("请输入第一个正整数：");
            m=input.nextInt();
            if(m<0){
                System.out.println("不是正整数，请再次输入：");
            }else {break;}
        }
        int n;
        while(true){
            System.out.println("请输入第二个正整数：");
            n=input.nextInt();
            if(n<0){
                System.out.println("不是正整数，请再次输入：");
            }else {break;}
        }

        int max= m>n? m:n;
        int min= m<n? m:n;
        int maxYue=1;
        for(int i=min;i>=1;i--){
            if(m%i==0 && n%i==0){
                maxYue=i;
                break;
            }
        }
        System.out.println(maxYue+"是"+m+"和"+n+"的最大公约数");
//        System.out.println(m*n/maxYue+"是"+m+"和"+n+"的最小公倍数");公式
        for(int i=max;i<=m*n;i++){
            if(i%m==0 && i%n==0){
                System.out.println(i+"是"+m+"和"+n+"的最小公倍数");
                break;
            }
        }

    }

    public static void doWhile(){
        //从键盘输入整数，输入0结束，统计输入的正数、负数
        java.util.Scanner input=new java.util.Scanner(System.in);
        int num;//声明放到外面，为了do{}外面可以使用该变量
        int positive=0;
        int negative=0;
        do{
            num=input.nextInt();
            if(num>0){
                positive++;
            }else if(num<0){
                negative++;
            }
        }while(num!=0);//循环条件：
        System.out.println("整数的个数："+positive);
        System.out.println("负数的个数："+negative);
    }

    public static void con(){
        //打印1-100的偶数
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void lianXi19(){
        for(int i=1;i<10;i++){
            int j=1;
            while(j<=i){
                System.out.print(i+"*"+j+"="+j*i+"\t");
                j++;
            }
            System.out.println("");
        }
    }

    public static void lianXi20(){
        for(int i=1;i<=100;i++){
            int j=1;
            while (i<=j){
                if(i%j==0){

                }
            }
        }
    }

    public static void lianXi21(){
        for(int i=1;i<=100;i++){
            for(int j=2;j<=99;j++){
                if(j>i){
                    break;
                }else if(i%j==0 && i!=2){
                    break;
                }else {
                    System.out.print(i+"\t");
                    break;
                }
            }
        }
    }
}

