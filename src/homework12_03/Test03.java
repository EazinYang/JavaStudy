package homework12_03;

import homework12.C;

public class Test03 {
    public static void main(String[] args){
        Person[] p=new Person[3];
        p[0]=new Chinese();
        p[1]=new American();
        p[2]=new Indian();
        for(int i=0;i<p.length;i++){
            p[i].eat();
        }
    }
}
