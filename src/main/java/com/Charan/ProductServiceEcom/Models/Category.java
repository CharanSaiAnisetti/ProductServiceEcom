package com.Charan.ProductServiceEcom.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Category  extends BaseModel{


    private String name;
    private String description;

}