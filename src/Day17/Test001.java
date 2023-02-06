package Day17;

public class Test001 {
    public static void main(String[] args){
        Number n=new Number();
        n.start();
        while (n.type){
            n.interrupt();
        }
    }
}
