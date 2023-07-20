package com.brijframework.production.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.production.dto.UIGlobalUnit;
import com.brijframework.production.dto.UIGlobalUnitGroup;
import com.brijframework.production.entities.EOGlobalUnit;
import com.brijframework.production.entities.EOGlobalUnitGroup;
import com.brijframework.production.entities.cust.EOCustProductionApp;
import com.brijframework.production.mapper.GlobalUnitGroupMapper;
import com.brijframework.production.mapper.GlobalUnitMapper;
import com.brijframework.production.repository.GlobalUnitGroupRepository;
import com.brijframework.production.repository.GlobalUnitRepository;
import com.brijframework.production.repository.cust.CustProductionAppRepository;
import com.brijframework.production.service.GlobalUnitGroupService;

@Service
public class GlobalUnitGroupServiceImpl implements GlobalUnitGroupService {
	
	@Autowired
	CustProductionAppRepository inventoryApplicationRepository;
	
	@Autowired
	GlobalUnitGroupRepository inventoryUnitGroupRepository;
	
	@Autowired
	GlobalUnitGroupMapper inventoryUnitGroupMapper;
	
	@Autowired
	GlobalUnitRepository inventoryUnitRepository;
	
	@Autowired
	GlobalUnitMapper inventoryUnitMapper;
	
		
	@Override
	public UIGlobalUnitGroup saveUnitGroup(UIGlobalUnitGroup unitGroup) {
		EOGlobalUnitGroup eoUnitGroup=inventoryUnitGroupMapper.mapToDAO(unitGroup);
		inventoryUnitGroupRepository.save(eoUnitGroup);
		return inventoryUnitGroupMapper.mapToDTO(eoUnitGroup);
	}

	@Override
	public UIGlobalUnitGroup getUnitGroup(long id) {
		return inventoryUnitGroupMapper.mapToDTO(inventoryUnitGroupRepository.getOne(id));
	}

	@Override
	public UIGlobalUnitGroup saveUnitGroup(long inventoryAppId, UIGlobalUnitGroup unitGroup) {
		return null;
	}

	@Override
	public UIGlobalUnitGroup saveUnitGroup(EOCustProductionApp eoInventoryApp, UIGlobalUnitGroup unitGroup) {
		return null;
	}

	@Override
	public List<UIGlobalUnitGroup> getUnitGroupList(long inventoryAppId) {
		return null;
	}

	@Override
	public UIGlobalUnitGroup getUnitGroup(long inventoryAppId, String typeId) {
		return null;
	}

}
