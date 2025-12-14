package com.classicLeathers.classic_leathers_inventory_api.service;

import com.classicLeathers.classic_leathers_inventory_api.model.CustomerData;
import com.classicLeathers.classic_leathers_inventory_api.model.MyntraAdvertisementEntry;
import com.classicLeathers.classic_leathers_inventory_api.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RetailService {
    @Autowired
    CustomerRepository customerRepository;
    public String processRetailSAles(MultipartFile file) {
        try {
            String fileData = new String(file.getBytes(), StandardCharsets.UTF_8);
            List<String> dataRows = new ArrayList<>();
            dataRows.addAll(Arrays.asList(fileData.split("\n")));
            dataRows.remove(0);
            List<CustomerData> customerDataList = new ArrayList<>();
            for (int i = 0; i < dataRows.size(); i++) {
                String[] data = dataRows.get(i).split(",");
                CustomerData customerData = new CustomerData();
                customerData.setName(data[1]);
                customerData.setGender(data[2]);
                customerData.setMobileNumber(data[3]);
                customerDataList.add(customerData);
            }
            Integer count = customerRepository.saveAll(customerDataList).size();
            System.out.println("MYNTRA_ADV_REPORT processed successfully for " + file.getOriginalFilename() + " :: records processed : " + count);
            return "MYNTRA_ADV_REPORT processed successfully for " + file.getName() + " :: records processed : " + count;
        } catch (Exception e) {
            e.printStackTrace();
            return "File upload failed: " + e.getMessage();
        }
    }
}
