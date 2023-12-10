package com.example.jbkplacmentmock1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jbkplacmentmock1.entity.Worker;
import com.example.jbkplacmentmock1.repository.WorkerRepository;

@Service
public class WorkerService {
	
	@Autowired
	private WorkerRepository workerRepository;
	
	public Worker createWorker(Worker worker) {
		return workerRepository.save(worker);
	}
 
	public Worker getWorkerbyId(Long id) {
		return workerRepository.findById(id).orElse(null);
	}
	
	public List<Worker> getAllWorker() {
		return workerRepository.findAll();
	}
	
	public Worker updateWorker(Long id,Worker updatedWorker) {
		if(workerRepository.existsById(id)) {
			updatedWorker.setWorker_id(id);
			return workerRepository.save(updatedWorker);
		}
		return null;
	}
	
	public void deleteWorker(Long id) {
		workerRepository.deleteById(id);
	}
}
