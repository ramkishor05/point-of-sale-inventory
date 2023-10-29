package com.brijframework.inventory.mapper;
import static com.brijframework.inventory.contants.Constants.COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.inventory.contants.Constants.CUST_BUSINESS_APP_ID_ENTITY;
import static com.brijframework.inventory.contants.Constants.CUST_BUSINESS_APP_ID_UI;
import static com.brijframework.inventory.contants.Constants.SPRING;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.inventory.dto.UICustStorage;
import com.brijframework.inventory.entities.EOCustStorage;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustStorageMapper  extends GenericMapper<EOCustStorage, UICustStorage>{

	@Mapping(target=CUST_BUSINESS_APP_ID_ENTITY, source=CUST_BUSINESS_APP_ID_UI)
	@Override
	EOCustStorage mapToDAO(UICustStorage uiStorage);
	
	@Mapping(source=CUST_BUSINESS_APP_ID_ENTITY, target=CUST_BUSINESS_APP_ID_UI)
	@Override
	UICustStorage mapToDTO(EOCustStorage eoInvStorage);
}
