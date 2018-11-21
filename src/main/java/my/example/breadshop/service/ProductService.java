package my.example.breadshop.service;

import my.example.breadshop.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;


@Service
public interface ProductService {
    public Page<Product> getProduct(int start);
}
