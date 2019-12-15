package com.example.demo.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.services.SimpleService;

public class SimpleJob implements Job {

	@Autowired
	private SimpleService simpleService;

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		simpleService.processData();
	}

}
