package zxbv.online.miaosha.domain;

/**
 * @ClassName User
 * @Description TODO
 * @Author zxb
 * @Date 2019/8/17 17:42
 * @Version 1.0
 */
public class User {

    private int id;
    private String username;

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }
}
