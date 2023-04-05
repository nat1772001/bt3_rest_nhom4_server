package com.example.bt3.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    @Id @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Float price;
    private String description;
    private String unity;
}
