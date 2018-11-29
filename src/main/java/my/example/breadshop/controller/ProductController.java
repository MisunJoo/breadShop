package my.example.breadshop.controller;

import my.example.breadshop.domain.Product;
import my.example.breadshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class ProductController {
    ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }


    @GetMapping("/products/list")
    public String getList(@RequestParam(value = "start", defaultValue = "0") int start,
                          @RequestParam(value= "keyword", defaultValue = "") String keyword,
                          Model model){
        Page<Product> products;

        if (keyword.length() == 0) {
            products = productService.getProduct(start);
        }else {
            products = productService.getProduct(start, keyword);
            model.addAttribute("keyword", keyword);
        }

        List<Product> productList = products.getContent();
        int pageCount = products.getTotalPages();

        model.addAttribute("productList", productList);
        model.addAttribute("pageCount", pageCount);

        return "list";
    }

    @PostMapping("/products/list")
    public String getSearchList(@RequestParam(value = "start", defaultValue = "0") int start,
                          @RequestParam(value= "keyword", defaultValue = "") String keyword,
                          Model model){

    }


}
