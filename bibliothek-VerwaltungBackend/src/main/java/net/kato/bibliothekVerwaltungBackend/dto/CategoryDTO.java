package net.kato.bibliothekVerwaltungBackend.dto;

public class CategoryDTO {
    /*
    * private fields
    * */
    private int id;
    private String name;
    private String description;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

