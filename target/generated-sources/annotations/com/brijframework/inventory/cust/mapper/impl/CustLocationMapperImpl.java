package com.brijframework.inventory.cust.mapper.impl;

import com.brijframework.inventory.dto.UICustLocation;
import com.brijframework.inventory.entities.EOCustInventoryApp;
import com.brijframework.inventory.entities.EOCustLocation;
import com.brijframework.inventory.entities.EOCustStorage;
import com.brijframework.inventory.mapper.CustLocationMapper;
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

        eOCustLocation.setCustInventoryApp( uICustLocationToEOCustInventoryApp( uiCustLocation ) );
        eOCustLocation.setCustStorage( uICustLocationToEOCustStorage( uiCustLocation ) );
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
        Long id1 = eoCustLocationCustInventoryAppId( eoCustLocation );
        if ( id1 != null ) {
            uICustLocation.setCustInventoryAppId( id1 );
        }
        if ( eoCustLocation.getId() != null ) {
            uICustLocation.setId( eoCustLocation.getId() );
        }
        if ( eoCustLocation.getOrderSequence() != null ) {
            uICustLocation.setOrderSequence( eoCustLocation.getOrderSequence() );
        }
        uICustLocation.setName( eoCustLocation.getName() );
        uICustLocation.setTypeId( eoCustLocation.getTypeId() );

        return uICustLocation;
    }

    protected EOCustInventoryApp uICustLocationToEOCustInventoryApp(UICustLocation uICustLocation) {
        if ( uICustLocation == null ) {
            return null;
        }

        EOCustInventoryApp eOCustInventoryApp = new EOCustInventoryApp();

        eOCustInventoryApp.setId( uICustLocation.getCustInventoryAppId() );

        return eOCustInventoryApp;
    }

    protected EOCustStorage uICustLocationToEOCustStorage(UICustLocation uICustLocation) {
        if ( uICustLocation == null ) {
            return null;
        }

        EOCustStorage eOCustStorage = new EOCustStorage();

        eOCustStorage.setId( uICustLocation.getCustStorageId() );

        return eOCustStorage;
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

    private Long eoCustLocationCustInventoryAppId(EOCustLocation eOCustLocation) {
        if ( eOCustLocation == null ) {
            return null;
        }
        EOCustInventoryApp custInventoryApp = eOCustLocation.getCustInventoryApp();
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
