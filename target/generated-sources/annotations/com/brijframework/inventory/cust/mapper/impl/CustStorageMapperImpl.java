package com.brijframework.inventory.cust.mapper.impl;

import com.brijframework.inventory.dto.UICustStorage;
import com.brijframework.inventory.entities.EOCustInventoryApp;
import com.brijframework.inventory.entities.EOCustStorage;
import com.brijframework.inventory.mapper.CustStorageMapper;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-13T22:22:08+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class CustStorageMapperImpl implements CustStorageMapper {

    @Override
    public List<EOCustStorage> mapToDAO(List<UICustStorage> findAll) {
        if ( findAll == null ) {
            return null;
        }

        List<EOCustStorage> list = new ArrayList<EOCustStorage>( findAll.size() );
        for ( UICustStorage uICustStorage : findAll ) {
            list.add( mapToDAO( uICustStorage ) );
        }

        return list;
    }

    @Override
    public List<UICustStorage> mapToDTO(List<EOCustStorage> eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        List<UICustStorage> list = new ArrayList<UICustStorage>( eoRoleDTO.size() );
        for ( EOCustStorage eOCustStorage : eoRoleDTO ) {
            list.add( mapToDTO( eOCustStorage ) );
        }

        return list;
    }

    @Override
    public EOCustStorage mapToDAO(UICustStorage uiStorage) {
        if ( uiStorage == null ) {
            return null;
        }

        EOCustStorage eOCustStorage = new EOCustStorage();

        eOCustStorage.setCustInventoryApp( uICustStorageToEOCustInventoryApp( uiStorage ) );
        eOCustStorage.setId( uiStorage.getId() );
        eOCustStorage.setName( uiStorage.getName() );
        eOCustStorage.setTypeId( uiStorage.getTypeId() );

        return eOCustStorage;
    }

    @Override
    public UICustStorage mapToDTO(EOCustStorage eoInvStorage) {
        if ( eoInvStorage == null ) {
            return null;
        }

        UICustStorage uICustStorage = new UICustStorage();

        Long id = eoInvStorageCustInventoryAppId( eoInvStorage );
        if ( id != null ) {
            uICustStorage.setCustInventoryAppId( id );
        }
        if ( eoInvStorage.getId() != null ) {
            uICustStorage.setId( eoInvStorage.getId() );
        }
        uICustStorage.setName( eoInvStorage.getName() );
        uICustStorage.setTypeId( eoInvStorage.getTypeId() );

        return uICustStorage;
    }

    protected EOCustInventoryApp uICustStorageToEOCustInventoryApp(UICustStorage uICustStorage) {
        if ( uICustStorage == null ) {
            return null;
        }

        EOCustInventoryApp eOCustInventoryApp = new EOCustInventoryApp();

        eOCustInventoryApp.setId( uICustStorage.getCustInventoryAppId() );

        return eOCustInventoryApp;
    }

    private Long eoInvStorageCustInventoryAppId(EOCustStorage eOCustStorage) {
        if ( eOCustStorage == null ) {
            return null;
        }
        EOCustInventoryApp custInventoryApp = eOCustStorage.getCustInventoryApp();
        if ( custInventoryApp == null ) {
            return null;
        }
        Long id = custInventoryApp.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
