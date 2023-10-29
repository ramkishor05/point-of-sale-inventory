package com.brijframework.inventory.service.impl;

import java.util.List;

import com.brijframework.inventory.dto.UICustIngredient;
import com.brijframework.inventory.entities.EOCustBusinessApp;

public interface CustIngredientService {

	UICustIngredient saveIngredient(long custBusinessAppId, UICustIngredient custIngredient);

	UICustIngredient saveIngredient(UICustIngredient custIngredient);

	UICustIngredient saveIngredient(EOCustBusinessApp eoCustBusinessApp, UICustIngredient custIngredient);

	UICustIngredient getIngredient(long id);

	List<UICustIngredient> getIngredientList(long custBusinessAppId);

	UICustIngredient getIngredient(long custBusinessAppId, String typeId);

}
