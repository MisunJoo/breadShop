package my.example.breadshop.repository;

import my.example.breadshop.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByName(String name);

    //빵의 카테고리별로 상품 조회 (호밀빵, 통밀빵, 밀빵)
    Page<Product> findByCategoryId(Long categoryId, Pageable pageable);

    //상품명 순으로 상품 조회 (가나다, abc)


    //특정 단어가 들어간 상품 조회
    @Query(value = "SELECT p FROM Product p WHERE p.name LIKE CONCAT('%', :name, '%')")
    Page<Product> findByNameContaining(@Param("name")String name, Pageable pageable);

    //상품을 수정된 날짜의 내림차순으로 조회 : 나중에 등록한 것 부터 보여주기
    Page<Product> findAllByOrderByUpdateDateDesc(Pageable pageable);

}
