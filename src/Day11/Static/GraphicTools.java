package Day11.Static;

public class GraphicTools {
    public static void printRectangle(int line,int columm,String sign){
        for (int i=0;i<line;i++){
            for (int j=0;j<columm;j++){
                System.out.println(sign);
            }
            System.out.println();
        }

    }
}
