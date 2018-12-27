package org.omega.omegaerp.services;

import org.omega.omegaerp.dal.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * Created by Kass on 12/26/2018.
 */
@Service
public class User {
    @Autowired
    private UserRepository userRepository;
    public Iterable<org.omega.omegaerp.models.User> getAll() {
        return userRepository.findAll();
    }
}
