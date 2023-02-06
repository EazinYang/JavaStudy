package Day14_homework;

public enum Payment implements Payable {
    APILPAY,WECHAT,CREDIT_CARD,DEPOSIT_CARD;

    @Override
    public void pay() {
        if(name()=="APILPAY"||name()=="WECHAT"){
            System.out.println("扫码支付");
        }else {
            System.out.println("输入卡号支付");

        }    }
}
