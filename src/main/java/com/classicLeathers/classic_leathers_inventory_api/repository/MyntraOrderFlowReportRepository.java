package com.classicLeathers.classic_leathers_inventory_api.repository;

import com.classicLeathers.classic_leathers_inventory_api.model.MyntraOrderFlowEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MyntraOrderFlowReportRepository extends JpaRepository<MyntraOrderFlowEntry, Long> {
}
