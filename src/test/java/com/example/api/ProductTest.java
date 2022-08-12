package com.example.api;

import com.example.api.models.entities.Product;
import com.example.api.models.repos.ProductRepo;
import com.example.api.services.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@Slf4j
@SpringBootTest(classes = {ProductTest.class})
public class ProductTest {
    Logger logger = new LoggerFactory().logger(this.getClass());

    @Mock
    ProductRepo productRepo;

    @InjectMocks
    ProductService productService;

    public List<Product> product;

    @Test
    @Order(1)
    public void testGetProduct(){
        List<Product> products = new ArrayList<Product>();

        products.add(new Product(8L, "produk 8", "deskripsi produk 8", 700));
        products.add(new Product(9L, "produk 9", "deskripsi produk 9", 900));
        when(productRepo.findAll()).thenReturn(products);
        assertEquals(2, products.size());
        logger.info("Success");
    }
    private ConfigurableApplicationContext applicationContext;
}
