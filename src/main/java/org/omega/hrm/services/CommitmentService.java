package org.omega.hrm.services;

import org.omega.hrm.models.Commitment;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Heka on 12/27/2018.
 */
@Service
public abstract class CommitmentService {

    public abstract Commitment creatCommitment(Commitment commitment);

    public abstract Commitment editCommitment (Integer id, Commitment commitment);

    public abstract void deleteCommitment (Integer id);

    public abstract Commitment getCommitmentById(Integer id);

    public abstract List<Commitment> getAllCommitment();

    public abstract List<Commitment> getCommitmentsForEmployee(String empId);



}
