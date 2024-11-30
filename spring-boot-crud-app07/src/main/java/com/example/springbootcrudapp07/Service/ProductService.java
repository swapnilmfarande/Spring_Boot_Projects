package com.example.springbootcrudapp07.Service;

import com.example.springbootcrudapp07.Model.Product;
import com.example.springbootcrudapp07.Repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    ProductRepository productRepository;

    public void addProduct(Product product){
        productRepository.save(product);
    }
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    public void updateProduct(Product product){
        productRepository.save(product);
    }
    public Product getProductById(int productId){
        return productRepository.findById(productId).get();
    }

    public void deleteProductById(int productid){
        productRepository.deleteById(productid);
    }
}
