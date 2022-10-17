public class Day09_4_04 extends Day09_4_03{
    private int score;

    public Day09_4_04(String name,int age,int score){
        super(name,age);
        this.score=score;
    }

    public Day09_4_04(){
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        this.score=score;
    }

    public String getInfo(){
        return super.getInfo()+"，成绩："+score;
    }
}
