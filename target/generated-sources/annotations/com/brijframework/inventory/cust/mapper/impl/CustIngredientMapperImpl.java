package com.brijframework.inventory.cust.mapper.impl;

import com.brijframework.inventory.dto.UICustIngredient;
import com.brijframework.inventory.entities.EOCustBusinessApp;
import com.brijframework.inventory.entities.EOCustIngredient;
import com.brijframework.inventory.entities.EOCustUnit;
import com.brijframework.inventory.entities.EOGlobalMediaDetail;
import com.brijframework.inventory.mapper.CustIngredientMapper;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-31T18:18:12+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
@Component
public class CustIngredientMapperImpl implements CustIngredientMapper {

    @Override
    public List<EOCustIngredient> mapToDAO(List<UICustIngredient> findAll) {
        if ( findAll == null ) {
            return null;
        }

        List<EOCustIngredient> list = new ArrayList<EOCustIngredient>( findAll.size() );
        for ( UICustIngredient uICustIngredient : findAll ) {
            list.add( mapToDAO( uICustIngredient ) );
        }

        return list;
    }

    @Override
    public List<UICustIngredient> mapToDTO(List<EOCustIngredient> eoRoleDTO) {
        if ( eoRoleDTO == null ) {
            return null;
        }

        List<UICustIngredient> list = new ArrayList<UICustIngredient>( eoRoleDTO.size() );
        for ( EOCustIngredient eOCustIngredient : eoRoleDTO ) {
            list.add( mapToDTO( eOCustIngredient ) );
        }

        return list;
    }

    @Override
    public EOCustIngredient mapToDAO(UICustIngredient uiCustIngredient) {
        if ( uiCustIngredient == null ) {
            return null;
        }

        EOCustIngredient eOCustIngredient = new EOCustIngredient();

        eOCustIngredient.setCustReptUnit( uICustIngredientToEOCustUnit( uiCustIngredient ) );
        eOCustIngredient.setCustBaseUnit( uICustIngredientToEOCustUnit1( uiCustIngredient ) );
        eOCustIngredient.setCustBusinessApp( uICustIngredientToEOCustBusinessApp( uiCustIngredient ) );
        eOCustIngredient.setGlbImgDetail( uICustIngredientToEOGlobalMediaDetail( uiCustIngredient ) );
        eOCustIngredient.setCustCategoryId( uiCustIngredient.getCustCategoryId() );
        eOCustIngredient.setId( uiCustIngredient.getId() );
        eOCustIngredient.setLogoUrl( uiCustIngredient.getLogoUrl() );
        eOCustIngredient.setIdenNo( uiCustIngredient.getIdenNo() );
        eOCustIngredient.setName( uiCustIngredient.getName() );

        return eOCustIngredient;
    }

    @Override
    public UICustIngredient mapToDTO(EOCustIngredient eoCustIngredient) {
        if ( eoCustIngredient == null ) {
            return null;
        }

        UICustIngredient uICustIngredient = new UICustIngredient();

        Long id = eoCustIngredientCustBusinessAppId( eoCustIngredient );
        if ( id != null ) {
            uICustIngredient.setCustBusinessAppId( id );
        }
        Long id1 = eoCustIngredientCustBaseUnitId( eoCustIngredient );
        if ( id1 != null ) {
            uICustIngredient.setCustBaseUnitId( id1 );
        }
        if ( eoCustIngredient.getCustCategoryId() != null ) {
            uICustIngredient.setCustCategoryId( eoCustIngredient.getCustCategoryId() );
        }
        Long id2 = eoCustIngredientGlbImgDetailId( eoCustIngredient );
        if ( id2 != null ) {
            uICustIngredient.setGlbImgDetailId( id2 );
        }
        Long id3 = eoCustIngredientCustReptUnitId( eoCustIngredient );
        if ( id3 != null ) {
            uICustIngredient.setCustReptUnitId( id3 );
        }
        if ( eoCustIngredient.getId() != null ) {
            uICustIngredient.setId( eoCustIngredient.getId() );
        }
        uICustIngredient.setIdenNo( eoCustIngredient.getIdenNo() );
        uICustIngredient.setName( eoCustIngredient.getName() );
        uICustIngredient.setLogoUrl( eoCustIngredient.getLogoUrl() );

        return uICustIngredient;
    }

    protected EOCustUnit uICustIngredientToEOCustUnit(UICustIngredient uICustIngredient) {
        if ( uICustIngredient == null ) {
            return null;
        }

        EOCustUnit eOCustUnit = new EOCustUnit();

        eOCustUnit.setId( uICustIngredient.getCustReptUnitId() );

        return eOCustUnit;
    }

    protected EOCustUnit uICustIngredientToEOCustUnit1(UICustIngredient uICustIngredient) {
        if ( uICustIngredient == null ) {
            return null;
        }

        EOCustUnit eOCustUnit = new EOCustUnit();

        eOCustUnit.setId( uICustIngredient.getCustBaseUnitId() );

        return eOCustUnit;
    }

    protected EOCustBusinessApp uICustIngredientToEOCustBusinessApp(UICustIngredient uICustIngredient) {
        if ( uICustIngredient == null ) {
            return null;
        }

        EOCustBusinessApp eOCustBusinessApp = new EOCustBusinessApp();

        eOCustBusinessApp.setId( uICustIngredient.getCustBusinessAppId() );

        return eOCustBusinessApp;
    }

    protected EOGlobalMediaDetail uICustIngredientToEOGlobalMediaDetail(UICustIngredient uICustIngredient) {
        if ( uICustIngredient == null ) {
            return null;
        }

        EOGlobalMediaDetail eOGlobalMediaDetail = new EOGlobalMediaDetail();

        eOGlobalMediaDetail.setId( uICustIngredient.getGlbImgDetailId() );

        return eOGlobalMediaDetail;
    }

    private Long eoCustIngredientCustBusinessAppId(EOCustIngredient eOCustIngredient) {
        if ( eOCustIngredient == null ) {
            return null;
        }
        EOCustBusinessApp custBusinessApp = eOCustIngredient.getCustBusinessApp();
        if ( custBusinessApp == null ) {
            return null;
        }
        Long id = custBusinessApp.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long eoCustIngredientCustBaseUnitId(EOCustIngredient eOCustIngredient) {
        if ( eOCustIngredient == null ) {
            return null;
        }
        EOCustUnit custBaseUnit = eOCustIngredient.getCustBaseUnit();
        if ( custBaseUnit == null ) {
            return null;
        }
        Long id = custBaseUnit.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long eoCustIngredientGlbImgDetailId(EOCustIngredient eOCustIngredient) {
        if ( eOCustIngredient == null ) {
            return null;
        }
        EOGlobalMediaDetail glbImgDetail = eOCustIngredient.getGlbImgDetail();
        if ( glbImgDetail == null ) {
            return null;
        }
        Long id = glbImgDetail.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long eoCustIngredientCustReptUnitId(EOCustIngredient eOCustIngredient) {
        if ( eOCustIngredient == null ) {
            return null;
        }
        EOCustUnit custReptUnit = eOCustIngredient.getCustReptUnit();
        if ( custReptUnit == null ) {
            return null;
        }
        Long id = custReptUnit.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
