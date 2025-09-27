package com.zahra.inventory_service.controller;



import com.zahra.inventory_service.dto.InventoryResponse;
import com.zahra.inventory_service.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;
    //path variable format: http://localhost:8082/api/inventory/iphone-17,iphone-17-blue
    //request parameter format : http://localhost:8082/api/inventory?skuCode=iphone-17&skuCode=iphone-17-blue
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode){
        return inventoryService.isInStock(skuCode);
    }

}
