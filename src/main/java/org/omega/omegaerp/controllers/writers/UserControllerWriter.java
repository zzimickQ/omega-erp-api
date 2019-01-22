package org.omega.omegaerp.controllers.writers;

import org.omega.omegaerp.dal.UserRepository;
import org.omega.omegaerp.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kass on 12/26/2018.
 */
@RestController
@RequestMapping("/api/user")
public class UserControllerWriter {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }


=======
@RequestMapping
public class UserControllerWriter {

>>>>>>> origin/master

}
