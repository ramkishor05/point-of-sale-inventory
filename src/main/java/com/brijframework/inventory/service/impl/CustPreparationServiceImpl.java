package com.brijframework.inventory.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.inventory.dto.UICustPreparation;
import com.brijframework.inventory.entities.EOCustBusinessApp;
import com.brijframework.inventory.entities.EOCustPreparation;
import com.brijframework.inventory.mapper.CustPreparationMapper;
import com.brijframework.inventory.repository.CustBusinessAppRepository;
import com.brijframework.inventory.repository.CustPreparationRepository;

@Service
public class CustPreparationServiceImpl implements CustPreparationService {
	
	@Autowired
	CustBusinessAppRepository custBusinessAppRepository;
	
	@Autowired
	CustPreparationRepository custPreparationRepository;
	
	@Autowired
	CustPreparationMapper custPreparationMapper;
	
	@Override
	public UICustPreparation savePreparation(long custBusinessAppId, UICustPreparation custPreparation) {
		Optional<EOCustBusinessApp> findById = custBusinessAppRepository.findById(custBusinessAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return savePreparation(findById.get(), custPreparation);
	}
	
	@Override
	public UICustPreparation savePreparation(UICustPreparation custPreparation) {
		Optional<EOCustBusinessApp> findById = custBusinessAppRepository.findById(custPreparation.getCustBusinessAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return savePreparation(findById.get(), custPreparation);
	}
	
	@Override
	public UICustPreparation savePreparation(EOCustBusinessApp eoBusinessApp,UICustPreparation custPreparation) {
		EOCustPreparation eoPreparation=custPreparationMapper.mapToDAO(custPreparation);
		custPreparationRepository.save(eoPreparation);
		return custPreparationMapper.mapToDTO(eoPreparation);
	}

	@Override
	public UICustPreparation getPreparation(long id) {
		return custPreparationMapper.mapToDTO(custPreparationRepository.getReferenceById(id));
	}

	@Override
	public List<UICustPreparation> getPreparationList(long custBusinessAppId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UICustPreparation getPreparation(long custBusinessAppId, String typeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
