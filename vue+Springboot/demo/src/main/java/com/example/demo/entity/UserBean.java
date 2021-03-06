package com.example.demo.entity;

import com.sun.javafx.beans.IDProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.sql.Timestamp;

@ApiModel(value = "用户")
public class UserBean implements Serializable {
    @ApiModelProperty(name = "ID",value = "用户ID",required = false)
    private long ID;
    @ApiModelProperty(name = "userName",value = "用户名",required = true)
    private String userName;
    @ApiModelProperty(name = "password",value = "用户密码",required = false)
    private String password;
    @ApiModelProperty(name = "submission_date",value = "用户注册日期",required = false)
    private Timestamp submission_date;
    @ApiModelProperty(name = "email",value = "用户邮箱",required = false)
    private String email;


    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getSubmission_date() {
        return submission_date;
    }

    public void setSubmission_date(Timestamp submission_date) {
        this.submission_date = submission_date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "ID=" + ID +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", submission_date=" + submission_date +
                ", email='" + email + '\'' +
                '}';
    }
}
