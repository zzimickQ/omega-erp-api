package org.omega.hrm.services;

import org.omega.hrm.models.Address;

import javax.persistence.Entity;

/**
 * Created by Kass on 12/30/2018.
 */
@Entity
public abstract class AddressService {

    public abstract Address editAddress(Integer id , Address address);

    public abstract Address createaddress(Address address);

    public abstract void deleteAddress(Integer id);

    public abstract Address getAddress();

}
