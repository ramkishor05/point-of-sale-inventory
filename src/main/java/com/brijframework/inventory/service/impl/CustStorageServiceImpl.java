package com.brijframework.inventory.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.inventory.dto.UICustStorage;
import com.brijframework.inventory.entities.EOCustBusinessApp;
import com.brijframework.inventory.entities.EOCustStorage;
import com.brijframework.inventory.mapper.CustStorageMapper;
import com.brijframework.inventory.repository.CustBusinessAppRepository;
import com.brijframework.inventory.repository.CustStorageRepository;

@Service
public class CustStorageServiceImpl implements CustStorageService {
	
	@Autowired
	CustBusinessAppRepository inventoryApplicationRepository;
	
	@Autowired
	CustStorageRepository inventoryStorageRepository;
	
	@Autowired
	CustStorageMapper inventoryStorageMapper;
	
	@Override
	public UICustStorage saveStorage(long inventoryAppId, UICustStorage Storage) {
		Optional<EOCustBusinessApp> findById = inventoryApplicationRepository.findById(inventoryAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return saveStorage(findById.get(), Storage);
	}
	
	@Override
	public UICustStorage saveStorage(UICustStorage Storage) {
		Optional<EOCustBusinessApp> findById = inventoryApplicationRepository.findById(Storage.getCustBusinessAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return saveStorage(findById.get(), Storage);
	}
	
	@Override
	public UICustStorage saveStorage(EOCustBusinessApp eoBusinessApp,UICustStorage Storage) {
		EOCustStorage eoStorage=inventoryStorageMapper.mapToDAO(Storage);
		inventoryStorageRepository.save(eoStorage);
		return inventoryStorageMapper.mapToDTO(eoStorage);
	}

	@Override
	public UICustStorage getStorage(long id) {
		return inventoryStorageMapper.mapToDTO(inventoryStorageRepository.getReferenceById(id));
	}

	@Override
	public List<UICustStorage> getStorageList(long inventoryAppId) {
		return inventoryStorageMapper.mapToDTO(inventoryStorageRepository.findAllByCustBusinessAppId(inventoryAppId));
	}
	
	@Override
	public UICustStorage getStorage(long inventoryAppId,String typeId) {
		return inventoryStorageMapper.mapToDTO(inventoryStorageRepository.findByCustBusinessAppIdAndTypeId(inventoryAppId, typeId));
	}

}
