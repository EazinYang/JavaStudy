package homework17;

public class TestTunnel {
    public static void main(String[] args){
        Tunnel t=new Tunnel();
        for(int i=0;i<=10;i++){
            Thread th=new Thread(t,"p"+i);
            th.start();
        }
    }
}
