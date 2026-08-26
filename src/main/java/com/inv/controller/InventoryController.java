package com.inv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/inventory")
@Tag(description = "Inventory Service", name = "Inventory Service API'S")
public class InventoryController 
{
	
	
	
	@GetMapping("/healthCheck")
	@Operation(summary = "Health Check Api")
	public String heakthCheck() 
	{
		return "Application is Up";
	}
	
}
