package com.classicLeathers.classic_leathers_inventory_api;

import com.classicLeathers.classic_leathers_inventory_api.model.CustomerData;
import com.classicLeathers.classic_leathers_inventory_api.repository.CustomerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.classicLeathers.classic_leathers_inventory_api.util.FileUtils;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@SpringBootApplication
public class ClassicLeathersInventoryApiApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ClassicLeathersInventoryApiApplication.class, args);

        // Get the repository bean from the application context
//        CustomerRepository customerRepository = context.getBean(CustomerRepository.class);
//        List<CustomerData> customerDataList = new ArrayList<>();
//        for (int i = 1; i < 13; i++) {
//            customerDataList.addAll(extractCustomerData(i - 1));
//            System.out.println(i);
////        }
////        for (int i = 1; i < 13; i++) {
////            if (i == (((Integer.parseInt(new SimpleDateFormat("MM").format(new Date()))))))
////                customerDataList.addAll(extractCustomerData(i - 1));
////        }
//
//            customerRepository.saveAll(customerDataList);
//        }
    }

    public static List<CustomerData> extractCustomerData(Integer sheetNumber) {
        String fileData = "";
        try {
            fileData = new FileUtils().getFileData("D:\\onedrive\\CLASSIC_DOCS\\RETAIL_DOCS\\2025_SALES_REPORT.xlsx", sheetNumber);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        List<String> rowData = new ArrayList<>();
        rowData.addAll(Arrays.asList(fileData.split("\n")));
        if (rowData.size() != 0) {
            rowData.remove(0);//Remove header data
            List<CustomerData> customerDataList = new ArrayList<>();
            for (String row : rowData) {
                String[] cellData = row.split(",");
                CustomerData customerData = new CustomerData();
                customerData.setName(cellData[1]);
                customerData.setGender(cellData[2]);
                customerData.setMobileNumber(cellData[3]);
                customerDataList.add(customerData);
            }

            return customerDataList;
        }
        return Collections.emptyList();

    }
}