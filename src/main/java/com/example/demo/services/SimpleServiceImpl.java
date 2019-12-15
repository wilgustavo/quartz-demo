package com.example.demo.services;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import lombok.extern.java.Log;

@Service
@Log
public class SimpleServiceImpl implements SimpleService {

	@Override
	public void processData() {
		log.info("Ping!!!" + LocalDateTime.now());
	}

}
