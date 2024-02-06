package com.brijframework.inventory.cust.mapper.impl;

import com.brijframework.inventory.dto.UICustLocation;
import com.brijframework.inventory.entities.EOCustBusinessApp;
import com.brijframework.inventory.entities.EOCustLocation;
import com.brijframework.inventory.entities.EOCustStorage;
import com.brijframework.inventory.mapper.CustLocationMapper;
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
public class CustLocationMapperImpl implements CustLocationMapper {

    @Override
    public List<EOCustLocation> mapToDAO(List<UICustLocation> findAll) {
        if ( findAll == null ) {
            return null;
        }

        List<EOCustLocation> list = new ArrayList<EOCustLocation>( findAll.size() );
        for ( UICustLocation uICustLocation : findAll ) {
            list.add( mapToDAO( uICustLocation ) );
        }

        return list;
    }

    @Override
    public List<UICustLocation> mapToDTO(List<EOCustLocation> eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        List<UICustLocation> list = new ArrayList<UICustLocation>( eoRoleDTO.size() );
        for ( EOCustLocation eOCustLocation : eoRoleDTO ) {
            list.add( mapToDTO( eOCustLocation ) );
        }

        return list;
    }

    @Override
    public EOCustLocation mapToDAO(UICustLocation uiCustLocation) {
        if ( uiCustLocation == null ) {
            return null;
        }

        EOCustLocation eOCustLocation = new EOCustLocation();

        eOCustLocation.setCustStorage( uICustLocationToEOCustStorage( uiCustLocation ) );
        eOCustLocation.setCustBusinessApp( uICustLocationToEOCustBusinessApp( uiCustLocation ) );
        eOCustLocation.setId( uiCustLocation.getId() );
        eOCustLocation.setOrderSequence( uiCustLocation.getOrderSequence() );
        eOCustLocation.setName( uiCustLocation.getName() );
        eOCustLocation.setTypeId( uiCustLocation.getTypeId() );

        return eOCustLocation;
    }

    @Override
    public UICustLocation mapToDTO(EOCustLocation eoCustLocation) {
        if ( eoCustLocation == null ) {
            return null;
        }

        UICustLocation uICustLocation = new UICustLocation();

        Long id = eoCustLocationCustStorageId( eoCustLocation );
        if ( id != null ) {
            uICustLocation.setCustStorageId( id );
        }
        Long id1 = eoCustLocationCustBusinessAppId( eoCustLocation );
        if ( id1 != null ) {
            uICustLocation.setCustBusinessAppId( id1 );
        }
        if ( eoCustLocation.getId() != null ) {
            uICustLocation.setId( eoCustLocation.getId() );
        }
        uICustLocation.setName( eoCustLocation.getName() );
        uICustLocation.setTypeId( eoCustLocation.getTypeId() );
        if ( eoCustLocation.getOrderSequence() != null ) {
            uICustLocation.setOrderSequence( eoCustLocation.getOrderSequence() );
        }

        return uICustLocation;
    }

    protected EOCustStorage uICustLocationToEOCustStorage(UICustLocation uICustLocation) {
        if ( uICustLocation == null ) {
            return null;
        }

        EOCustStorage eOCustStorage = new EOCustStorage();

        eOCustStorage.setId( uICustLocation.getCustStorageId() );

        return eOCustStorage;
    }

    protected EOCustBusinessApp uICustLocationToEOCustBusinessApp(UICustLocation uICustLocation) {
        if ( uICustLocation == null ) {
            return null;
        }

        EOCustBusinessApp eOCustBusinessApp = new EOCustBusinessApp();

        eOCustBusinessApp.setId( uICustLocation.getCustBusinessAppId() );

        return eOCustBusinessApp;
    }

    private Long eoCustLocationCustStorageId(EOCustLocation eOCustLocation) {
        if ( eOCustLocation == null ) {
            return null;
        }
        EOCustStorage custStorage = eOCustLocation.getCustStorage();
        if ( custStorage == null ) {
            return null;
        }
        Long id = custStorage.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long eoCustLocationCustBusinessAppId(EOCustLocation eOCustLocation) {
        if ( eOCustLocation == null ) {
            return null;
        }
        EOCustBusinessApp custBusinessApp = eOCustLocation.getCustBusinessApp();
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
