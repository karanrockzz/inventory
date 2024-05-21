package com.example.inventory.inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;


@RestController
@SpringBootApplication
public class InventoryApplication {

 	@Autowired
    @Lazy
    private EurekaClient eurekaClient; 

	public static void main(String[] args) {
		new SpringApplicationBuilder(InventoryApplication.class).web(WebApplicationType.SERVLET).run(args);
	}

	@RequestMapping("/greeting")
    public String greeting() {
        return String.format(
          "Hello World!",eurekaClient.getApplication(null);
    }

}
