package com.ust.JobNotifications.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="jobnotification")

public class Jobnotification {
	
	@Id
	private Long jobId;
	private String jobTitle;
	private String description;
	private String location;
	private double salary;


}
