package com.anass.microarchi.inventoryservice;

import com.anass.microarchi.inventoryservice.entities.Product;
import com.anass.microarchi.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return args -> {
          productRepository.save(new Product(null, "bob", 12));
          productRepository.findAll().forEach(System.out::println);
        };
    }
}
