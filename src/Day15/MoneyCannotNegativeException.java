package Day15;
//声明一个异常类型，表示金额不能为负数
public class MoneyCannotNegativeException extends Exception{
    public MoneyCannotNegativeException() {
        super();
    }

    public MoneyCannotNegativeException(String message) {
        super(message);
    }
}
