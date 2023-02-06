package Day17;

public class Sportman extends Thread {
    private int distance;
    private long millsPerMeter;//每米的时间
    private long restPerTenMeter;//每10米休息的时间
    private long totalTime;
    private volatile boolean finish;//从储存区取值，不从缓存取值
    private boolean stop;

    public Sportman(String name,int distance,long millsPerMeter,long restPerTenMeter) {
        super(name);
        this.distance = distance;
        this.millsPerMeter = millsPerMeter;
        this.restPerTenMeter = restPerTenMeter;
    }

    public void run(){
        long start=System.currentTimeMillis();
        int i;
        for(i=1;i<=distance&&!stop;i++) {
            try {
                Thread.sleep(millsPerMeter);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + i + "米");
            if (i<distance && i%10==0) {
                System.out.println(getName()+"在休息...");
                try {
                    Thread.sleep(restPerTenMeter);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        long end=System.currentTimeMillis();
        totalTime=end-start;
        if(i>=distance){
            finish=true;
        }
    }

    public long getTotalTime() {
        return totalTime;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
}
