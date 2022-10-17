public class Day05_pri {
    public static void main(String[] args){
//        System.out.println(method(10,100));
//        mOL(5);
//        mOL(5,6);
//        mOL("今天周四！");
        System.out.println("5和6的最大值是："+max(5,6));
        System.out.println("8.4和7.4的最大值是："+max(8.4,7.4));
        System.out.println("9.2、1.6、4.6的最大值是："+max(9.2,1.6,4.6));

    }

    public static int max(int i,int j){
        int a=i>j ? i:j;
        return a;
    }

    public static double max(double x,double y){
        double a=x>y ? x:y;
        return a;
    }

    public static double max(double a,double s,double d){
        double m=max(a,s);
        double n=max(m,d);
        return n;
    }

    public static void mOL(int i){
        System.out.println(i+"^2="+i*i);
    }

    public static void mOL(int x,int y){
        System.out.println(x+"*"+y+"="+x*y);
    }

    public static void mOL(String z){
        System.out.println(z);
    }

    public static int method(int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 ||i==(m-1)){
                    System.out.print("*");
                }
                else {
                    if(j==0 ||j==(n-1)){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }System.out.println();
        }
        return m*n;
    }
}
