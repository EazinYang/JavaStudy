package homework19;

import java.util.*;

@SuppressWarnings("all")
public class Homework6 {
    public static void main(String[] args){
//        Random rand=new Random();
//        Collection c=new ArrayList();
//        for(int i=0;i<30;i++){
//            c.add(rand.nextInt(99)+2);
//        }
//        Collection zhishu=new ArrayList();
//        Iterator iterator=c.iterator();
//        System.out.println(Arrays.toString(c.toArray()));
//        while (iterator.hasNext()){
//            Object obj=iterator.next();
//            Boolean flag=true;
//            for(int i=2;i<(int)obj;i++){
//                if((int)obj%i==0){
//                    flag=false;
//                    break;
//                }
//            }
//            if(flag){
//                zhishu.add(obj);
//            }
//        }
//        System.out.println(Arrays.toString(zhishu.toArray()));
        ArrayList ranNum = getRanNum();
        System.out.println("随机数为:");
        System.out.println(ranNum);
        System.out.println("其中的质数为:");
        ArrayList pNum = getPNum(ranNum);
        System.out.println(pNum);
    }
    public static  ArrayList  getPNum(ArrayList  ranNum){
        ArrayList list = new ArrayList();

        for (int i = 0; i < ranNum.size(); i++) {
            Integer integer = (Integer) ranNum.get(i);
            if (isP(integer)){
                list.add(integer);
            }
        }
        return list;
    }

    public static  ArrayList  getRanNum(){
        Random random = new Random();
        ArrayList list = new ArrayList();
        for (int i = 0; i < 30; i++) {
            list.add(random.nextInt(99)+2);
        }
        return list;
    }

    public static boolean isP(int n){
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}
