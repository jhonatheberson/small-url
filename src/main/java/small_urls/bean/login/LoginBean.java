package small_urls.bean.login;

import small_urls.model.User;

import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.New;
import javax.inject.Named;
import java.io.Serializable;


@Named
@SessionScoped
public class LoginBean implements Serializable {
    private String name;
    private String password;
    private User user;

    public String log_into() {
        //busca no banco
        if (name.equals("w") && password.equals("1")){
            user = New User
        }

    }
}
