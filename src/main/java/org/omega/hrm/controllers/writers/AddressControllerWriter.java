package org.omega.hrm.controllers.writers;

import org.omega.hrm.models.Address;
import org.omega.hrm.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hrm")
public class AddressControllerWriter {
    @Autowired
    private AddressService addressService;

    @RequestMapping(value = "/address", method = RequestMethod.POST)
    public ResponseEntity<?> createAddress(@RequestBody Address address){
        return ResponseEntity.ok(addressService.createAddress(address));
    }

    @RequestMapping(value = "/address/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> editAddress
            (@PathVariable Integer id, @RequestBody Address address){
        return ResponseEntity.ok(addressService.editAddress(id, address));

    }

    @RequestMapping(value = "/address/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteAddress(@PathVariable Integer id){
        addressService.deleteAddress(id);
        return ResponseEntity.ok().build();
    }

}
