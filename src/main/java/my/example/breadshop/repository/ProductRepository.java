package my.example.breadshop.repository;

import my.example.breadshop.domain.Product;
import org.springframework.data.repository.CrudRepository;
import sun.jvm.hotspot.debugger.Page;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findByCategoryId(Long categoryId);
    List<Product> findByName(String name);

    // Spring Data JPA method query
    Page<Product> findByNameContaining
}
