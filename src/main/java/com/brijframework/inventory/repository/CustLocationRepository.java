package com.brijframework.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.inventory.entities.EOCustLocation;

@Repository
@Transactional
public interface CustLocationRepository extends JpaRepository<EOCustLocation, Long>{
	
	EOCustLocation findOneByCustInventoryAppIdAndTypeId(long custInventoryAppId, String typeId);

	List<EOCustLocation> findAllByCustInventoryAppId(long custInventoryAppId);

	EOCustLocation findByCustInventoryAppIdAndTypeId(long custInventoryAppId, String typeId);

}
