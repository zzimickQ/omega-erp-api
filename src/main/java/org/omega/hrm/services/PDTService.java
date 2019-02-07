package org.omega.hrm.services;

import org.omega.hrm.models.PDTRequests;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class PDTService {

    public abstract List<PDTRequests> getPDTRequests();
    public abstract PDTRequests getPDTRequestForEmp(Integer empId);
    public abstract PDTRequests editPDT(Integer id, PDTRequests pdtRequest );
    public abstract void deletePDT(Integer id);
    public abstract PDTRequests setPDT(Integer empId, PDTRequests pdtRequest);

}