package com.ust.JobNotifications.service;

import com.ust.JobNotifications.model.Jobnotification;
import com.ust.JobNotifications.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    @Autowired
    private JobRepository jobRepository;

    public Jobnotification addJob(Jobnotification jobNotification) {
        return jobRepository.save(jobNotification);
    }

    public List<Jobnotification> getAllJobs() {
        return jobRepository.findAll();
    }

}
