package com.companyA.backend.ManufacturingSystem.service;

import com.companyA.backend.ManufacturingSystem.model.ProductionData;
import com.companyA.backend.ManufacturingSystem.repository.ProductionDataRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Service class to interact with ProductionData entities
@Service

public class ProductionDataService {
    @Autowired
    private ProductionDataRepository productionDataRepository;

    // Method to retrieve all production data
    public List<ProductionData> getAllProductionData() {
        // Retrieve all production data from the repository
        return productionDataRepository.findAll();
    }
}