package cn.lwkang.mybatis.entity;

import cn.lwkang.mybatis.enums.UserSexEnum;

import java.io.Serializable;

public class UserEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String userName;
    private String passWord;
    private UserSexEnum userSex;

    public UserEntity() {
        super();
    }

    public UserEntity(Long id, String userName, String passWord, String nickName) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.nickName = nickName;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public UserSexEnum getUserSex() {
        return userSex;
    }

    public void setUserSex(UserSexEnum userSex) {
        this.userSex = userSex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", userSex=" + userSex +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    private String nickName;
}
