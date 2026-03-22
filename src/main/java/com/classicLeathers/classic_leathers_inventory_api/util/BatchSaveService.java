package com.classicLeathers.classic_leathers_inventory_api.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BatchSaveService {
    @PersistenceContext
    private EntityManager entityManager;

    private static final int BATCH_SIZE = 50; // change if needed

    @Transactional
    public <T> void saveInBatch(List<T> entities) {

        for (int i = 0; i < entities.size(); i++) {

            entityManager.persist(entities.get(i));

            if (i > 0 && i % BATCH_SIZE == 0) {
                entityManager.flush();
                entityManager.clear();
            }
        }

        entityManager.flush();
        entityManager.clear();
    }
}
