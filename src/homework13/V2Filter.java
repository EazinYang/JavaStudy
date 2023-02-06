package homework13;

public class V2Filter implements Filter {
    @Override
    public void filterUser(User u) {
        u.setType("v2");
    }
}
