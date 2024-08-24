package com.recipes.model;

import javax.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String ingredients;

    @OneToMany(mappedBy = "recipe")
    private List<Comment> comments;
}
