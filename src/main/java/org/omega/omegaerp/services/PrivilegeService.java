package org.omega.omegaerp.services;

import org.omega.omegaerp.dal.PrivilegeRepository;
import org.omega.omegaerp.models.Privilege;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Quatra on 12/26/2018.
 */
@Service
public class PrivilegeService {
    @Autowired
    private PrivilegeRepository privilegeRepository;

    public List<Privilege> getAllPrivileges() {
        return (List<Privilege>) privilegeRepository.findAll();
    }


}
