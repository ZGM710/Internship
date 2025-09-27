package com.zahra.inventory_service;

import com.zahra.inventory_service.model.Inventory;
import com.zahra.inventory_service.repository.InventoryRepository;
import com.zahra.inventory_service.service.InventoryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

    @Bean
    public CommandLineRunner loadTheData(InventoryRepository inventoryRepository){
        return args -> {
            Inventory inventory = new Inventory();
            inventory.setSkuCode("iphone_17");
            inventory.setQuantity(200);

            Inventory inventory2 = new Inventory();
            inventory2.setSkuCode("iphone_17_blue");
            inventory2.setQuantity(0);

            inventoryRepository.save(inventory);
            inventoryRepository.save(inventory2);

        };
    }
}
