package com.cenpros.demo.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cenpros.demo.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
