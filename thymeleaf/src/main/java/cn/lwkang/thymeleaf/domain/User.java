package cn.lwkang.thymeleaf.domain;

public class User {
    private String userName;
    private String age;
    private String pass;

    public User() {
    }

    public User(String userName, String age, String pass) {
        this.userName = userName;
        this.age = age;
        this.pass = pass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age='" + age + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
