package my.example.breadshop.repository;

import my.example.breadshop.domain.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
public class CategoryRepositoryTest {
    @Autowired
    CategoryRepository categoryRepository;

    @Test
    public void 모든카테고리검색() throws Exception {
        List<Category> categories = categoryRepository.findAll();
        for(Category category : categories){
            System.out.println(category.getOrdering() +","+ category.getParentId() +","+ category.getId()
                    +","+ category.getProducts());
        }
    }
}
