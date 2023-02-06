package homework13;

public class TestUser {
    public static void main(String[] args){
        User[] u=new User[15];
        for(int i=0;i<u.length;i++){
            u[i]=new User(null,i+1);
        }

        Receptionist[] r=new Receptionist[3];
        r[0]=new Receptionist(new V1Filter());
        r[1]=new Receptionist(new V2Filter());
        r[2]=new Receptionist(new AFilter());
        for(int i=0;i<u.length;i++){
            if(u[i].getId()>=1&&u[i].getId()<=5){
                r[0].receptUser(u[i]);
            }else if(u[i].getId()>=6&&u[i].getId()<=10){
                r[1].receptUser(u[i]);
            }else {
                r[2].receptUser(u[i]);
            }
        }
        for(int i=0;i<u.length;i++){
            System.out.println(u[i]);
        }
    }
}
