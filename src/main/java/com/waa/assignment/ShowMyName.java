package com.waa.assignment;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;

@ManagedBean
@RequestScoped
public class ShowMyName implements Serializable {
    String username;
    String password;

    public String display() {
        if (username == "" && password == "")
            return "successPage";
        return "failurePage";
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


}


