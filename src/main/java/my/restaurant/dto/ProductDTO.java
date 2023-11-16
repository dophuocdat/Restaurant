package my.restaurant.dto;


import java.util.UUID;

public record ProductDTO(Long productId, String name, String imgUrl, String description, PriceDTO price,
                         CategoryDTO category) {
    public ProductDTO(Long productId, PriceDTO price) {
        this(productId, null, "/img/product/product1.jpg", null, price, null);
    }

    public ProductDTO(Long productId, String imgUrl, String name, String description) {
        this(productId, name, "/img/product/product1.jpg", description, null, null);
    }
}
