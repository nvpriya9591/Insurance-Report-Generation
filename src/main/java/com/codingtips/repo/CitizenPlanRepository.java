package com.codingtips.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.codingtips.entity.CitizenPlan;

public interface CitizenPlanRepository extends JpaRepository<CitizenPlan, Integer> {
	
/*	@Query("select distinct(planName) from citizenPlan")
	public List<String> getPlaneNames();
	
	@Query("select distinct(planStatus) from citizenPlan")
	public List<String> getplanStatus();
            */
}
