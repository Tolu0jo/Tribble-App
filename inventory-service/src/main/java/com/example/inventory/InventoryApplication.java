package com.example.inventory;

import com.example.inventory.model.Inventory;
import com.example.inventory.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args ->{
			Inventory inventory = new Inventory();
			inventory.setSkuCode("iphone_13");
			inventory.setQuantity(100);

			inventoryRepository.save(inventory);

			Inventory inventory1 = new Inventory();
			inventory.setSkuCode("iphone_13_red");
			inventory.setQuantity(0);


			inventoryRepository.save(inventory1);
		};
}
}
