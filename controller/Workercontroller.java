package com.example.jbkplacmentmock1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jbkplacmentmock1.entity.Worker;
import com.example.jbkplacmentmock1.service.WorkerService;

@RestController
@RequestMapping("/worker")
public class Workercontroller {
	
	@Autowired
	private WorkerService workerService;
    
	@PostMapping("/create")
	public ResponseEntity<Worker> createWorker(@RequestBody Worker worker) {
		 workerService.createWorker(worker);
		 return new ResponseEntity<>(worker, HttpStatus.CREATED);
	}
	
	@GetMapping("/{Id}")
	public ResponseEntity<Worker> getWorkerbyId(@PathVariable Long Id) {
		Worker worker=workerService.getWorkerbyId(Id);
		if(worker!=null) {
			return new ResponseEntity<>(worker,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}	
	}
	
	 @GetMapping("/getall")
	    public ResponseEntity<List<Worker>> getAllWorkers() {
	        List<Worker> worker= workerService.getAllWorker();
	        if(worker!=null) {
				return new ResponseEntity<>(worker,HttpStatus.OK);
			}
			else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}	
	    }
	
	 @PutMapping("/{id}")
	    public ResponseEntity<Worker> updateWorker(@PathVariable Long id, @RequestBody Worker updatedWorker) {
	        Worker worker=workerService.updateWorker(id, updatedWorker);
	        if(worker!=null) {
				return new ResponseEntity<>(worker,HttpStatus.OK);
			}
			else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}	
	    }

	    @DeleteMapping("/{id}")
	    public void deleteWorker(@PathVariable Long id) {
	        workerService.deleteWorker(id);
	    }
}
