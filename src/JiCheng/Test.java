package JiCheng;

public class Test {
    public static void main(String[] args){
        PC pc=new PC();
        pc.setCache(10.1);
        pc.output();

        pc.setCpu(20.2);
        pc.setMemory(30.3);
        pc.setDisk(40.4);
        System.out.println(pc.getDetail());

//        NotePad note=new NotePad();
//        note.setVerson(50.5);
//        note.pri();
//
//        note.setCpu(60.6);
//        note.setMemory(70.7);
//        note.setDisk(80.8);
//        System.out.println(note.getDetail());
    }
}
