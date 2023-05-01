package simple.automation;

public class User {
    private String password;
    private String login;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public User(String password, String login) {
        this.password = password;
        this.login = login;
    }

    public User(String login) {
        this.login = login;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof User)) return false;
        return ((User) obj).getLogin().equals(this.getLogin());
    }
}