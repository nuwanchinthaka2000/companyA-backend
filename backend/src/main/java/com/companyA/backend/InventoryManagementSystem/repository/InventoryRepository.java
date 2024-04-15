package com.companyA.backend.InventoryManagementSystem.repository;

import com.companyA.backend.InventoryManagementSystem.model.Inventory;
import com.companyA.backend.InventoryManagementSystem.model.StateOfProduct;
import com.companyA.backend.InventoryManagementSystem.model.Stocks;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository <T extends Inventory> extends MongoRepository <T, String> {
    //above line is the generic type of the repository
    Stocks findByName(String name);

    List<Stocks> findByStateOfProduct(StateOfProduct stateOfProduct);

    Stocks findByQuantity(int i);
}