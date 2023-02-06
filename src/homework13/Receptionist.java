package homework13;

public class Receptionist {
    private Filter filter;

    public Receptionist(Filter filter){
        this.filter=filter;
    }

    public void receptUser(User u){
        filter.filterUser(u);
    }
}
