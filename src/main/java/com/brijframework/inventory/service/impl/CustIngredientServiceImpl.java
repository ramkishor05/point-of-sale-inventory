package com.brijframework.inventory.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.inventory.dto.UICustIngredient;
import com.brijframework.inventory.entities.EOCustBusinessApp;
import com.brijframework.inventory.entities.EOCustIngredient;
import com.brijframework.inventory.mapper.CustIngredientMapper;
import com.brijframework.inventory.repository.CustBusinessAppRepository;
import com.brijframework.inventory.repository.CustIngredientRepository;

@Service
public class CustIngredientServiceImpl implements CustIngredientService {
	
	@Autowired
	CustBusinessAppRepository custBusinessAppRepository;
	
	@Autowired
	CustIngredientRepository custIngredientRepository;
	
	@Autowired
	CustIngredientMapper custIngredientMapper;
	
	@Override
	public UICustIngredient saveIngredient(long custBusinessAppId, UICustIngredient custIngredient) {
		Optional<EOCustBusinessApp> findById = custBusinessAppRepository.findById(custBusinessAppId);
		if(!findById.isPresent()) {
			return null;
		}
		return saveIngredient(findById.get(), custIngredient);
	}
	
	@Override
	public UICustIngredient saveIngredient(UICustIngredient custIngredient) {
		Optional<EOCustBusinessApp> findById = custBusinessAppRepository.findById(custIngredient.getCustBusinessAppId());
		if(!findById.isPresent()) {
			return null;
		}
		return saveIngredient(findById.get(), custIngredient);
	}
	
	@Override
	public UICustIngredient saveIngredient(EOCustBusinessApp custBusinessApp,UICustIngredient custIngredient) {
		EOCustIngredient eoIngredient=custIngredientMapper.mapToDAO(custIngredient);
		custIngredientRepository.save(eoIngredient);
		return custIngredientMapper.mapToDTO(eoIngredient);
	}

	@Override
	public UICustIngredient getIngredient(long id) {
		return custIngredientMapper.mapToDTO(custIngredientRepository.getReferenceById(id));
	}

	@Override
	public List<UICustIngredient> getIngredientList(long custBusinessAppId) {
		return null;
	}

	@Override
	public UICustIngredient getIngredient(long custBusinessAppId, String typeId) {
		return null;
	}

}
