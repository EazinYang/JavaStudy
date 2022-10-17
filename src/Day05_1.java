public class Day05_1 {
    public static void main(String args[]){
        Day05_2 yuan=new Day05_2();
        yuan.radius=1.0;
        doubleRadius(yuan);
        System.out.println("半径："+yuan.radius);
    }

    public static void doubleRadius(Day05_2 c) {
        c = new Day05_2();
        c.radius *= 2;
    }
}
