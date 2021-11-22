package fcu.sep.fcushop.controller;


import fcu.sep.fcushop.model.Product;
import fcu.sep.fcushop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productManager;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productManager.getProducts();
    }

    @GetMapping("/keyword")
    public List<Product> getProducts(@RequestParam String keyword){
        return productManager.getProducts(keyword);
    }

}
