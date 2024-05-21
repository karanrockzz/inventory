package com.example.inventory.inventory;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class InventoryApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(InventoryApplication.class).run(args);
	}

	@RequestMapping("/greeting")
    public String greeting() {
        return String.format(
          "Hello World!");
    }

}
