package com.brijframework.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brijframework.inventory.entities.EOCustPreparation;

@Repository
@Transactional
public interface CustPreparationRepository extends JpaRepository<EOCustPreparation, Long>{
	
	List<EOCustPreparation> findAllByCustBusinessAppId(long custBusinessAppId);

	EOCustPreparation findByCustBusinessAppIdAndTypeId(long custBusinessAppId, String typeId);

}
