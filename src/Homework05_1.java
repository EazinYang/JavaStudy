public class Homework05_1 {
    public static void main(String[] args){
        System.out.println(getTriangleArea(5.5,6.5));
    }
    public static void printRectangle(){
        for(int i=1;i<6;i++){
            for(int j=1;j<6;j++){
                if(i==1||i==5){
                    System.out.print("*");
                }else {
                    if(j==1||j==5){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }System.out.println();
        }
    }

    public static void printRectangle(int line,int column,String sign){
        for(int i=0;i<line;i++){
            for(int j=0;j<column;j++){
                if(i==0||i==line-1){
                    System.out.print(sign);
                }else {
                    if(j==0||j==column-1){
                        System.out.print(sign);
                    }else {
                        System.out.print(" ");
                    }
                }
            }System.out.println();
        }
    }

    public static double getTriangleArea(double base,double height){
        double area=base*height*0.5;
        return area;
    }

    public static double getTriangleArea(double a,double b,double c){
        if(a+b>=c && a+c>=b && b+c>=a){
            double p=(a+b+c)/2;
            double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));//海伦公式
            return area;
        }else {
            return 0.0;
        }
    }

}
