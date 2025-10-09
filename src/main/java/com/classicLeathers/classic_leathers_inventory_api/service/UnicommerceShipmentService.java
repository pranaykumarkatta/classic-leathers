package com.classicLeathers.classic_leathers_inventory_api.service;

import com.classicLeathers.classic_leathers_inventory_api.model.UnicommerceShipment;
import com.classicLeathers.classic_leathers_inventory_api.repository.UnicommerceShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UnicommerceShipmentService {
    @Autowired
    UnicommerceShipmentRepository unicommerceShipmentRepository;

    public String processUnicommerceShipmentReport(MultipartFile file) {
        try {
            String fileData = new String(file.getBytes(), StandardCharsets.UTF_8);
            List<String> dataRows = new ArrayList<>();
            dataRows.addAll(Arrays.asList(fileData.split("\n")));
            dataRows.remove(0);
            List<UnicommerceShipment> unicommerceShipments = new ArrayList<>();
            for (int i = 0; i < dataRows.size(); i++) {
                String[] data = dataRows.get(i).split(",");
                UnicommerceShipment unicommerceShipment = new UnicommerceShipment();
                unicommerceShipment.setShipment(data[0]);
                unicommerceShipment.setReadyForQuickPacking(data[2]);
                unicommerceShipment.setGiftMessages(data[2]);
                unicommerceShipment.setItemContains(data[4]);
                unicommerceShipment.setProducts(data[5]);
                unicommerceShipment.setChannel(data[6]);
                unicommerceShipment.setStatus(data[7]);
                unicommerceShipment.setPriority(data[8]);
                unicommerceShipment.setPicklist(data[9]);
                unicommerceShipment.setInvoiceNo(data[10]);
                unicommerceShipment.setOnHold(data[11]);
                unicommerceShipment.setState(data[12]);
                unicommerceShipment.setFulfillmentTat(data[13]);
                unicommerceShipment.setRegulatoryForms(data[14]);
                unicommerceShipment.setBatchNo(data[15]);
                unicommerceShipment.setShipping(data[16]);
                unicommerceShipment.setPaymentMethod(data[17]);
                unicommerceShipment.setCreated(data[18]);
                unicommerceShipment.setAction(data[20]);
                unicommerceShipment.setDisplayOrderNo(data[21]);
                unicommerceShipment.setShipmentSerialNumber(data[22]);
                unicommerceShipment.setContainsGiftWrap(data[23]);
                unicommerceShipment.setChannelCode(data[24]);
                unicommerceShipment.setChannelId(data[25]);
                unicommerceShipment.setItemTypeSkus(data[26]);
                unicommerceShipment.setItemTypeIds(data[27]);
                unicommerceShipment.setSellerSkus(data[28]);
                unicommerceShipment.setItemIdDetails(data[29]);
                unicommerceShipment.setSellerSkuDetails(data[30]);
                unicommerceShipment.setShippingProvider(data[31]);
                unicommerceShipment.setShippingProviderCode(data[32]);
                unicommerceShipment.setShippingCourier(data[33]);
                unicommerceShipment.setAwb(data[34]);
                unicommerceShipment.setDispatchTime(data[35]);
                unicommerceShipment.setShippingArrangedBy(data[36]);
                unicommerceShipment.setProductManagementSwitchedOdd(data[37]);
                unicommerceShipment.setLabelFormat(data[38]);
                unicommerceShipment.setItemDetailsList(data[39]);
                unicommerceShipment.setItemDetailingPending(data[40]);
                unicommerceShipment.setPutawayPending(data[41]);
                unicommerceShipment.setWeight(data[42]);
                unicommerceShipment.setWeight(data[43]);
                unicommerceShipment.setLength(data[44]);
                unicommerceShipment.setWidth(data[45]);
                unicommerceShipment.setHeight(data[46]);
                unicommerceShipment.setPackageType(data[47]);
                unicommerceShipment.setNumberOfBoxes(data[48]);
                unicommerceShipment.setSingleActionInvoiceLabelNew(data[49]);
                unicommerceShipment.setOrderItemIds(data[50]);
                unicommerceShipment.setShippingPackageTypeScannableSource(data[51]);
                unicommerceShipments.add(unicommerceShipment);
                unicommerceShipment.trimFields();
            }
            Integer count = unicommerceShipmentRepository.saveAll(unicommerceShipments).size();
            System.out.println("SHIPMENT_REPORT processed successfully for " + file.getOriginalFilename() + " :: records processed : " + count);
            return "SHIPMENT_REPORT processed successfully for " + file.getName() + " :: records processed : " + count;
        } catch (Exception e) {
            e.printStackTrace();
            return "File upload failed: " + e.getMessage();
        }

    }
}
