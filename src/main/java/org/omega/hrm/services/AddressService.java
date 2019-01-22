package org.omega.hrm.services;

import org.omega.hrm.models.Address;
import org.springframework.stereotype.Service;

/**
 * Created by Kass on 12/30/2018.
 */
@Service
public abstract class AddressService {

    public abstract Address editAddress(Integer id , Address address);

    public abstract Address createAddress(Address address);

    public abstract void deleteAddress(Integer id);

    public abstract Address getAddress();

}
