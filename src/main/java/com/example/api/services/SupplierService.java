package com.example.api.services;

import com.example.api.models.entities.Supplier;
import com.example.api.models.repos.SupplierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class SupplierService {

    @Autowired
    private SupplierRepo supplierRepo;

    public Supplier save(Supplier supplier){
        return supplierRepo.save(supplier);
    }

    public Supplier findOne(Long id){
        Optional<Supplier> supplier = supplierRepo.findById(id);
        if(!supplier.isPresent()){
            return null;
        }
        return supplier.get();
    }

    public Iterable<Supplier> findAll(){
        return supplierRepo.findAll();
    }

    public void removeOne(Long id){
        supplierRepo.deleteById(id);
    }
}
