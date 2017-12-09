package com.aimin.vo;

/**
 * Created by aimin on 17/3/10.
 */
public class User {
    private  Integer userId;
    private  String userName;
    private  Short userAge;
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Short getUserAge() {
        return userAge;
    }

    public void setUserAge(Short userAge) {
        this.userAge = userAge;
    }
}
