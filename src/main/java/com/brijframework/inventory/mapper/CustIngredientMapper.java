package com.brijframework.inventory.mapper;
import static com.brijframework.inventory.contants.Constants.COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.inventory.contants.Constants.CUST_BASE_UNIT_ID_ENTITY;
import static com.brijframework.inventory.contants.Constants.CUST_BASE_UNIT_ID_UI;
import static com.brijframework.inventory.contants.Constants.CUST_CATEGORY_ID_ENTITY;
import static com.brijframework.inventory.contants.Constants.CUST_CATEGORY_ID_UI;
import static com.brijframework.inventory.contants.Constants.CUST_BUSINESS_APP_ID_ENTITY;
import static com.brijframework.inventory.contants.Constants.CUST_BUSINESS_APP_ID_UI;
import static com.brijframework.inventory.contants.Constants.CUST_REPT_UNIT_ID_ENTITY;
import static com.brijframework.inventory.contants.Constants.CUST_REPT_UNIT_ID_UI;
import static com.brijframework.inventory.contants.Constants.GLB_IMAGE_ID_ENTITY;
import static com.brijframework.inventory.contants.Constants.GLB_IMAGE_ID_UI;
import static com.brijframework.inventory.contants.Constants.SPRING;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.inventory.dto.UICustIngredient;
import com.brijframework.inventory.entities.EOCustIngredient;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustIngredientMapper  extends GenericMapper<EOCustIngredient, UICustIngredient>{
	

	@Mapping(target=CUST_BUSINESS_APP_ID_ENTITY, source=CUST_BUSINESS_APP_ID_UI)
	@Mapping(target=CUST_BASE_UNIT_ID_ENTITY, source=CUST_BASE_UNIT_ID_UI)
	@Mapping(target=CUST_REPT_UNIT_ID_ENTITY, source=CUST_REPT_UNIT_ID_UI)
	@Mapping(target=CUST_CATEGORY_ID_ENTITY, source=CUST_CATEGORY_ID_UI)
	@Mapping(target=GLB_IMAGE_ID_ENTITY, source=GLB_IMAGE_ID_UI)
	@Override
	EOCustIngredient mapToDAO(UICustIngredient uiCustIngredient);
	
	@Mapping(source=CUST_BUSINESS_APP_ID_ENTITY, target=CUST_BUSINESS_APP_ID_UI)
	@Mapping(source=CUST_CATEGORY_ID_ENTITY, target=CUST_CATEGORY_ID_UI)
	@Mapping(source=CUST_BASE_UNIT_ID_ENTITY, target=CUST_BASE_UNIT_ID_UI)
	@Mapping(source=CUST_REPT_UNIT_ID_ENTITY, target=CUST_REPT_UNIT_ID_UI)
	@Mapping(source=GLB_IMAGE_ID_ENTITY, target=GLB_IMAGE_ID_UI)
	@Override
	UICustIngredient mapToDTO(EOCustIngredient eoCustIngredient);
}
