package cn.tedu.pojo;

/**
 * @Auther: panda
 * @Date: 2019/5/14
 * @Descripton: cn.tedu
 * @version: 1.0
 */
public class Users {
    private Integer userId;
    private String username;
    private Integer userAge;

    public Users() {
    }

    public Users(Integer userId, String username, Integer userAge) {
        this.userId = userId;
        this.username = username;
        this.userAge = userAge;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", userAge=" + userAge +
                '}';
    }
}
