package com.om.ecom_proj.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;
    private BigDecimal price;
    private String category;
    private String brand;

    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-YYYY") // this is the functionality of jackson
    // which is also responsible for converting objects into JSON and Json into object. And provide other conversion as well.
    // From now it will handle from Frontend UI.
    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;

    private String imageName;
    private String imageType;

    @Lob // as this is large data object, we have to use byte[] array to store image into database, and use annotation @LOB.
    private byte[] imageData;

}
