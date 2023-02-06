package Enum;

public enum MyEnum implements MyInter{
    A{
        @Override
        public void test() {
            System.out.println("aaa");
        }
    },B{
        @Override
        public void test() {
            System.out.println("bbb");
        }
    };

//    @Override
//    public void test() {
//        System.out.println("test");
//    }
}
