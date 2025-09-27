package com.zahra.product_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "product")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Product {
    @Id
    private String id;
    private String name;
    private BigDecimal price;
    private String description;
}
