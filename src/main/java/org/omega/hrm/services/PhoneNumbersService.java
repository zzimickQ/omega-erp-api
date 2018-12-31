package org.omega.hrm.services;

import org.omega.hrm.models.PhoneNumbers;
import org.springframework.stereotype.Service;

/**
 * Created by Kass on 12/31/2018.
 */
@Service
public abstract class PhoneNumbersService {

    public abstract PhoneNumbers getPhoneNumbers();

    public abstract void deletePhoneNumber(Integer id);

    public abstract PhoneNumbers createPhoneNumber(PhoneNumbers phoneNumbers);


}
