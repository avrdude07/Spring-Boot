package com.example.api.models.repos;

import com.example.api.models.entities.Product;
import com.example.api.models.entities.Supplier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.websocket.server.PathParam;
import java.util.List;

public interface ProductRepo extends CrudRepository<Product, Long>{

    @Query("SELECT p FROM Product p WHERE p.name = :name")
    public Product findProductByName(@PathParam("name") String name);

    @Query("SELECT p FROM Product p WHERE p.name LiKE :name")
    public List<Product> findProductByNameLike(@PathParam("name") String name);

    @Query("SELECT p FROM Product p WHERE p.category.id = :categoryId")
    public List<Product> findProductByCategory(@PathParam("categoryId") Long categoryId);

    @Query("SELECT p FROM Product p WHERE :supplier MEMBER OF p.suppliers")
    public List<Product> findProductBySupplier(Supplier supplier);
}
