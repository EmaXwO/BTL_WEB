package com.example.btlweb.dto;

import com.example.btlweb.model.Category;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private String author;
    private int categoryId;
    private double price;
    private double weight;
    private String description;
    private String imageName;
}
