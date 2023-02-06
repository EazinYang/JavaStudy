package Day14_1;

@Table(value="t_user")
public class User {
    @Column(name="no",type ="int")
    int id;
    @Column(name="username",type ="varchar(20)")
    String username;
    @Column(name="pwd",type ="char(6)")
    String password;
    @Column(name="email",type ="varchar(50)")
    String email;
}
