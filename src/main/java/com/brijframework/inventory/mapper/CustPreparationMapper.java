package com.brijframework.inventory.mapper;
import static com.brijframework.inventory.contants.Constants.COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL;
import static com.brijframework.inventory.contants.Constants.CUST_BUSINESS_APP_ID_ENTITY;
import static com.brijframework.inventory.contants.Constants.CUST_BUSINESS_APP_ID_UI;
import static com.brijframework.inventory.contants.Constants.GLB_IMAGE_ID_ENTITY;
import static com.brijframework.inventory.contants.Constants.GLB_IMAGE_ID_UI;
import static com.brijframework.inventory.contants.Constants.SPRING;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.brijframework.inventory.dto.UICustPreparation;
import com.brijframework.inventory.entities.EOCustPreparation;

@Mapper(componentModel = SPRING, implementationPackage = COM_BRIJFRAMEWORK_CUST_PRODUCTION_MAPPER_IMPL)
public interface CustPreparationMapper  extends GenericMapper<EOCustPreparation, UICustPreparation>{

	@Mapping(target=CUST_BUSINESS_APP_ID_ENTITY, source=CUST_BUSINESS_APP_ID_UI)
	@Mapping(target=GLB_IMAGE_ID_ENTITY, source=GLB_IMAGE_ID_UI)
	@Override
	EOCustPreparation mapToDAO(UICustPreparation uiCustPreparation);
	
	@Mapping(source=CUST_BUSINESS_APP_ID_ENTITY, target=CUST_BUSINESS_APP_ID_UI)
	@Mapping(source=GLB_IMAGE_ID_ENTITY, target=GLB_IMAGE_ID_UI)
	@Override
	UICustPreparation mapToDTO(EOCustPreparation eoInvPreparation);
}
