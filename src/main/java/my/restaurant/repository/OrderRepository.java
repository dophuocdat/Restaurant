package my.restaurant.repository;

import my.restaurant.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    Page<Order> getOrderByUserUsername(String userName, @PageableDefault Pageable pageable);
    Order getOrderByOrderIdAndUserUsername(Long orderId, String username);
    Optional<Order> getOrderByOrderIdAndBillingAddressEmailId(Long orderId, String email);
}
