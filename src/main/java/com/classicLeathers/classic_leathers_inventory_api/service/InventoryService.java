package com.classicLeathers.classic_leathers_inventory_api.service;

import com.classicLeathers.classic_leathers_inventory_api.model.MyntraSku;
import com.classicLeathers.classic_leathers_inventory_api.model.Sku;
import com.classicLeathers.classic_leathers_inventory_api.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class InventoryService {
    @Autowired
    InventoryRepository inventoryRepository;

    public Integer addSku(List<MyntraSku> skus) {
        skus.removeAll(inventoryRepository.findAll());
        return inventoryRepository.saveAll(skus).size();
    }
}
