package net.kato.bibliothekVerwaltungBackend.dto;

import jakarta.persistence.*;

@Entity
public class Category {
    /*
    * private fields
    * */
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;

    private String name;

    private String description;


    @Column(name = "is_active")
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


    @Override
    public String toString() {
        return "CategoryDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", active=" + active +
                '}';
    }
}

