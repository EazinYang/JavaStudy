public class Day05_8 {
    double radius;

    double getArea(){
        return 3.14 * radius * radius;
    }

    void printInfo(){
        System.out.println("半径："+radius+".面积："+getArea());
    }
}
