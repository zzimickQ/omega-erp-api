package org.omega.hrm.controllers.readers;

import org.omega.hrm.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hrm")
public class AddressControllerReader {
    @Autowired
    private AddressService addressService;

    @RequestMapping(value = "/address/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getAddresses(@PathVariable Integer id){
        return ResponseEntity.ok (addressService.getAddressforEmployee(id));

    }
}
