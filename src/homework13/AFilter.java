package homework13;

public class AFilter implements Filter {
    @Override
    public void filterUser(User u) {
        u.setType("A");
    }
}
