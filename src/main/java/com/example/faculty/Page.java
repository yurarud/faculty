package com.example.faculty;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "pages")
public class Page {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String title;
    private String img;

    @Transient
    private List<DescriptionItem> descriptionItems;

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<DescriptionItem> getDescriptionItems() {
        return descriptionItems;
    }

    public void setDescriptionItems(List<DescriptionItem> descriptionItems) {
        this.descriptionItems = descriptionItems;
    }
}

