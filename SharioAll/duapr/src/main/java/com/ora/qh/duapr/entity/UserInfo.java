package com.ora.qh.duapr.entity;

import java.util.Date;

public class UserInfo {
    private Long userId;

    private String username;

    private String passwd;

    private String billId;

    private String email;

    private Short age;

    private Date birthday;

    private String ownIndex;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId == null ? null : billId.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getOwnIndex() {
        return ownIndex;
    }

    public void setOwnIndex(String ownIndex) {
        this.ownIndex = ownIndex == null ? null : ownIndex.trim();
    }
}