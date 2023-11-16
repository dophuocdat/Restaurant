package my.restaurant.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "order_items")
@Getter
@Setter
public class OrderItem extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long orderItemId;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price")
    private float price;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;
}

