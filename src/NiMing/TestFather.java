package NiMing;

public class TestFather {
    public static void main(String[] args){
        new Father(){

            @Override
            public void method() {
                System.out.println("hello 孩子");
            }
        }.method();
    }
}
