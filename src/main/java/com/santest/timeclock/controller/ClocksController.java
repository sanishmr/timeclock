package com.santest.timeclock.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.santest.timeclock.models.Clock;
import com.santest.timeclock.repositories.ClockRepository;

@RestController
@RequestMapping("/api/v1/clocks")
public class ClocksController {
	
	@Autowired
	private ClockRepository clockRepository;
	
	
	@GetMapping
	public List<Clock> list(){
//		List<Clock> clocks = new ArrayList<>();
//		return clocks;
		return clockRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Clock clock) {
		
		clockRepository.save(clock);
	}

	@GetMapping("/{id}")
	public Clock get(@PathVariable("id") long id ) {
		//return new Clock();
		return clockRepository.getOne(id);
	}

}
