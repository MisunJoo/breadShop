package my.example.breadshop.service;

import my.example.breadshop.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;


@Service
public interface ProductService {
    //모든 상품 검색
    public Page<Product> getProduct(int start);
    //특정 단어가 들어간 상품 검색
    public Page<Product> getProduct(int start, String keyword);
}
