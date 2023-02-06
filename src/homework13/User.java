package homework13;

public class User {
    private String type;
    private int id;

    public User(String type,int id){
        this.type=type;
        this.id=id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" + "type='" + type + '\'' + ", id=" + id + '}';
    }
}
