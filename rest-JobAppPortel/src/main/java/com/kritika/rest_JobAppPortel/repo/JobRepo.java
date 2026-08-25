package com.kritika.rest_JobAppPortel.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kritika.rest_JobAppPortel.model.JobPost;


@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

	//List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);


}
