package com.wyy.entity;

public class User {
    private Integer uid;
    private String username;
    private String password;
    private String usex;
    private String email;

    public User() {
    }

    public User(Integer uid, String username, String password, String usex, String email) {
        this.uid = uid;
        this.username = username;
        this.password = password;
        this.usex = usex;
        this.email = email;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", usex='" + usex + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
