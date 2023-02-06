public class Day01 {
    public static void main(String[] args){
        homeWork6();
    }

    public static void DefineAndUseVariable(){
        /*
        如何声明一个变量？
        格式：
            数据类型 变量名；
        如何给变量赋值？
        格式：
            变量名=变量值
         */
        int age =18;

        String name="蔡依林";//字符串的常量必须要""(双引号)
        char gender='女';//单字符的常量，必须用''(单引号)
        double weight=40.5;//小数类型
        boolean marry=true;//布尔类型
    }

    public static void TypeChange(){
        /*
        从左边看d1是double类型
        从右边看10是int类型
        int类型的值，赋值给了double类型的变量，那么它会自动升级为double
         */
        double d1=10;
        System.out.println("d1="+d1);

        /*
        从左边看i1是int类型
        从右边看10.0是double类型
        double类型的值，赋值给int类型的变量，如果直接赋值会报错：错误：不兼容
        的类型：
         */

        //强制类型转化
        double d2=10.0;
        int i1=(int)d2;

        int x = 10;
        int y =3;
        System.out.println("x+y="+x+y); //输出x+y=103,变为了拼接
        System.out.println("x+y="+(x+y));//输出x+y=13
        System.out.println("x/3="+(x/y));//输出x/3=3，整数/整数，结果只保留整数
        System.out.println("x%y="+(x%y));//输出x%y=1.txt，%取余
        System.out.println("-5%2="+-5%2);//输出-5%2=-1.txt
        System.out.println("5%-2="+5%-2);//输出-5%2=1.txt,正负号只取被模数的正负号

        int i=2;
        int j=++i;
        System.out.println("j="+j);//输出j=3,++i先自增，然后把i的值取出来赋值给j

        int n=2;
        int m = n++;
        System.out.println("m="+m);//输出m=2,n++先把n的值放到一个“操作数栈”中，然后n完成自增

        int z=1;
        z=z++;
        System.out.println("z="+z);//(1.txt)取出z的值，放到“操作数栈，(2)然后z自增，z=2，(3)把“操作数栈”的值赋给z

        int b=1;
        int c=2;
        int d= b++ + ++b + ++b * c++;
        /*
        第一步:b++
        (1.txt)先取b的值“1.txt”，先放到一个“操作数栈“
        (2)紧接着b自增，b=2
        第二步：++b
        (1.txt)b先自增，b=3
        (2)再取b的值”3“，放到一个”操作数栈“
        第三步：++b
        (1.txt)b先自增，b=4
        (2)再取b的值"4"，先放到一个”操纵数栈”
        第四步：c++
        (1.txt)先取C的值“2”，放到一个“操作数栈”
        (2)紧接着c自增，c=3
        第五步：先算乘 ++b和c++的乘法部分
        4*2=8，然后压回“操作数栈”
        第六步：再算b++ + ++b +乘的值
        1.txt+3+8=12
         */
        System.out.println("b="+b);//输出4
        System.out.println("b="+c);//输出3
        System.out.println("b="+d);//输出12

        int number = 839;
        System.out.println("个位数："+ (number%100)%10);
        System.out.println("十位数："+(number%100)/10);
        System.out.println("百位数：" +number/100);

    }

    public static void YunSuanFu(){
        byte b1 = 1;
        byte b2 = 2;
        //b2 = b1 + b2; //报错，右边byte+byte结果是int
        b2 += b1;  //等价于 b2=(byte) (b2+b1);

        int i = 1;
        int j = 5;
        j *= i++ + j;
        System.out.println("i=" + i);//输出2
        System.out.println("j=" + j);//输出30

        //判断数学成绩在70和80之间
        int score = 80;
        if(70<=score & score<=80){
            System.out.println("良好");
        }
        //判断成绩是否在合理范围内
        if(score<=0 | score>100){
            System.out.println("合理");//结果为false，不输出
        }

        boolean marry = false;
        System.out.println(marry ? "已婚" : "未婚"); //输出未婚

        int q = 4;
        int w =4;
        int max = q>=w ? q : w;
    }

    public static void webYunFu(){
        /*
        左移<<
        运算规则：<<几位，就乘以2的几次方
                 二进制补码左移n位，右边补0
        右移>>
        运算规则：>>几位，就除以2的几次方
                 二进制补码右移n，左边补0还是1，看最高位
         无符号右移>>>
         运算规则：二进制补码右移n位，左边补0，对于负数来说，移完后，变为正数
         */
        System.out.println(4 << 3);//等价于4乘以2的3次方,4*8=32
        System.out.println(32 >> 4);//等价于32除以2的4次方，32/16=2

        System.out.println(-32 >> 4);//输出-2
        System.out.println(32 >>> 4);//输出2
        System.out.println(-32 >>> 4);//输出268435454

        /*
        按位与：&
            1.txt & 1.txt 结果1
            1.txt & 0 结果0
            0 & 1.txt 结果0
            0 & 0 结果0
        同理 按位或|、按位异或^、按位取反~
         */
        System.out.println(32 & 25);//输出0
        /*
        32: 0000 0000 0000 0000 0000 0000 0010 0000
        25: 0000 0000 0000 0000 0000 0000 0001 1000
        32 &25:  0000 0000 0000 0000 0000 0000 0000
         */
    }

    public static void homeWork1(){
        /*
        定义一个int类型变量，保存年份，判断这个年份是否是闰年
         */
        int year = 2022;
        if(year%4==0 && year%100!=0 ){
            System.out.println(year+"是闰年");
        }else if(year%400==0){
            System.out.println(year+"是闰年");
        }else {
            System.out.println(year + "不是闰年");
        }

        boolean result = year%4==00 && year%100!=0 || year%400==0;
        System.out.println(year+(result?"是闰年":"不是闰年"));
    }

    public static void homeWork2(){
        //定义三个int类型的变量，x，y，z，随意赋值整数值，求最大值
        int x =99;
        int y =15;
        int z =168;
        if(x>=y && x>=z){
            System.out.println("x,y,z的最大值是"+x);
        }
        else if(y>=x && y>=z){
            System.out.println("x,y,z的最大值是"+y);
        }else {
            System.out.println("x,y,z的最大值是"+z);
        }
    }

    public static void homeWork3(){
        //为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时？
        int i =89;
        int j = i/24;
        int l = i%24;
        System.out.println("共"+j+"天"+l+"小时");
    }

    public static void homeWork4(){
        //假设今天是周4，100天以后是周几
        int x=100;
        int i=(100+4)%7;
        System.out.println("100天后是周"+i);
    }

    public static void homeWork5(){
        /*
        小明要到美国旅游，可是那里的温度是以华氏度为单位记录的。
        它需要一个程序将华氏温度（80度）转换为摄氏度，
        并以华氏度和摄氏度为单位分别显示该温度。
        ℃=(℉-32)/1.txt.8
         */
        int x=80;
        double y=(80-32)/1.8;
        System.out.println(x+"℉，"+y+"℃");
    }

    public static void homeWork6(){
        /*
        编写代码实现交换如下两个变量中值
        int m = 1.txt;
        int n = 2;
         */
        int m=1;
        int n=2;
        int x=m;
        m=n;
        n=x;
        System.out.println("m="+m+",n="+n);
    }
}
