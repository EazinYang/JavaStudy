package Day15;

public class TestTryCatch {
    @SuppressWarnings("all")
    public static void main(String[] args){
        try {
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int shang=a/b;
            System.out.println(a);
            System.out.println(b);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.err.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("其他的代码...");
    }
}
