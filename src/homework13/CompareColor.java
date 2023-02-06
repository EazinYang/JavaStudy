package homework13;

public class CompareColor implements CompareAble {
    public void compare(Apple a,Apple b){
        if(a.getColour().equals("红色")){
            System.out.println(a);
        }
        if(b.getColour().equals("红色")){
            System.out.println(b);
        }
    }
}
