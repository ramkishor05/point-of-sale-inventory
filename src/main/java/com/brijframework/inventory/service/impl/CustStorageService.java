package com.brijframework.inventory.service.impl;

import java.util.List;

import com.brijframework.inventory.dto.UICustStorage;
import com.brijframework.inventory.entities.EOCustBusinessApp;

public interface CustStorageService {

	UICustStorage saveStorage(long custBusinessAppId, UICustStorage custStorage);

	UICustStorage saveStorage(UICustStorage custStorage);

	UICustStorage saveStorage(EOCustBusinessApp custBusinessApp, UICustStorage custStorage);

	UICustStorage getStorage(long id);

	List<UICustStorage> getStorageList(long custBusinessAppId);

	UICustStorage getStorage(long custBusinessAppId, String typeId);

}
