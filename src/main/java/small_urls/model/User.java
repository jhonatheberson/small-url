package small_urls.model;

import small_urls.model.enums.Urls;

public class User {
    private int id;
    private String name = "admin";
    private String password = "123";
    private Urls url = Urls.url;
    private Urls small_url = Urls.small_url;

    public Urls getUrl() {
        return url;
    }

    public void setUrl(Urls url) {
        this.url = url;
    }

    public Urls getSmall_url() {
        return small_url;
    }

    public void setSmall_url(Urls small_url) {
        this.small_url = small_url;
    }

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
