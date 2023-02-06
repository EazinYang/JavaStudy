package Day21;
@SuppressWarnings("all")
//此时想要限定这个T必须是一个数字，不能字符串等其他类型
public class XueSheng<T extends Number>{
    private String name;
    private T score;

    public XueSheng(String name, T score) {
        super();
        this.name = name;
        this.score = score;
    }
}
