public class Day05_9_2 {
    private double radius;//权限为本类中访问
    //radius属性的set方法,用于在其他类中修改radius的值
    public void setRadius(double r){
        if(r>0){//使得设计类的人赋值可控
            radius=r;}
    }
    //radius属性的get方法，用于在其他类中获取radius的值
    public  double getRadius(){
        return radius;
    }
}
