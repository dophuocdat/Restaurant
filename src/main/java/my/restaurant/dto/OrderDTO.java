package my.restaurant.dto;

import my.restaurant.modal.OrderStatus;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record OrderDTO(Long orderId, List<OrderItemDTO> items, PriceDTO totalPrice, PriceDTO subtotal, PriceDTO tax, LocalDateTime orderDate, OrderStatus status,
                       AddressDTO billingAddress, PaymentDTO payment) {
    public OrderDTO(Long orderId) {
        this(orderId, null, null, null, null, null, null, null, null);
    }
}
