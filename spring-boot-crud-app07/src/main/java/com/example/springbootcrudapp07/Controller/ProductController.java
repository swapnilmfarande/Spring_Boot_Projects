package com.example.springbootcrudapp07.Controller;

import com.example.springbootcrudapp07.Model.Product;
import com.example.springbootcrudapp07.Service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/products")
public class ProductController {
    ProductService productService;

    @PostMapping
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }
    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    @PutMapping
    public void updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") int productId){
        return productService.getProductById(productId);
    }

    @DeleteMapping("/{id}")
    public void deleteProductById(@PathVariable("id") int productid){
        productService.deleteProductById(productid);
    }

}
