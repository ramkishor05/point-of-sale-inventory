package com.brijframework.inventory.mapper;
import static com.brijframework.inventory.contants.Constants.COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.inventory.contants.Constants.CUST_BUSINESS_APP_ID_ENTITY;
import static com.brijframework.inventory.contants.Constants.CUST_BUSINESS_APP_ID_UI;
import static com.brijframework.inventory.contants.Constants.CUST_STORAGE_ID_ENTITY;
import static com.brijframework.inventory.contants.Constants.CUST_STORAGE_ID_UI;
import static com.brijframework.inventory.contants.Constants.SPRING;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.inventory.dto.UICustLocation;
import com.brijframework.inventory.entities.EOCustLocation;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustLocationMapper  extends GenericMapper<EOCustLocation, UICustLocation>{

	@Mapping(target=CUST_BUSINESS_APP_ID_ENTITY, source=CUST_BUSINESS_APP_ID_UI)
	@Mapping(target=CUST_STORAGE_ID_ENTITY, source=CUST_STORAGE_ID_UI)
	@Override
	EOCustLocation mapToDAO(UICustLocation uiCustLocation);
	
	@Mapping(source=CUST_BUSINESS_APP_ID_ENTITY, target=CUST_BUSINESS_APP_ID_UI)
	@Mapping(source=CUST_STORAGE_ID_ENTITY, target=CUST_STORAGE_ID_UI)
	@Override
	UICustLocation mapToDTO(EOCustLocation eoCustLocation);
}
