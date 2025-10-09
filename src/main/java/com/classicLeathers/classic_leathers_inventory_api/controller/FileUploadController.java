package com.classicLeathers.classic_leathers_inventory_api.controller;

import com.classicLeathers.classic_leathers_inventory_api.model.MyntraOrderFlowEntry;
import com.classicLeathers.classic_leathers_inventory_api.model.Sku;
import com.classicLeathers.classic_leathers_inventory_api.service.InventoryService;
import com.classicLeathers.classic_leathers_inventory_api.service.MyntraService;
import com.classicLeathers.classic_leathers_inventory_api.service.UnicommerceShipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/upload")
@CrossOrigin(origins = "*")
public class FileUploadController {
    private static final String SKU_FILE = "sku.csv";
    private static final String MYNTRA_ORDER_FLOW_FILE = "ORDER_FLOW_REPORT";
    private static final String MYNTRA_FORWARD_SETTLEMENT_FILE = "MYNTRA_FORWARD";
    private static final String MYNTRA_RETURN_SETTLEMENT_FILE = "MYNTRA_RETURN";
    private static final String UNICOMMERCE_SHIPMENTS_FILE = "unicommerce_shipments";
    private static final String MYNTRA_ADV_SPENT_FILE = "MYNTRA_ADV_SPENT";
    @Autowired
    private InventoryService skuService;
    @Autowired
    private MyntraService myntraService;
    @Autowired
    private UnicommerceShipmentService unicommerceShipmentService;

    @PostMapping
    public void upload(@RequestPart MultipartFile file) throws Exception {
        System.out.println("Success..!");
        if (file.getOriginalFilename().equalsIgnoreCase(SKU_FILE))
            addSku(file);
        if (file.getOriginalFilename().contains(MYNTRA_ORDER_FLOW_FILE))
            processMyntraOrderFlowReport(file);
        if (file.getOriginalFilename().contains(MYNTRA_FORWARD_SETTLEMENT_FILE))
            processMyntraForwardSettlementReport(file);
        if (file.getOriginalFilename().contains(MYNTRA_RETURN_SETTLEMENT_FILE))
            processMyntraReturnSettlementReport(file);
        if (file.getOriginalFilename().contains(UNICOMMERCE_SHIPMENTS_FILE))
            processUnicommerceShipmentReport(file);
        if (file.getOriginalFilename().contains(MYNTRA_ADV_SPENT_FILE))
            processMyntraAdvSpentReport(file);
    }

    public String addSku(@RequestPart MultipartFile file) throws Exception {
        try {
            String fileData = new String(file.getBytes(), StandardCharsets.UTF_8);
            List<String> dataRows = new ArrayList<>();
            dataRows.addAll(Arrays.asList(fileData.split("\n")));
            dataRows.remove(0);
            List<Sku> skus = new ArrayList<>();
            for (int i = 0; i < dataRows.size(); i++) {
                String[] data = dataRows.get(i).split(",");
                Sku sku = new Sku();
                sku.setBrand(data[0]);
                sku.setCategory(data[1].replace("|", "_").split("_")[0]);
                sku.setSubCategory(data[1].replace("|", "_").split("_")[1]);
                sku.setSkuLabel(data[2]);
                sku.setDescription(data[3]);
                sku.setOnlineSku(Boolean.parseBoolean(data[4]));
                sku.setPurchaseCost(Integer.parseInt(data[5]));
                sku.setMrp(Integer.parseInt(data[6]));
                sku.setCreatedOn(LocalDateTime.now());
                sku.setUpdatedOn(LocalDateTime.now());
                skus.add(sku);
            }
            Integer uploadedSku = skuService.addSku(skus);
            return "File upload successfully for " + uploadedSku + " Sku's";
        } catch (Exception e) {
            e.printStackTrace();
            return "File upload failed: " + e.getMessage();
        }
    }

    public String processMyntraOrderFlowReport(@RequestPart MultipartFile file) throws Exception {
        return myntraService.processMyntraOrderFlowReport(file);
    }

    public String processMyntraForwardSettlementReport(@RequestPart MultipartFile file) throws Exception {
        return myntraService.processMyntraForwardSettlementReport(file);
    }
    public String processMyntraReturnSettlementReport(@RequestPart MultipartFile file) throws Exception {
        return myntraService.processMyntraReturnSettlementReport(file);
    }
    public String processUnicommerceShipmentReport(@RequestPart MultipartFile file) throws Exception {
        return unicommerceShipmentService.processUnicommerceShipmentReport(file);
    }
    public String processMyntraAdvSpentReport(@RequestPart MultipartFile file) throws Exception {
        return myntraService.processMyntraAdvSpentReport(file);
    }
}
