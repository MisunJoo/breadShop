package my.example.breadshop.repository;

import my.example.breadshop.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findByCategoryId(Long categoryId, Pageable pageable);
    List<Product> findByName(String name);

    // Spring Data JPA method query
    @Query(value = "SELECT p FROM Product p WHERE p.name LIKE CONCAT('%', :name, '%')")
    Page<Product> findByNameContaining(@Param("name")String name, Pageable pageable);
}
