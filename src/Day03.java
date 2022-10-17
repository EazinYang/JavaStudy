public class Day03 {
    public static void main(String[] args){
        l1();
    }

    public static void arry(){
        int[] arr;
        arr=new int[]{1,2,3,4};

        int[] arr1={1,2,3,4};

        int[] arr2=new int[3];
        for(int i=0;i<arr2.length;i++){
            arr2[i]=i;
        }
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }

//    public static void rand(){
//        java.util.Random number=new java.util.Random();
//        int[] redGroup=new int[6];
//        for(int j=0;j<6;j++){
//            xun:while (true) {
//                int red = number.nextInt(33);
//                for (int i = 0; i <=j; i++) {
//                    if (redGroup[i] != red) {
//                        redGroup[j] = red;
//                        System.out.print(redGroup[j]+"\t");
//                        break xun;
//                    }
//                }
//            }
//        }
//        int blue=number.nextInt(16);
//        System.out.println(blue);

//    }

    public static void lianXi1(){
        char[] letters;
        letters=new char[26];
        for(int i=0;i<letters.length;i++){
            letters[i]=(char)('A'+i);
        }
        for(int i=0;i<letters.length;i++){
            System.out.print(letters[i]);
        }
    }

    public static void lianXi2(){
        char[] letters=new char[36];
        char k=48;
        for(int i=0;i<letters.length;i++){
            if(i<26){
                letters[i]=(char)('A'+i);
            }else {
                    letters[i]=k;
                    k++;
                }
            }
        for(int i=0;i<letters.length;i++){
            System.out.print(letters[i]);
        }
    }

    public static void lianXi3(){
        System.out.println("请输入学生人数：");
        java.util.Scanner input=new java.util.Scanner(System.in);
        int student=input.nextInt();
        int[] studentScore=new int[student];
        for(int i=0;i<studentScore.length;i++){
            System.out.println("请输入第"+(i+1)+"个学生的成绩");
            int score=input.nextInt();
            studentScore[i]=score;
        }
        int max=0;
        for(int i=0;i<studentScore.length;i++){
            if(studentScore[i]>max){
                max=studentScore[i];
            }
        }
        for(int i=0;i<studentScore.length;i++){
            if(studentScore[i]>=(max-10)){
                System.out.println("A");
            }else if(studentScore[i]>=(max-20)){
                System.out.println("B");
            }else if(studentScore[i]>=(max-30)){
                System.out.println("C");
            }else {
                System.out.println("D");
            }
        }
    }

    public static void reverse(){
        char[] letters=new char[26];
        for(int i=0;i<letters.length;i++){
            letters[i]=(char)('A'+i);
        }
        /*
        反转数组
        方法一：新建一个与原来数组长度相同的数组，然后逆序复制元素
        缺点：浪费空间
         */
        char[] newLetters=new char[letters.length];
        for(int i=0;i<letters.length;i++){
            newLetters[i]=letters[letters.length-1-i];
        }
        //让letters这个数组名指向新的数组
        letters=newLetters;

        //方法二：首位交换
        for(int i=0;i<letters.length/2;i++){
            char temp=letters[i];
            letters[i]=letters[letters.length-1-i];
            letters[letters.length-1-i]=temp;
        }
    }

    public static void find(){
        int[] arr={1,4,2,7,9};
        int value=2;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println(value+"不存在");
        }else {
            System.out.println(value+"数组中的下标是："+index);
        }
    }

    public static void erfenFind(){
        int[] arr={1,2,5,7,9};
        int value=6;
        int index=-1;
        int left=0;
        int rignt=arr.length-1;
        int mid=(left+rignt)/2;
        while(left<=rignt){
            if(arr[mid]==value){//找到了
                index=mid;
                break;
            }else if(value>arr[mid]){//去右边找
                left=mid+1;
            }else{//去左边找
                rignt=mid-1;
            }
            mid=(left+rignt)/2;
        }
        if(index==-1){
            System.out.println(value+"不存在");
        }else {
            System.out.println(value+"在数组中的下标是："+index);
        }

    }

    public static void bubbleSort(){
        int[] arr={4,2,1,8,3};
        //冒泡排序：通过相邻元素比较，如果相邻元素的顺序不符合要求，那么就交换
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int x=arr[i];
                    arr[i]=arr[j];
                    arr[j]=x;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void directSort(){
        int[] arr={4,2,1,8,3};
        for(int i=0;i<arr.length;i++){
            int min=arr[i];
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    index=j;
                }
            }
            if(index!=i){
                int x=arr[i];
                arr[i]=arr[index];
                arr[index]=x;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void homework1(){
        int[] number=new int[10];
        for(int i=0;i<10;i++){
            number[i]=(int)(Math.random()*100+1);
        }
        System.out.println("中奖号码为：");
        for(int i=0;i<10;i++){
            System.out.println(number[i]);
        }
    }

    public static void homework2(){
        String[] color={"黑桃","红桃","梅花","方片"};
        String[] number={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        for(int i=0;i<color.length;i++){
            for(int j=0;j<number.length;j++){
                System.out.print(color[i]+number[j]+"\t");
            }
            System.out.println();
        }
    }

    public static void homework3(){
        char[] arr={'a','l','f','m','f','o','b','b','s','n'};
        int[] counts=new int[26];
        for(int i=0;i<arr.length;i++){
            counts[arr[i]-97]++;
        }
        for(int i=0;i<counts.length;i++){
            if(counts[i]!=0) {
                System.out.println((char) (i + 97) + "--" + counts[i]);
            }
        }
    }

    public static void machArray(){
        int[][] scores;
        scores=new int[][]{
                {67,89,45},
                {90,99,88,100},
                {34,56,12,67}
        };

        /*
        遍历二维数组
        for(int i=0;i<行数;i++){
            for(int j=0;j<该行的列数;j++){
                System.out.print(二维数组名[i][j]+" ");
            }
        }
         */
        for(int i=0;i<scores.length;i++){
            for(int j=0;j<scores[i].length;j++){
                System.out.print(scores[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void homework4(){
        int[] arr={95,92,75,56,98,71,80,58,91,91};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double ave=(double)sum/arr.length;
        int num=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>ave){
                num+=1;
            }
        }
        System.out.println("高于平均分:"+ave+"的学生有"+num+"个");
    }

    public static void sym(){
        int[] arr={5,3,7,5,5,7,3,5};
        boolean result=true;
        for(int i=0;i<arr.length/2;i++){
            if(arr[i]!=arr[arr.length-1-i]){
                result=false;
                break;
            }
        }
        if(result==true){
            System.out.println("该数组元素对称");
        }else {
            System.out.println("该数组元素不对称");
        }
    }

    public static void homewrok5(){
        char[] arr={'A','D','B','C','D'};
        String[] name={"xiaoShang","xiaoGui","xiaoGu","xiaoHao"};
        int[][] student={{'D','C','B','A','D'},
                {'A','D','B','C','D'},
                {'A','D','B','C','A'},
                {'A','B','C','D','D'}};
        for(int j=0;j<student.length;j++){
            int score=0;
            for(int i=0;i<arr.length;i++){
                if(student[j][i]==arr[i]){
                    score+=2;
                }
            }
            System.out.println(name[j]+"的总成绩是："+score+"分");
        }
    }

    public static void homework6(){
        int[] arr={9,10,6,6,1,9,3,5,6,4};
        int count=arr.length;
        for(int i=0;i<count;i++){
            int x;
            for(int j=0;j<count;j++){
                if(i!=j && arr[i]==arr[j]){
                    if(j<i){
                        x=arr[count-1];
                        arr[count-1]=arr[i];
                        arr[i]=x;
                        count--;
                    }else {
                        x=arr[count-1];
                        arr[count-1]=arr[j];
                        arr[j]=x;
                        count--;
                    }
                }
            }
        }
        int[] arr1=new int[count];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=arr[i];
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+"\t");
        }
    }

    public static void lianXi4(){
        int[] arr={1,6,4,66,34,89,54,12,4};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }

    public static void lianXi5(){
        java.util.Scanner input=new java.util.Scanner(System.in);
        System.out.println("请输入杨辉三角的行数：");
        int x=input.nextInt();
        int[][] arr=new int [x][];
        for(int i=0;i<x;i++){
            arr[i]=new int[i+1];
            for(int j=0;j<i+1;j++){
                if(i>1){
                    if(j==0 || j==arr[i].length-1){
                        arr[i][j]=1;
                    }
                    else{
                        arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                    }
                }else{
                    arr[i][j]=1;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static void l1(){
        int n=1;
        for(int i=1;i<11;i++){
            n*=i;
        }
        System.out.println(n);
    }
}
