package com.brijframework.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.inventory.entities.EOCustStorage;

@Repository
@Transactional
public interface CustStorageRepository extends JpaRepository<EOCustStorage, Long>{
	
	EOCustStorage findOneByTypeId(String typeId);

	List<EOCustStorage> findAllByCustInventoryAppId(long custInventoryAppId);

	EOCustStorage findByCustInventoryAppIdAndTypeId(long custInventoryAppId, String typeId);

}
