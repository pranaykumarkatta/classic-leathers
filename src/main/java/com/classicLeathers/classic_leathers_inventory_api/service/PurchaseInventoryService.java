package com.classicLeathers.classic_leathers_inventory_api.service;

import com.classicLeathers.classic_leathers_inventory_api.model.Sku;
import com.classicLeathers.classic_leathers_inventory_api.repository.PurchaseInventoryRepository;
import com.classicLeathers.classic_leathers_inventory_api.util.BatchSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PurchaseInventoryService {
    @Autowired
    PurchaseInventoryRepository purchaseInventoryRepository;
    @Autowired
    BatchSaveService batchSaveService;

    public Integer addSku(List<Sku> skus) {
        skus.removeAll(purchaseInventoryRepository.findAll());
        int count=skus.size();
         batchSaveService.saveInBatch(skus);
         return count;
    }
}
