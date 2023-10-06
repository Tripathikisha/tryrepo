package com.geekster.Job.Controler;

import com.geekster.Job.Job;
import com.geekster.Job.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobControler {
    @Autowired
   JobService jobservice;
    @PostMapping("jobs")
    public String addJobs(@RequestBody List<Job> newJobs)
    {
        return jobservice.addJobs(newJobs);
    }

    @GetMapping("jobs")
    public List<Job> getAllJobs()
    {
        return jobservice.getAllJobs();
    }

//    @DeleteMapping("salary/id/{id}")
//    public String removeStockById(@PathVariable Long id)
//    {
//        return stockService.removeStockById(id);
//    }

}
