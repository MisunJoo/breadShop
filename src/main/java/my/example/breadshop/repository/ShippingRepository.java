package my.example.breadshop.repository;

import my.example.breadshop.domain.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingRepository extends JpaRepository<Shipping, Long> {

}
