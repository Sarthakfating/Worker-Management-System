package com.example.jbkplacmentmock1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Worker {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
     private long worker_id;
     private String name;
     private String job_title;
     private String department;
     private double salary;
     
	public Worker() {
		super();
	}

	public Worker(int worker_id, String name, String job_title, String department, long salary) {
		this.worker_id = worker_id;
		this.name = name;
		this.job_title = job_title;
		this.department = department;
		this.salary = salary;
	}

	public long getWorker_id() {
		return worker_id;
	}

	public void setWorker_id(long worker_id) {
		this.worker_id = worker_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Worker [worker_id=" + worker_id + ", name=" + name + ", job_title=" + job_title + ", department="
				+ department + ", salary=" + salary + "]";
	}
	
	
}
