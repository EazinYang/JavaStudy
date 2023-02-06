package homework18;

import org.junit.Test;

public class Homework12 {
    public static void main(String[] args) {
        String str = "1.txt、 hello 2. world 3. java 4.String 5. haha 6、HELLO";
        str=str.replaceAll("[^a-zA-Z]*","");
        System.out.println(str);
        str=str.toUpperCase();
        char[] c = str.toCharArray();
        char[] number=new char[c.length];
        int num=0;
        for (int i = 0; i<c.length;i++) {
            int count=0;
            for (int j = 0; j<c.length;j++) {
                if(c[i]==c[j]){
                    count++;
                }
            }
            if(count>=num){
                num=count;
//                number[i];
            }
        }
        System.out.println(number+"出现了"+num+"次");
    }

    @Test
    public void test01(){
        String str = "1.txt、 hellao 2. world 3. java 4.String 5. haha 6、HELLO";
        //把字符串转为小写，因为不区分大小写，方便统计
        str = str.toLowerCase();
        //转为字符数组
        char[] arr = str.toCharArray();
        //统计每个字母出现次数
        //count[0]存的'a'的次数 'a'=97  97-97->0
        //count[1.txt]存的'b'的次数 'b'=98  98-97->0
        int[] counts = new int[26];//记录26个字母的次数
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>='a' && arr[i]<='z'){
                counts[arr[i]-97]++;
            }
        }

        //找最大值
        int max = counts[0];
        for (int i = 1; i < counts.length; i++) {
            if(max < counts[i]){
                max = counts[i];
            }
        }
        //打印最大值和字母
        for (int i = 0; i < counts.length; i++) {
            if(counts[i] == max){
                //i=0 'a'字母
                System.out.println(((char)(i+97)) + "出现了" + max + "次");
            }
        }
    }
}
