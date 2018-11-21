package my.example.breadshop.service;

import my.example.breadshop.domain.Product;
import my.example.breadshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    //기본 조회
    @Transactional(readOnly = true)
    @Override
    public Page<Product> getProduct(int start) {
        Pageable pageable = PageRequest.of(start, 4);
        Page<Product> products =  productRepository.findAllByOrderByUpdateDateDesc(pageable);
        return products;
    }
}
