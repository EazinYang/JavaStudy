package studyAbstrack;

public class MyCalTime extends CalTime{
    @Override
    public void doWork() {
        long sum=0;
        for(int i=1;i<=10000;i++){
            sum+=i;
        }
        System.out.println("sum="+sum);
    }
}
