package com.classicLeathers.classic_leathers_inventory_api.service;

import com.classicLeathers.classic_leathers_inventory_api.model.MyntraAdvertisementEntry;
import com.classicLeathers.classic_leathers_inventory_api.model.MyntraForwardSettlementEntry;
import com.classicLeathers.classic_leathers_inventory_api.model.MyntraOrderFlowEntry;
import com.classicLeathers.classic_leathers_inventory_api.model.MyntraReturnSettlementEntry;
import com.classicLeathers.classic_leathers_inventory_api.repository.MyntraAdvertisementRepository;
import com.classicLeathers.classic_leathers_inventory_api.repository.MyntraForwardSettlementEntryRepository;
import com.classicLeathers.classic_leathers_inventory_api.repository.MyntraOrderFlowReportRepository;
import com.classicLeathers.classic_leathers_inventory_api.repository.MyntraReturnSettlementEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class MyntraService {
    @Autowired
    MyntraOrderFlowReportRepository myntraOrderFlowReportRepository;
    @Autowired
    MyntraForwardSettlementEntryRepository myntraForwardSettlementEntryRepository;
    @Autowired
    MyntraReturnSettlementEntryRepository myntraReturnSettlementEntryRepository;
    @Autowired
    MyntraAdvertisementRepository myntraAdvertisementRepository;

    public String processMyntraOrderFlowReport(MultipartFile file) {
        try {
            String fileData = new String(file.getBytes(), StandardCharsets.UTF_8);
            List<String> dataRows = new ArrayList<>();
            dataRows.addAll(Arrays.asList(fileData.split("\n")));
            dataRows.remove(0);
            List<MyntraOrderFlowEntry> myntraOrderFlowEntries = new ArrayList<>();
            for (int i = 0; i < dataRows.size(); i++) {
                String[] data = dataRows.get(i).split(",");
                MyntraOrderFlowEntry myntraOrderFlowEntry = new MyntraOrderFlowEntry();
                myntraOrderFlowEntry.setSaleOrderCode(data[0]);
                myntraOrderFlowEntry.setOrderNumber(data[1]);
                myntraOrderFlowEntry.setOrderDate(data[2]);
                myntraOrderFlowEntry.setPackingDate(data[3]);
                myntraOrderFlowEntry.setInvoiceNumber(data[4]);
                myntraOrderFlowEntry.setProductSkuCode(data[5]);
                myntraOrderFlowEntry.setOrderItemStatus(data[6]);
                myntraOrderFlowEntry.setPromisedDeliveryDate(data[7]);
                myntraOrderFlowEntry.setActualDeliveryDate(data[8]);
                myntraOrderFlowEntry.setReturnDate(data[9]);
                myntraOrderFlowEntry.setRestockedDate(data[10]);
                myntraOrderFlowEntry.setReturnType(data[11]);
                myntraOrderFlowEntry.setPromisedSettlementDate(data[12]);
                myntraOrderFlowEntry.setCurrency(data[13]);
                myntraOrderFlowEntry.setCustomerPaidAmount(data[14]);
                myntraOrderFlowEntry.setPostpaidAmount(data[15]);
                myntraOrderFlowEntry.setPrepaidAmount(data[16]);
                myntraOrderFlowEntry.setMrp(data[17]);
                myntraOrderFlowEntry.setDiscountAmount(data[18]);
                myntraOrderFlowEntry.setShippingCase(data[19]);
                myntraOrderFlowEntry.setTaxRate(data[20]);
                myntraOrderFlowEntry.setIgstAmount(data[21]);
                myntraOrderFlowEntry.setCgstAmount(data[22]);
                myntraOrderFlowEntry.setSgstAmount(data[23]);
                myntraOrderFlowEntry.setTcsIgstAmt(data[24]);
                myntraOrderFlowEntry.setTcsSgstAmt(data[25]);
                myntraOrderFlowEntry.setTcsCgstAmt(data[26]);
                myntraOrderFlowEntry.setMinimumCommission(data[27]);
                myntraOrderFlowEntry.setCommissionPct(data[28]);
                myntraOrderFlowEntry.setCommissionTotalAmount(data[29]);
                myntraOrderFlowEntries.add(myntraOrderFlowEntry);
            }
            Integer count = myntraOrderFlowReportRepository.saveAll(myntraOrderFlowEntries).size();
            System.out.println("ORDER_FLOW_REPORT processed successfully for " + file.getOriginalFilename() + " :: records processed : " + count);
            return "ORDER_FLOW_REPORT processed successfully for " + file.getName() + " :: records processed : " + count;
        } catch (Exception e) {
            e.printStackTrace();
            return "File upload failed: " + e.getMessage();
        }
    }

    public String processMyntraForwardSettlementReport(MultipartFile file) {
        try {
            String fileData = new String(file.getBytes(), StandardCharsets.UTF_8);
            List<String> dataRows = new ArrayList<>();
            dataRows.addAll(Arrays.asList(fileData.split("\n")));
            dataRows.remove(0);
            List<MyntraForwardSettlementEntry> myntraForwardSettlementEntries = new ArrayList<>();
            for (int i = 0; i < dataRows.size(); i++) {
                String[] data = dataRows.get(i).split(",");
                MyntraForwardSettlementEntry myntraForwardSettlementEntry = new MyntraForwardSettlementEntry();
                myntraForwardSettlementEntry.setOrderReleaseId(data[0]);
                myntraForwardSettlementEntry.setOrderLineId(data[1]);
                myntraForwardSettlementEntry.setReturnType(data[2]);
                myntraForwardSettlementEntry.setReturnDate(data[3]);
                myntraForwardSettlementEntry.setPackingDate(data[4]);
                myntraForwardSettlementEntry.setDeliveryDate(data[5]);
                myntraForwardSettlementEntry.setEcommercePortalName(data[6]);
                myntraForwardSettlementEntry.setSkuCode(data[7]);
                myntraForwardSettlementEntry.setInvoiceNumber(data[8]);
                myntraForwardSettlementEntry.setPacketId(data[9]);
                myntraForwardSettlementEntry.setHsnCode(data[10]);
                myntraForwardSettlementEntry.setProductTaxCategory(data[11]);
                myntraForwardSettlementEntry.setCurrency(data[12]);
                myntraForwardSettlementEntry.setCustomerPaidAmount(data[13]);
                myntraForwardSettlementEntry.setPostpaidAmount(data[14]);
                myntraForwardSettlementEntry.setPrepaidAmount(data[15]);
                myntraForwardSettlementEntry.setMrp(data[16]);
                myntraForwardSettlementEntry.setTotalDiscountAmount(data[17]);
                myntraForwardSettlementEntry.setShippingCase(data[18]);
                myntraForwardSettlementEntry.setTotalTaxRate(data[19]);
                myntraForwardSettlementEntry.setIgstAmount(data[20]);
                myntraForwardSettlementEntry.setCgstAmount(data[21]);
                myntraForwardSettlementEntry.setSgstAmount(data[22]);
                myntraForwardSettlementEntry.setTcsAmount(data[23]);
                myntraForwardSettlementEntry.setTdsAmount(data[24]);
                myntraForwardSettlementEntry.setCommissionPercentage(data[25]);
                myntraForwardSettlementEntry.setMinimumCommission(data[26]);
                myntraForwardSettlementEntry.setPlatformFees(data[27]);
                myntraForwardSettlementEntry.setTotalCommission(data[28]);
                myntraForwardSettlementEntry.setTotalCommissionPlusTcsTdsDeduction(data[29]);
                myntraForwardSettlementEntry.setTotalLogisticsDeduction(data[30]);
                myntraForwardSettlementEntry.setShippingFee(data[31]);
                myntraForwardSettlementEntry.setFixedFee(data[32]);
                myntraForwardSettlementEntry.setPickAndPackFee(data[33]);
                myntraForwardSettlementEntry.setPaymentGatewayFee(data[34]);
                myntraForwardSettlementEntry.setTotalTaxOnLogistics(data[35]);
                myntraForwardSettlementEntry.setArticleLevel(data[36]);
                myntraForwardSettlementEntry.setShipmentZoneClassification(data[37]);
                myntraForwardSettlementEntry.setCustomerPaidAmount(data[38]);
                myntraForwardSettlementEntry.setTotalExpectedSettlement(data[39]);
                myntraForwardSettlementEntry.setTotalActualSettlement(data[40]);
                myntraForwardSettlementEntry.setAmountPendingSettlement(data[41]);
                myntraForwardSettlementEntry.setPrepaidCommissionDeduction(data[42]);
                myntraForwardSettlementEntry.setPrepaidLogisticsDeduction(data[43]);
                myntraForwardSettlementEntry.setPrepaidPayment(data[44]);
                myntraForwardSettlementEntry.setPostpaidCommissionDeduction(data[45]);
                myntraForwardSettlementEntry.setPostpaidLogisticsDeduction(data[46]);
                myntraForwardSettlementEntry.setPostpaidPayment(data[47]);
                if ((file.getOriginalFilename().contains("MYNTRA_FORWARD_UN_SETTLEMENT"))) {
                    myntraForwardSettlementEntry.setSellerOrderId(data[108]);
                } else if ((file.getOriginalFilename().contains("MYNTRA_FORWARD_SETTLEMENT"))) {
                    myntraForwardSettlementEntry.setSellerOrderId(data[139]);
                }
                myntraForwardSettlementEntry.setMarketingChargesPrepaid(data[153]);
                myntraForwardSettlementEntry.setMarketingChargesPostpaid(data[154]);
                myntraForwardSettlementEntries.add(myntraForwardSettlementEntry);
            }
            Integer count = myntraForwardSettlementEntryRepository.saveAll(myntraForwardSettlementEntries).size();
            System.out.println("MYNTRA_SETTLEMENT_REPORT processed successfully for " + file.getOriginalFilename() + " :: records processed : " + count);
            return "MYNTRA_SETTLEMENT_REPORT processed successfully for " + file.getName() + " :: records processed : " + count;
        } catch (Exception e) {
            e.printStackTrace();
            return "File upload failed: " + e.getMessage();
        }
    }

    public String processMyntraReturnSettlementReport(MultipartFile file) {
        try {
            String fileData = new String(file.getBytes(), StandardCharsets.UTF_8);
            List<String> dataRows = new ArrayList<>();
            dataRows.addAll(Arrays.asList(fileData.split("\n")));
            dataRows.remove(0);
            List<MyntraReturnSettlementEntry> myntraReturnSettlementEntries = new ArrayList<>();
            for (int i = 0; i < dataRows.size(); i++) {
                String[] data = dataRows.get(i).split(",");
                MyntraReturnSettlementEntry myntraReturnSettlementEntry = new MyntraReturnSettlementEntry();
                myntraReturnSettlementEntry.setOrderReleaseId(data[0]);
                myntraReturnSettlementEntry.setOrderLineId(data[1]);
                myntraReturnSettlementEntry.setReturnType(data[2]);
                myntraReturnSettlementEntry.setReturnDate(data[3]);
                myntraReturnSettlementEntry.setPackingDate(data[4]);
                myntraReturnSettlementEntry.setDeliveryDate(data[5]);
                myntraReturnSettlementEntry.setEcommercePortalName(data[6]);
                myntraReturnSettlementEntry.setSkuCode(data[7]);
                myntraReturnSettlementEntry.setInvoiceNumber(data[8]);
                myntraReturnSettlementEntry.setPacketId(data[9]);
                myntraReturnSettlementEntry.setHsnCode(data[10]);
                myntraReturnSettlementEntry.setProductTaxCategory(data[11]);
                myntraReturnSettlementEntry.setCurrency(data[12]);
                myntraReturnSettlementEntry.setCustomerPaidAmount(data[13]);
                myntraReturnSettlementEntry.setPostpaidAmount(data[14]);
                myntraReturnSettlementEntry.setPrepaidAmount(data[15]);
                myntraReturnSettlementEntry.setMrp(data[16]);
                myntraReturnSettlementEntry.setTotalDiscountAmount(data[17]);
                myntraReturnSettlementEntry.setShippingCase(data[18]);
                myntraReturnSettlementEntry.setTotalTaxRate(data[19]);
                myntraReturnSettlementEntry.setIgstAmount(data[20]);
                myntraReturnSettlementEntry.setCgstAmount(data[21]);
                myntraReturnSettlementEntry.setSgstAmount(data[22]);
                myntraReturnSettlementEntry.setTcsAmount(data[23]);
                myntraReturnSettlementEntry.setTdsAmount(data[24]);
                myntraReturnSettlementEntry.setCommissionPercentage(data[25]);
                myntraReturnSettlementEntry.setMinimumCommission(data[26]);
                myntraReturnSettlementEntry.setPlatformFees(data[27]);
                myntraReturnSettlementEntry.setTotalCommission(data[28]);
                myntraReturnSettlementEntry.setTotalCommissionPlusTcsTdsDeduction(data[29]);
                myntraReturnSettlementEntry.setTotalLogisticsDeduction(data[30]);
                myntraReturnSettlementEntry.setShippingFee(data[31]);
                myntraReturnSettlementEntry.setFixedFee(data[32]);
                myntraReturnSettlementEntry.setPickAndPackFee(data[33]);
                myntraReturnSettlementEntry.setPaymentGatewayFee(data[34]);
                myntraReturnSettlementEntry.setTotalTaxOnLogistics(data[35]);
                myntraReturnSettlementEntry.setArticleLevel(data[36]);
                myntraReturnSettlementEntry.setShipmentZoneClassification(data[37]);
                myntraReturnSettlementEntry.setCustomerPaidAmount(data[38]);
                myntraReturnSettlementEntry.setTotalExpectedSettlement(data[39]);
                myntraReturnSettlementEntry.setTotalActualSettlement(data[40]);
                myntraReturnSettlementEntry.setAmountPendingSettlement(data[41]);
                myntraReturnSettlementEntry.setPrepaidCommissionDeduction(data[42]);
                myntraReturnSettlementEntry.setPrepaidLogisticsDeduction(data[43]);
                myntraReturnSettlementEntry.setPrepaidPayment(data[44]);
                myntraReturnSettlementEntry.setPostpaidCommissionDeduction(data[45]);
                myntraReturnSettlementEntry.setPostpaidLogisticsDeduction(data[46]);
                myntraReturnSettlementEntry.setPostpaidPayment(data[47]);
                if ((file.getOriginalFilename().contains("MYNTRA_RETURN_UN_SETTLEMENT"))) {
                    myntraReturnSettlementEntry.setSellerOrderId(data[108]);
                } else if ((file.getOriginalFilename().contains("MYNTRA_RETURN_SETTLEMENT"))) {
                    myntraReturnSettlementEntry.setSellerOrderId(data[139]);
                }
                myntraReturnSettlementEntries.add(myntraReturnSettlementEntry);
            }
            Integer count = myntraReturnSettlementEntryRepository.saveAll(myntraReturnSettlementEntries).size();
            System.out.println("MYNTRA_SETTLEMENT_REPORT processed successfully for " + file.getOriginalFilename() + " :: records processed : " + count);
            return "MYNTRA_SETTLEMENT_REPORT processed successfully for " + file.getName() + " :: records processed : " + count;
        } catch (Exception e) {
            e.printStackTrace();
            return "File upload failed: " + e.getMessage();
        }
    }

    public String processMyntraAdvSpentReport(MultipartFile file) {
        try {
            String fileData = new String(file.getBytes(), StandardCharsets.UTF_8);
            List<String> dataRows = new ArrayList<>();
            dataRows.addAll(Arrays.asList(fileData.split("\n")));
            dataRows.remove(0);
            List<MyntraAdvertisementEntry> myntraAdvertisementEntries = new ArrayList<>();
            for (int i = 0; i < dataRows.size(); i++) {
                String[] data = dataRows.get(i).split(",");
                MyntraAdvertisementEntry myntraReturnSettlementEntry = new MyntraAdvertisementEntry();
                myntraReturnSettlementEntry.setYear(data[0]);
                myntraReturnSettlementEntry.setMonth(data[1]);
                myntraReturnSettlementEntry.setProductId(data[2]);
                myntraReturnSettlementEntry.setProductName(data[3]);
                myntraReturnSettlementEntry.setProductImageUrl(data[4]);
                myntraReturnSettlementEntry.setImpressions(data[5]);
                myntraReturnSettlementEntry.setViews(data[6]);
                myntraReturnSettlementEntry.setClicks(data[7]);
                myntraReturnSettlementEntry.setCtr(data[8]);
                myntraReturnSettlementEntry.setCvr(data[9]);
                myntraReturnSettlementEntry.setAdvertiserSpendInINR(data[10]);
                myntraReturnSettlementEntry.setUnitsSoldDirect(data[11]);
                myntraReturnSettlementEntry.setUnitsSoldIndirect(data[12]);
                myntraReturnSettlementEntry.setUnitsSold(data[13]);
                myntraReturnSettlementEntry.setRevenueDirectInINR(data[14]);
                myntraReturnSettlementEntry.setRevenueIndirectInINR(data[15]);
                myntraReturnSettlementEntry.setTotalRevenueInINR(data[16]);
                myntraReturnSettlementEntry.setRoiDirect(data[17]);
                myntraReturnSettlementEntry.setRoiIndirect(data[18]);
                myntraReturnSettlementEntry.setTotalRoi(data[19]);
                myntraReturnSettlementEntry.setId(data[20]);
                myntraAdvertisementEntries.add(myntraReturnSettlementEntry);
            }
            Integer count = myntraAdvertisementRepository.saveAll(myntraAdvertisementEntries).size();
            System.out.println("MYNTRA_ADV_REPORT processed successfully for " + file.getOriginalFilename() + " :: records processed : " + count);
            return "MYNTRA_ADV_REPORT processed successfully for " + file.getName() + " :: records processed : " + count;
        } catch (Exception e) {
            e.printStackTrace();
            return "File upload failed: " + e.getMessage();
        }
    }
}
