package my.example.breadshop.repository;

import my.example.breadshop.domain.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
public class ProductRepositoryTest {
    @Autowired
    ProductRepository productRepository;

    @PersistenceContext
    EntityManager em;

    @Test
    public void findBy를_이용한_product_name으로_찾기_테스트() throws Exception{
        List<Product> products = productRepository.findByName("엄청맛있는호밀빵");
        System.out.println("엄청맛있는호밀빵의 개수는" + products.size());
        for(Product product : products){
            System.out.println(product.getName());
        }
    }

    @Test
    public void findBy를_이용한_category_id로_찾기_테스트() throws Exception{
        List<Product> products = productRepository.findByCategoryId(1L);
        System.out.println("categoryId가 1L인 것의 개수는" + products.size());
        for(Product product : products){
            System.out.println(product.getName());
        }
    }

}
