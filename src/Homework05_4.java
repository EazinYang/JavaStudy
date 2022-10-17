public class Homework05_4 {
    public static void main(String[] args){
        int[] arr={1,6,4};
        System.out.println(isEvent(4,2,0,4,10,6));
    }

    public static long sum(int... num){
        int i=0;
        for(int j=0;j<num.length;j++){
            i+=num[j];
        }
        return i;
    }

    public static String concat(String... str){
        String x="";
        for(int i=0;i<str.length;i++){
            x+=str[i];
        }
        return x;
    }

    public static boolean isEvent(int... even){
        boolean boo=false;
        long i=sum(even);
        if(i%2==0){
            boo=true;
        }
        return boo;
    }
}
