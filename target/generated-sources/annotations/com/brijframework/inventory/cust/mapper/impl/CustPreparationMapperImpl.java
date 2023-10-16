package com.brijframework.inventory.cust.mapper.impl;

import com.brijframework.inventory.dto.UICustPreparation;
import com.brijframework.inventory.dto.UIPrepLocation;
import com.brijframework.inventory.entities.EOCustInventoryApp;
import com.brijframework.inventory.entities.EOCustPreparation;
import com.brijframework.inventory.entities.EOCustPreparationLocation;
import com.brijframework.inventory.entities.EOGlobalMediaDetail;
import com.brijframework.inventory.mapper.CustPreparationMapper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-13T22:22:07+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class CustPreparationMapperImpl implements CustPreparationMapper {

    @Override
    public List<EOCustPreparation> mapToDAO(List<UICustPreparation> findAll) {
        if ( findAll == null ) {
            return null;
        }

        List<EOCustPreparation> list = new ArrayList<EOCustPreparation>( findAll.size() );
        for ( UICustPreparation uICustPreparation : findAll ) {
            list.add( mapToDAO( uICustPreparation ) );
        }

        return list;
    }

    @Override
    public List<UICustPreparation> mapToDTO(List<EOCustPreparation> eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        List<UICustPreparation> list = new ArrayList<UICustPreparation>( eoRoleDTO.size() );
        for ( EOCustPreparation eOCustPreparation : eoRoleDTO ) {
            list.add( mapToDTO( eOCustPreparation ) );
        }

        return list;
    }

    @Override
    public EOCustPreparation mapToDAO(UICustPreparation uiCustPreparation) {
        if ( uiCustPreparation == null ) {
            return null;
        }

        EOCustPreparation eOCustPreparation = new EOCustPreparation();

        eOCustPreparation.setCustInventoryApp( uICustPreparationToEOCustInventoryApp( uiCustPreparation ) );
        eOCustPreparation.setGlbImgDetail( uICustPreparationToEOGlobalMediaDetail( uiCustPreparation ) );
        eOCustPreparation.setId( uiCustPreparation.getId() );
        eOCustPreparation.setLogoUrl( uiCustPreparation.getLogoUrl() );
        eOCustPreparation.setIdenNo( uiCustPreparation.getIdenNo() );
        eOCustPreparation.setName( uiCustPreparation.getName() );
        eOCustPreparation.setQnt( uiCustPreparation.getQnt() );
        eOCustPreparation.setCustPreparationLocations( uIPrepLocationListToEOCustPreparationLocationSet( uiCustPreparation.getCustPreparationLocations() ) );

        return eOCustPreparation;
    }

    @Override
    public UICustPreparation mapToDTO(EOCustPreparation eoInvPreparation) {
        if ( eoInvPreparation == null ) {
            return null;
        }

        UICustPreparation uICustPreparation = new UICustPreparation();

        Long id = eoInvPreparationGlbImgDetailId( eoInvPreparation );
        if ( id != null ) {
            uICustPreparation.setGlbImgDetailId( id );
        }
        Long id1 = eoInvPreparationCustInventoryAppId( eoInvPreparation );
        if ( id1 != null ) {
            uICustPreparation.setCustInventoryAppId( id1 );
        }
        if ( eoInvPreparation.getId() != null ) {
            uICustPreparation.setId( eoInvPreparation.getId() );
        }
        uICustPreparation.setIdenNo( eoInvPreparation.getIdenNo() );
        uICustPreparation.setName( eoInvPreparation.getName() );
        uICustPreparation.setLogoUrl( eoInvPreparation.getLogoUrl() );
        if ( eoInvPreparation.getQnt() != null ) {
            uICustPreparation.setQnt( eoInvPreparation.getQnt() );
        }
        uICustPreparation.setCustPreparationLocations( eOCustPreparationLocationSetToUIPrepLocationList( eoInvPreparation.getCustPreparationLocations() ) );

        return uICustPreparation;
    }

    protected EOCustInventoryApp uICustPreparationToEOCustInventoryApp(UICustPreparation uICustPreparation) {
        if ( uICustPreparation == null ) {
            return null;
        }

        EOCustInventoryApp eOCustInventoryApp = new EOCustInventoryApp();

        eOCustInventoryApp.setId( uICustPreparation.getCustInventoryAppId() );

        return eOCustInventoryApp;
    }

    protected EOGlobalMediaDetail uICustPreparationToEOGlobalMediaDetail(UICustPreparation uICustPreparation) {
        if ( uICustPreparation == null ) {
            return null;
        }

        EOGlobalMediaDetail eOGlobalMediaDetail = new EOGlobalMediaDetail();

        eOGlobalMediaDetail.setId( uICustPreparation.getGlbImgDetailId() );

        return eOGlobalMediaDetail;
    }

    protected EOCustPreparationLocation uIPrepLocationToEOCustPreparationLocation(UIPrepLocation uIPrepLocation) {
        if ( uIPrepLocation == null ) {
            return null;
        }

        EOCustPreparationLocation eOCustPreparationLocation = new EOCustPreparationLocation();

        return eOCustPreparationLocation;
    }

    protected Set<EOCustPreparationLocation> uIPrepLocationListToEOCustPreparationLocationSet(List<UIPrepLocation> list) {
        if ( list == null ) {
            return null;
        }

        Set<EOCustPreparationLocation> set = new HashSet<EOCustPreparationLocation>( Math.max( (int) ( list.size() / .75f ) + 1, 16 ) );
        for ( UIPrepLocation uIPrepLocation : list ) {
            set.add( uIPrepLocationToEOCustPreparationLocation( uIPrepLocation ) );
        }

        return set;
    }

    private Long eoInvPreparationGlbImgDetailId(EOCustPreparation eOCustPreparation) {
        if ( eOCustPreparation == null ) {
            return null;
        }
        EOGlobalMediaDetail glbImgDetail = eOCustPreparation.getGlbImgDetail();
        if ( glbImgDetail == null ) {
            return null;
        }
        Long id = glbImgDetail.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long eoInvPreparationCustInventoryAppId(EOCustPreparation eOCustPreparation) {
        if ( eOCustPreparation == null ) {
            return null;
        }
        EOCustInventoryApp custInventoryApp = eOCustPreparation.getCustInventoryApp();
        if ( custInventoryApp == null ) {
            return null;
        }
        Long id = custInventoryApp.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected UIPrepLocation eOCustPreparationLocationToUIPrepLocation(EOCustPreparationLocation eOCustPreparationLocation) {
        if ( eOCustPreparationLocation == null ) {
            return null;
        }

        UIPrepLocation uIPrepLocation = new UIPrepLocation();

        return uIPrepLocation;
    }

    protected List<UIPrepLocation> eOCustPreparationLocationSetToUIPrepLocationList(Set<EOCustPreparationLocation> set) {
        if ( set == null ) {
            return null;
        }

        List<UIPrepLocation> list = new ArrayList<UIPrepLocation>( set.size() );
        for ( EOCustPreparationLocation eOCustPreparationLocation : set ) {
            list.add( eOCustPreparationLocationToUIPrepLocation( eOCustPreparationLocation ) );
        }

        return list;
    }
}
