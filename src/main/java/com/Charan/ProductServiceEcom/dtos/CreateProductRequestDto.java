package com.Charan.ProductServiceEcom.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductRequestDto {

    private String title;
    private double price;
    private String description;
    private String category;
}
