package Enum;

public class Gender {
    //public，使得外面可用，static使得可以"类名."访问，final使对象不可变
    public static final Gender NAN=new Gender("男");
    public static final Gender NV=new Gender("女");
    public static final Gender YAO=new Gender("妖");
    private String description;

    private Gender(String description){
        this.description=description;
    }
}
