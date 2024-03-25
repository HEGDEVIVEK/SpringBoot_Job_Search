package com.code.SpringBoot_mongodb.Controller;

import com.code.SpringBoot_mongodb.Model.JobDetail;
import com.code.SpringBoot_mongodb.Repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    private JobRepository jobRepository;

    @GetMapping("/home")
    public String home()
    {
        return "welcome to job portal";
    }

    @GetMapping("/getJob")
    public List<JobDetail> getDetail()
    {
        return jobRepository.findAll();
    }

    @PostMapping("/postJob")
    public void postJob(@RequestBody JobDetail jobDetail)
    {
        jobRepository.save(jobDetail);
    }

    @GetMapping("/search/{text}")
    public List<JobDetail> search(@PathVariable String text)
    {
           return jobRepository.findByProfileContainingIgnoreCaseOrDescContainingIgnoreCaseOrTechsContainingIgnoreCase(text,text,text);
    }
    @GetMapping("/psearch/{text}")
    public List<JobDetail> psearch(@PathVariable String text)
    {
        return jobRepository.findByProfileContainingIgnoreCaseAndDescContainingIgnoreCaseAndTechsContainingIgnoreCase(text,text,text);
    }

    @DeleteMapping("/deleteJob")
    public void deleteJob()
    {
        jobRepository.deleteAll();
    }
}
