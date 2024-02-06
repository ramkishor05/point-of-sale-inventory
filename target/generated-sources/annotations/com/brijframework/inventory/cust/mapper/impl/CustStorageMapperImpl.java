package com.brijframework.inventory.cust.mapper.impl;

import com.brijframework.inventory.dto.UICustStorage;
import com.brijframework.inventory.entities.EOCustBusinessApp;
import com.brijframework.inventory.entities.EOCustStorage;
import com.brijframework.inventory.mapper.CustStorageMapper;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-06T22:26:35+0530",
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

        eOCustStorage.setCustBusinessApp( uICustStorageToEOCustBusinessApp( uiStorage ) );
        eOCustStorage.setId( uiStorage.getId() );
        eOCustStorage.setOrderSequence( uiStorage.getOrderSequence() );
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

        Long id = eoInvStorageCustBusinessAppId( eoInvStorage );
        if ( id != null ) {
            uICustStorage.setCustBusinessAppId( id );
        }
        if ( eoInvStorage.getId() != null ) {
            uICustStorage.setId( eoInvStorage.getId() );
        }
        uICustStorage.setName( eoInvStorage.getName() );
        uICustStorage.setTypeId( eoInvStorage.getTypeId() );
        if ( eoInvStorage.getOrderSequence() != null ) {
            uICustStorage.setOrderSequence( eoInvStorage.getOrderSequence() );
        }

        return uICustStorage;
    }

    protected EOCustBusinessApp uICustStorageToEOCustBusinessApp(UICustStorage uICustStorage) {
        if ( uICustStorage == null ) {
            return null;
        }

        EOCustBusinessApp eOCustBusinessApp = new EOCustBusinessApp();

        eOCustBusinessApp.setId( uICustStorage.getCustBusinessAppId() );

        return eOCustBusinessApp;
    }

    private Long eoInvStorageCustBusinessAppId(EOCustStorage eOCustStorage) {
        if ( eOCustStorage == null ) {
            return null;
        }
        EOCustBusinessApp custBusinessApp = eOCustStorage.getCustBusinessApp();
        if ( custBusinessApp == null ) {
            return null;
        }
        Long id = custBusinessApp.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
