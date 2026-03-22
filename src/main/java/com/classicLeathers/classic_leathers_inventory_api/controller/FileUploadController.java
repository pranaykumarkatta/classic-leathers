package com.classicLeathers.classic_leathers_inventory_api.controller;

import com.classicLeathers.classic_leathers_inventory_api.model.MyntraOrderFlowEntry;
import com.classicLeathers.classic_leathers_inventory_api.model.MyntraSku;
import com.classicLeathers.classic_leathers_inventory_api.model.Sku;
import com.classicLeathers.classic_leathers_inventory_api.service.*;
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
    private static final String SKU_FILE = "MYNTRA_SKUS.csv";
    private static final String CLASSIC_SKU_FILE = "CLASSIC_SKUS.csv";
    private static final String MYNTRA_ORDER_FLOW_FILE = "ORDER_FLOW_REPORT";
    private static final String MYNTRA_FORWARD_SETTLEMENT_FILE = "MYNTRA_FORWARD";
    private static final String MYNTRA_RETURN_SETTLEMENT_FILE = "MYNTRA_RETURN";
    private static final String UNICOMMERCE_SHIPMENTS_FILE = "unicommerce_shipments";
    private static final String MYNTRA_ADV_SPENT_FILE = "MYNTRA_ADV_SPENT";
    private static final String RETAIL_SALES_FILE = "SALES_REPORT";
    private static final String REBATE_FILE = "REBATE_";
    @Autowired
    private InventoryService skuService;
    @Autowired
    private PurchaseInventoryService purchaseInventoryService;
    @Autowired
    private MyntraService myntraService;
    @Autowired
    private RetailService retailService;
    @Autowired
    private UnicommerceShipmentService unicommerceShipmentService;

    @PostMapping
    public void upload(@RequestPart MultipartFile file) throws Exception {
        if (file.getOriginalFilename().equalsIgnoreCase(SKU_FILE))
            addMyntraSku(file);
        if (file.getOriginalFilename().equalsIgnoreCase(CLASSIC_SKU_FILE))
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
        if (file.getOriginalFilename().contains(REBATE_FILE))
            processMyntraRebateReport(file);
    }

    public String addMyntraSku(@RequestPart MultipartFile file) throws Exception {
        try {
            String fileData = new String(file.getBytes(), StandardCharsets.UTF_8);
            List<String> dataRows = new ArrayList<>();
            dataRows.addAll(Arrays.asList(fileData.split("\n")));
            dataRows.remove(0);
            List<MyntraSku> skus = new ArrayList<>();
            for (int i = 0; i < dataRows.size(); i++) {
                String[] data = dataRows.get(i).split(",");
                MyntraSku sku = new MyntraSku();
                sku.setArticleType(data[0]);
                sku.setBrand(data[1]);
                sku.setStyleId(data[4]);
                sku.setStyleName(data[5]);
                sku.setSize(data[6]);
                sku.setSellerSkuCode(data[7]);
                sku.setSkuId(data[8]);
                sku.setSkuCode(data[9]);
                sku.setVan(data[10]);
                skus.add(sku);
            }
            Integer uploadedSku = skuService.addSku(skus);
            System.out.println("MYNTRA_SKUS added successfully for " + file.getOriginalFilename() + " :: records processed : " + uploadedSku);
            return "File upload successfully for " + uploadedSku + " Sku's";
        } catch (Exception e) {
            e.printStackTrace();
            return "File upload failed: " + e.getMessage();
        }
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
            Integer uploadedSku = purchaseInventoryService.addSku(skus);
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
    public String processMyntraRebateReport(@RequestPart MultipartFile file) throws Exception {
        return myntraService.processMyntraRebateReport(file);
    }
}
