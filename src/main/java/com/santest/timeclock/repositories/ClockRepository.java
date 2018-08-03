package com.santest.timeclock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santest.timeclock.models.Clock;

public interface ClockRepository extends JpaRepository<Clock, Long> {

}
