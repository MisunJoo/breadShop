package my.example.breadshop.repository;
import my.example.breadshop.domain.Product;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
public class ProductRepositoryTest {
    @Autowired
    ProductRepository productRepository;

    @Test
    public void findBy를_이용한_product_name으로_찾기_테스트() throws Exception{
        List<Product> products = productRepository.findByName("엄청맛있는호밀빵");
        System.out.println("엄청맛있는호밀빵의 개수는" + products.size());
        for(Product product : products){
            System.out.println(product.getName());
        }
    }

    @Test
    public void findBy를_이용한_category_id로_찾기_테스트_페이징처리() throws Exception{
        Pageable pageable = PageRequest.of(0, 2);
        Page<Product> products = productRepository.findByCategoryId(1L, pageable);

        System.out.println("총 개수" + products.getTotalElements());
        System.out.println("총 페이지" + products.getTotalPages());

//        System.out.println("categoryId가 1L인 것의 개수는" + products.size());
        for(Product product : products){
            System.out.println(product.getName());
        }
    }

    @Test
    public void LIKE검색_이름으로_찾기_테스트_페이징처리() throws Exception{
        Pageable pageable = PageRequest.of(0,2);
        Page<Product> products = productRepository.findByNameContaining("밀", pageable);

        System.out.println("총 개수" + products.getTotalElements());
        System.out.println("총 페이지" + products.getTotalPages());

        for(Product product : products){
            System.out.println(product.getName());
        }
    }

    @Test
    public void 상품을_수정된_날짜의_내림차순으로_조회() throws Exception{
        Pageable pageable = PageRequest.of(0, 4);
        Page<Product> products = productRepository.findAllByOrderByUpdateDateDesc(pageable);

        System.out.println("총 개수" + products.getTotalElements());
        System.out.println("총 페이지" + products.getTotalPages());

        for(Product product : products){
            System.out.println(product.getName());
        }
    }

}
