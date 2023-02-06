package homework13;

public class Player {
    public static  FightAble select(String str){
        java.util.Scanner input=new java.util.Scanner(System.in);
        if(str.equals("法力角色")){
            return new Mage();
        }else if(str.equals("武力角色")){
            return new Warrio();
        }
        return null;
    }
}
