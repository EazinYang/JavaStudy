package homework21;

public class  Students implements Comparable<Students> {
    private String name;
    private int age;
    private double score;

    public Students(String name, int age, double score) {
        super();
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age + ", score=" + score + '}';
    }

    @Override
    public int compareTo(Students students) {
        if(this.getScore()<students.getScore()){
            return 1;
        }else if(this.getScore()>students.getScore()){
            return -1;
        }
        return this.getAge()-students.getAge();
    }
}
