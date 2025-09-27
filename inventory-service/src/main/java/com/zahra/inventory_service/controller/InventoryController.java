package com.zahra.inventory_service.controller;



import com.zahra.inventory_service.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {

    private final InventoryService inventoryService;
    @GetMapping("/{sku-Code}")
    @ResponseStatus(HttpStatus.OK)
    public boolean isInStock(@RequestParam("sku-Code") String skuCode){
        return inventoryService.isInStock(skuCode);
    }

}
