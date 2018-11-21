package my.example.breadshop.controller;

import my.example.breadshop.domain.Product;
import my.example.breadshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }


    @GetMapping("/product/list")
    public String getList(@RequestParam(value = "start", defaultValue = "0") int start,
                          Model model){
        Page<Product> products = productService.getProduct(start);
        List<Product> productList = products.getContent();
        int pageCount = products.getTotalPages();

        model.addAttribute("productList", productList);
        model.addAttribute("pageCount", pageCount);

        return "list";
    }

}
