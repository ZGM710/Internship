package com.zahra.inventory_service.service;

import com.zahra.inventory_service.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;
    @Transactional(readOnly = true)
    public boolean isInStock( String skuCode){
        return inventoryRepository.findBySkuCode(skuCode).isPresent(); //check weather obj is present or not
    }
}
