package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
	 List<Task> findByCompletedTrue();
	 List<Task> findByCompletedFalse();
}
