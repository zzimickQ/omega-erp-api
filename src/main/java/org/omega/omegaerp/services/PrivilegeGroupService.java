package org.omega.omegaerp.services;

import org.omega.omegaerp.dal.PrivilegeGroupRepository;
import org.omega.omegaerp.dal.PrivilegeRepository;
import org.omega.omegaerp.models.Privilege;
import org.omega.omegaerp.models.PrivilegeGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by Quatra on 12/26/2018.
 */
@Service
public class PrivilegeGroupService {

    @Autowired
    private PrivilegeRepository pRepo;

    @Autowired
    private PrivilegeGroupRepository pgRepo;


    public void addPrivilegeToPrivilegeGroup(Integer privilegeGroupID, Integer privilegeID) {
        Optional<PrivilegeGroup> group = pgRepo.findById(privilegeGroupID);
        Optional<Privilege> privilege = pRepo.findById(privilegeID);
        if (group.isPresent() && privilege.isPresent()) {
            group.get().getPrivileges().add(privilege.get());
        } else {
            // Privilege or Privilege Group Not Found
            // handle with throw
        }
    }

    public void removePrivilegeFromPrivilegeGroup(Integer privilegeGroupID, Integer privilegeID) {
        Optional<PrivilegeGroup> group = pgRepo.findById(privilegeGroupID);
        Optional<Privilege> privilege = pRepo.findById(privilegeID);
        if (group.isPresent() && privilege.isPresent()) {
            Integer index = group.get().getPrivileges().indexOf(privilege.get());
            group.get().getPrivileges().remove(index.intValue());
        } else {
            // Privilege or Privilege Group Not Found
            // handle with throw
        }
    }

    public boolean checkIfPrivilegeGroupExistsByName(String name) {
        Optional<PrivilegeGroup> privilegeGroupP = pgRepo.findByName(name);
        return privilegeGroupP.isPresent();
    }

    public void createPrivilegeGroup(PrivilegeGroup privilegeGroup) {
        privilegeGroup.setId(null);
        if (pgRepo.existsByName(privilegeGroup.getName()))
            pgRepo.save(privilegeGroup);
    }

    public void deletePrivilegeGroup(PrivilegeGroup privilegeGroup) {
        pgRepo.delete(privilegeGroup);
    }

    public void updatePrivilegeGroup(PrivilegeGroup privilegeGroup) {
        if (pgRepo.existsByName(privilegeGroup.getName()))
            pgRepo.save(privilegeGroup);
    }

}
