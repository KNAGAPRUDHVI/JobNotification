package com.ust.JobNotifications.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ust.JobNotifications.model.Jobnotification;

public interface JobRepository extends JpaRepository<Jobnotification, Long> {

}
