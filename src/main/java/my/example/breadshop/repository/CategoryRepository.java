package my.example.breadshop.repository;

import my.example.breadshop.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
   // @Query(value = "SELECT c FROM Category c JOIN FETCH c.ordering WHERE c.name LIKE CONCAT('%', :name, '%')")
    List<Category> findByNameContaining(@Param("name") String name);

    List<Category> findAll();

}
