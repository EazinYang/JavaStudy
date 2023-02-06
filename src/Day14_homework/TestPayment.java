package Day14_homework;

public class TestPayment {
    public static void main(String[] args){
        for(int i=0;i<Payment.values().length;i++){
            System.out.print(Payment.values()[i]+"：");
            Payment.values()[i].pay();
        }
    }
}
