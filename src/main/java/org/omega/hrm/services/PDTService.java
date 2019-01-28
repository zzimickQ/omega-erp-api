package org.omega.hrm.services;

import org.omega.hrm.models.PDTRequests;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public abstract class PDTService {

    public abstract List<PDTRequests> getPDTRequests();
    public abstract PDTRequests getPDTRequestForEmp(String empId);
    public abstract PDTRequests editPDT(Integer id);
    public abstract void deletePDT(Integer id);
    public abstract PDTRequests setPDT(PDTRequests pdtRequest);

}
