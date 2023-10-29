package com.brijframework.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.inventory.entities.EOCustLocation;

@Repository
@Transactional
public interface CustLocationRepository extends JpaRepository<EOCustLocation, Long>{
	
	EOCustLocation findOneByCustBusinessAppIdAndTypeId(long custBusinessAppId, String typeId);

	List<EOCustLocation> findAllByCustBusinessAppId(long custBusinessAppId);

	EOCustLocation findByCustBusinessAppIdAndTypeId(long custBusinessAppId, String typeId);

}
