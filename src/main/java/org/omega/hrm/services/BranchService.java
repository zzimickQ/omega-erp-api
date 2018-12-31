package org.omega.hrm.services;

import org.omega.hrm.models.Branch;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Heka on 12/27/2018.
 */
@Service
public abstract class BranchService {

    public abstract Branch creatBranch (Branch branch);

    public abstract Branch editBranch (Integer id, Branch branch);

    public abstract void deleteBranch (Integer id);

    public abstract Branch getBranchById(Integer id);

    public abstract List<Branch> getAllBranch();
}
