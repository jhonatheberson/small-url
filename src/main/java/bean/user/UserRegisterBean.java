package bean.user;

import javax.inject.Named;

import java.io.Serializable;

/**
 *Created by Jhonat 2020/02/1
 * MVC - controller
 */
@Named
public class UserRegisterBean implements Serializable {
    private int id;
    private String name = "admin";
    private String password = "123";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


