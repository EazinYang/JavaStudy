package Day11.Static;

public class Frock {
    private static int currentNum=100000;
    int serialNumber;

    public static int getNextNum(){
        return currentNum+=100;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public Frock(){
        this.serialNumber=getNextNum();
    }

    static{
        currentNum=150000;
        System.out.println(currentNum);
    }
}
