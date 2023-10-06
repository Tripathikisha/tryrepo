package com.geekster.Job.Service;

import com.geekster.Job.Repo.JobRepo;
import com.geekster.Job.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Service;

@Service
public class JobService {
    @Autowired
    JobRepo repojob;
    public String repoJob(List<Job> newJob) {

        repojob.saveAll(newJob);
        return "added";
    }

    public List<Job> getAllJobs() {
        return (List<Job>) repojob.findAll();
    }

    public String removeJobbySalary(Double salary) {

        repojob.deleteBySalary(salary);
        return "deleted";
    }

}
