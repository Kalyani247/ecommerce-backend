package com.ecommerce.backend.dto.response;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ProductResponse {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer stockQty;
    private String images;
    private String categoryName;
    private LocalDateTime createdAt;
}
