package com.code.SpringBoot_mongodb.Repository;

import com.code.SpringBoot_mongodb.Model.JobDetail;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface JobRepository extends MongoRepository<JobDetail,Long>
{

    List<JobDetail> findByProfileContainingIgnoreCaseOrDescContainingIgnoreCaseOrTechsContainingIgnoreCase(String text, String text1, String text2);

    List<JobDetail> findByProfileContainingIgnoreCaseAndDescContainingIgnoreCaseAndTechsContainingIgnoreCase(String text, String text1, String text2);
}
