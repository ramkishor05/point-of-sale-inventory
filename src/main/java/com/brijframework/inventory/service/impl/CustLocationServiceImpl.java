package com.brijframework.inventory.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.inventory.dto.UICustLocation;
import com.brijframework.inventory.entities.EOCustBusinessApp;
import com.brijframework.inventory.entities.EOCustLocation;
import com.brijframework.inventory.mapper.CustLocationMapper;
import com.brijframework.inventory.repository.CustBusinessAppRepository;
import com.brijframework.inventory.repository.CustLocationRepository;

@Service
public class CustLocationServiceImpl implements CustLocationService {
	
	@Autowired
	CustBusinessAppRepository custBusinessAppRepository;
	
	@Autowired
	CustLocationRepository custLocationRepository;
	
	@Autowired
	CustLocationMapper custLocationMapper;
	
	@Override
	public UICustLocation saveLocation(long custBusinessAppId, UICustLocation custLocation) {
		Optional<EOCustBusinessApp> findById = custBusinessAppRepository.findById(custBusinessAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return saveLocation(findById.get(), custLocation);
	}
	
	@Override
	public UICustLocation saveLocation(UICustLocation custLocation) {
		Optional<EOCustBusinessApp> findById = custBusinessAppRepository.findById(custLocation.getCustBusinessAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return saveLocation(findById.get(), custLocation);
	}
	
	@Override
	public UICustLocation saveLocation(EOCustBusinessApp custBusinessApp,UICustLocation custLocation) {
		EOCustLocation eoLocation=custLocationMapper.mapToDAO(custLocation);
		eoLocation.setCustBusinessApp(custBusinessApp);
		custLocationRepository.save(eoLocation);
		return custLocationMapper.mapToDTO(eoLocation);
	}

	@Override
	public UICustLocation getLocation(long id) {
		return custLocationMapper.mapToDTO(custLocationRepository.getReferenceById(id));
	}

	@Override
	public List<UICustLocation> getLocationList(long custBusinessAppId) {
		return null;
	}

	@Override
	public UICustLocation getLocation(long custBusinessAppId, String typeId) {
		return null;
	}

}
