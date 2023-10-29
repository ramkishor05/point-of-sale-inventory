package com.brijframework.inventory.service.impl;

import java.util.List;

import com.brijframework.inventory.dto.UICustPreparation;
import com.brijframework.inventory.entities.EOCustBusinessApp;

public interface CustPreparationService {

	UICustPreparation savePreparation(long custBusinessAppId, UICustPreparation custPreparation);

	UICustPreparation savePreparation(UICustPreparation custPreparation);

	UICustPreparation savePreparation(EOCustBusinessApp custBusinessApp, UICustPreparation custPreparation);

	UICustPreparation getPreparation(long id);

	List<UICustPreparation> getPreparationList(long custBusinessAppId);

	UICustPreparation getPreparation(long custBusinessAppId, String typeId);

}
