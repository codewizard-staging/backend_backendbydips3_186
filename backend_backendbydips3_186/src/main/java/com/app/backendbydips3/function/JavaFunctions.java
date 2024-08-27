package com.app.backendbydips3.function;

import com.app.backendbydips3.model.Organization;
import com.app.backendbydips3.model.EmployeePersonalInfo;
import com.app.backendbydips3.model.EmlpoyeeProfile;
import com.app.backendbydips3.enums.EmploymentType;
import com.app.backendbydips3.enums.OrgDept;
import com.app.backendbydips3.enums.OrgBranch;
import com.app.backendbydips3.converter.OrgBranchConverter;
import com.app.backendbydips3.converter.EmploymentTypeConverter;
import com.app.backendbydips3.converter.OrgDeptConverter;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.backendbydips3.repository.OrganizationRepository;
import com.app.backendbydips3.repository.EmployeePersonalInfoRepository;
import com.app.backendbydips3.repository.EmlpoyeeProfileRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
