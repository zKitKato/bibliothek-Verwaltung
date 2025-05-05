package net.kato.bibliothekVerwaltungBackend.dto;

public class UserDTO {
    /*
    * Private Fields
    * */

    private int id;
    private String username;
    private String password;
    private boolean active = true;

    /*
    * Getter and Setter
    * */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
