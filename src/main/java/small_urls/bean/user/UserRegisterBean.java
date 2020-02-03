package small_urls.bean.user;

import small_urls.model.User;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import java.io.Serializable;

/**
 *Created by Jhonat 2020/02/1
 * MVC - controller
 */
@Named
@ViewScoped
public class UserRegisterBean implements Serializable {
    private User user = new User();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}


