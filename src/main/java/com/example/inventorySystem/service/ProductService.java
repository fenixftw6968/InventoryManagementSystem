package com.example.inventorySystem.service;

import com.example.inventorySystem.entity.Product;
import com.example.inventorySystem.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository) {
        this.productRepository=productRepository;
    }
    public Product createProduct(Product product){
        return productRepository.save(product);
    }
    public Product updateProduct(Long id,Product product){
        Product existingProduct=productRepository.findById(id).orElseThrow(()->new RuntimeException("product not found"));
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        return productRepository.save(existingProduct);
    }
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }
    public Optional<Product> getProductById(Long id){
        return productRepository.findById(id);
    }
    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
}
