package net.kato.bibliothekVerwaltungBackend.dto;

public class BookDTO {
    /*
    * Private Fields
     */

    private int id;
    private String title;
    private String description;
    private String isbn;
    private int categoryId;
    private int authorId;
    private int total_copies;
    private int avaliable_copies;
    private boolean active = true;


    /*
    * Getter and Setter
    * */

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAuthorId(int i) {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getTotal_copies() {
        return total_copies;
    }

    public void setTotal_copies(int total_copies) {
        this.total_copies = total_copies;
    }

    public int getAvaliable_copies() {
        return avaliable_copies;
    }

    public void setAvaliable_copies(int avaliable_copies) {
        this.avaliable_copies = avaliable_copies;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
