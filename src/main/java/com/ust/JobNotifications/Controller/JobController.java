package com.ust.JobNotifications.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ust.JobNotifications.model.Jobnotification;
import com.ust.JobNotifications.repo.JobRepository;
import com.ust.JobNotifications.service.JobService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/jobs")
public class JobController {
    @Autowired
    private JobService jobNotificationService;

    @PostMapping
    public Jobnotification createJob(@RequestBody Jobnotification jobNotification) {
        return jobNotificationService.addJob(jobNotification);
    }

    @GetMapping
    public List<Jobnotification> getAllJobs() {
        return jobNotificationService.getAllJobs();
    }

}
