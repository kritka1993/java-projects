package com.kritika.jpa_JobAppPortel.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kritika.jpa_JobAppPortel.model.JobPost;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {
}
