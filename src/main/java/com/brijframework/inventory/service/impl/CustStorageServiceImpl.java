package com.brijframework.inventory.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.inventory.dto.UICustStorage;
import com.brijframework.inventory.entities.EOCustInventoryApp;
import com.brijframework.inventory.entities.EOCustStorage;
import com.brijframework.inventory.mapper.CustStorageMapper;
import com.brijframework.inventory.repository.CustInventoryAppRepository;
import com.brijframework.inventory.repository.CustStorageRepository;

@Service
public class CustStorageServiceImpl implements CustStorageService {
	
	@Autowired
	CustInventoryAppRepository inventoryApplicationRepository;
	
	@Autowired
	CustStorageRepository inventoryStorageRepository;
	
	@Autowired
	CustStorageMapper inventoryStorageMapper;
	
	@Override
	public UICustStorage saveStorage(long inventoryAppId, UICustStorage Storage) {
		Optional<EOCustInventoryApp> findById = inventoryApplicationRepository.findById(inventoryAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return saveStorage(findById.get(), Storage);
	}
	
	@Override
	public UICustStorage saveStorage(UICustStorage Storage) {
		Optional<EOCustInventoryApp> findById = inventoryApplicationRepository.findById(Storage.getCustInventoryAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return saveStorage(findById.get(), Storage);
	}
	
	@Override
	public UICustStorage saveStorage(EOCustInventoryApp eoInventoryApp,UICustStorage Storage) {
		EOCustStorage eoStorage=inventoryStorageMapper.mapToDAO(Storage);
		inventoryStorageRepository.save(eoStorage);
		return inventoryStorageMapper.mapToDTO(eoStorage);
	}

	@Override
	public UICustStorage getStorage(long id) {
		return inventoryStorageMapper.mapToDTO(inventoryStorageRepository.getOne(id));
	}

	@Override
	public List<UICustStorage> getStorageList(long inventoryAppId) {
		return inventoryStorageMapper.mapToDTO(inventoryStorageRepository.findAllByCustInventoryAppId(inventoryAppId));
	}
	
	@Override
	public UICustStorage getStorage(long inventoryAppId,String typeId) {
		return inventoryStorageMapper.mapToDTO(inventoryStorageRepository.findByCustInventoryAppIdAndTypeId(inventoryAppId, typeId));
	}

}
