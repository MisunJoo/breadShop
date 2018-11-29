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
    private ProductRepository productRepository;
    //생성자 주입
    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    //기본 조회 : 전체 상품 조회
    @Transactional(readOnly = true)
    @Override
    public Page<Product> getProduct(int start) {
        Pageable pageable = PageRequest.of(start, 4);
        Page<Product> products =  productRepository.findAllByOrderByUpdateDateDesc(pageable);
        return products;
    }

    //특정 단어가 들어간 상품 조회
    @Override
    public Page<Product> getProduct(int start, String keyword) {
        Pageable pageable = PageRequest.of(start, 4);
        Page<Product> products = productRepository.findByNameContaining(keyword, pageable);
        return products;
    }
}
