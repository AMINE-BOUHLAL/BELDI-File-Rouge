package com.example.BELDI.File.Rouge.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProduitDTO {
    private Long id;
    private String name;
    private String description;
    private String image;
    private double prix;
    private int quantity;
    private String ingredients;
    private String statu;
}
