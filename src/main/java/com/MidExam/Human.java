package com.MidExam;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

@ManagedBean
@RequestScoped
public class Human implements Serializable {
    String sex;
    private String name;
    private String phone;
    private String email;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String callMe() {
        System.out.println("Your Gender is " + sex);

        return "call";
    }

    public String emailMe() {
        System.out.println("Your Gender is " + sex);
        return "email";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
