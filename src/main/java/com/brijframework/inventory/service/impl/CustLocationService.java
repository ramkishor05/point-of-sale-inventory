package com.brijframework.inventory.service.impl;

import java.util.List;

import com.brijframework.inventory.dto.UICustLocation;
import com.brijframework.inventory.entities.EOCustBusinessApp;

public interface CustLocationService {

	UICustLocation saveLocation(long custBusinessAppId, UICustLocation Location);

	UICustLocation saveLocation(UICustLocation Location);

	UICustLocation saveLocation(EOCustBusinessApp custBusinessApp, UICustLocation Location);

	UICustLocation getLocation(long id);

	List<UICustLocation> getLocationList(long custBusinessAppId);

	UICustLocation getLocation(long custBusinessAppId, String typeId);

}
