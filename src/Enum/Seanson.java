package Enum;

enum  Seanson {
    //常量后面没有(值)就是调用无参构造
    //常量后面有(值)就是调用有参构造
    SPRING("春暖花开"),SUMMER,FALL,WINTER;//常量对象列表
    private String description;
    private Seanson(){

    }
    private Seanson(String description){
        this.description=description;
    }

}
