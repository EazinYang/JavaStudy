package DuoTai;

public class Test {
    public static void main(String[] args){
        Computer[] c=new Computer[4];
        c[0]=new PC(1,2,3,100,4);
        c[1]=new NotePad(5,6,7,99,8);
        c[2]=new NotePad(14,15,16,101,17);
        c[3]=new NotePad(21,22,23,64,24);

        for(int i=0;i<c.length;i++){
            System.out.println(c[i].getDetail());
        }

        for(int i=0;i<c.length-1;i++){
            for(int j=i+1;j<c.length;j++){
                if(c[i].price>c[j].price){
                    Computer x=c[i];
                    c[i]=c[j];
                    c[j]=x;
                }
            }
        }

        for(int i=0;i<c.length;i++){
            System.out.println(c[i].getDetail());
        }

        listPrice(new Computer(1,2,3,100));
        listPrice(new PC(5,6,7,200,8));
        listPrice(new NotePad(11,12,13,300,14));
    }

    public static void listPrice(Computer price){
        System.out.println(price.price);
    }
}
