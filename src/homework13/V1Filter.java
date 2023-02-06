package homework13;

public class V1Filter implements Filter {
    @Override
    public void filterUser(User u) {
        u.setType("v1");
    }
}
