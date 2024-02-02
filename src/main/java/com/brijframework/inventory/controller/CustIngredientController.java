package com.brijframework.inventory.controller;

import static com.brijframework.inventory.contants.Constants.CUST_APP_ID;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.inventory.dto.UICustIngredient;
import com.brijframework.inventory.service.impl.CustIngredientService;

@RestController
@RequestMapping("/api/cust/ingredient")
public class CustIngredientController {

	@Autowired
	private CustIngredientService custIngredientService;
	
	@PostMapping
	public UICustIngredient addIngredient(@RequestHeader(CUST_APP_ID) long custAppId,@RequestBody UICustIngredient uiCustIngredient) {
		return custIngredientService.saveIngredient(custAppId,uiCustIngredient);
	}
	
	@GetMapping
	public List<UICustIngredient> getIngredientList(@RequestHeader(CUST_APP_ID) long custAppId) {
		return custIngredientService.getIngredientList(custAppId);
	}
	
	@GetMapping("/{typeId}")
	public UICustIngredient getIngredientList(@RequestHeader(CUST_APP_ID) long custAppId,@PathVariable("typeId") String typeId) {
		return custIngredientService.getIngredient(custAppId, typeId);
	}
}
