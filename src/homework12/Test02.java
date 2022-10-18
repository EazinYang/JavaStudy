package homework12;

public class Test02 {
    public static void main(String[] args){
        Person[] p=new Person[2];
        p[0]=new Woman();
        p[1]=new Man();
        for(int i=0;i<p.length;i++){
            p[i].pee();
        }

    }
}
