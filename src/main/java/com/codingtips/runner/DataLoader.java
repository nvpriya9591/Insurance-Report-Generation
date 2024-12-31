package com.codingtips.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.codingtips.entity.CitizenPlan;
import com.codingtips.repo.CitizenPlanRepository;

@Component
public class DataLoader implements ApplicationRunner{

	@Autowired
    private CitizenPlanRepository repo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		repo.deleteAll();/* we will not writing this line if we run the project 10 times 10 times records will be inserted
		                     when we call this method existing table records deleted and again the below records inserted*/
		CitizenPlan c1 = new CitizenPlan();
		c1.setCitizenName("john");
		c1.setGeneder("male");
		c1.setPlanName("cash");
		c1.setPlanStatus("Approved");
		c1.setPlanStartDate(LocalDate.now());
		c1.setPlanEndDate(LocalDate.now().plusMonths(6));
		c1.setBenefitAmt(5000.00);
		
		CitizenPlan c2 = new CitizenPlan();
		c2.setCitizenName("smith");
		c2.setGeneder("male");
		c2.setPlanName("cash");
		c2.setPlanStatus("Denied");
		c2.setDenialReason("Property Income");
		
		CitizenPlan c3 = new CitizenPlan();
		c3.setCitizenName("Hansi");
		c3.setGeneder("female");
		c3.setPlanName("cash");
		c3.setPlanStatus("Terminated");
		c3.setPlanStartDate(LocalDate.now().minusMonths(4));
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenefitAmt(4679.00);
		c3.setTerminateDate(LocalDate.now());
		c3.setTerminationRsn("Gov Job");
		
		CitizenPlan c4 = new CitizenPlan();
		c4.setCitizenName("sravani");
		c4.setGeneder("female");
		c4.setPlanName("food");
		c4.setPlanStatus("Approved");
		c4.setPlanStartDate(LocalDate.now());
		c4.setPlanEndDate(LocalDate.now().plusMonths(6));
		c4.setBenefitAmt(3000.00);
		
		CitizenPlan c5 = new CitizenPlan();
		c5.setCitizenName("cumminies");
		c5.setGeneder("male");
		c5.setPlanName("food");
		c5.setPlanStatus("Denied");
		c5.setDenialReason("Job Income");
		
		CitizenPlan c6 = new CitizenPlan();
		c6.setCitizenName("amisha");
		c6.setGeneder("female");
		c6.setPlanName("food");
		c6.setPlanStatus("Terminated");
		c6.setPlanStartDate(LocalDate.now().minusMonths(4));
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setBenefitAmt(3500.00);
		c6.setTerminateDate(LocalDate.now());
		c6.setTerminationRsn("Monthly salary");
		
		CitizenPlan c7 = new CitizenPlan();
		c7.setCitizenName("lakshmi");
		c7.setGeneder("male");
		c7.setPlanName("medical");
		c7.setPlanStatus("Approved");
		c7.setPlanStartDate(LocalDate.now());
		c7.setPlanEndDate(LocalDate.now().plusMonths(6));
		c7.setBenefitAmt(4800.00);
		
		CitizenPlan c8 = new CitizenPlan();
		c8.setCitizenName("satvil");
		c8.setGeneder("male");
		c8.setPlanName("medical");
		c8.setPlanStatus("Denied");
		c8.setDenialReason("High Property");
		
		CitizenPlan c9 = new CitizenPlan();
		c9.setCitizenName("rohash");
		c9.setGeneder("female");
		c9.setPlanName("medical");
		c9.setPlanStatus("Terminated");
		c9.setPlanStartDate(LocalDate.now().minusMonths(4));
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setBenefitAmt(6790.00);
		c9.setTerminateDate(LocalDate.now());
		c9.setTerminationRsn("Monthly Income");
		
		CitizenPlan c10 = new CitizenPlan();
		c10.setCitizenName("Vishnu");
		c10.setGeneder("female");
		c10.setPlanName("Employment");
		c10.setPlanStatus("Approved");
		c10.setPlanStartDate(LocalDate.now());
		c10.setPlanEndDate(LocalDate.now().plusMonths(6));
		c10.setBenefitAmt(2000.00);
		
		CitizenPlan c11 = new CitizenPlan();
		c11.setCitizenName("manish");
		c11.setGeneder("male");
		c11.setPlanName("cash");
		c11.setPlanStatus("Denied");
		c11.setDenialReason("Incorrect Details");
		
		CitizenPlan c12 = new CitizenPlan();
		c12.setCitizenName("donali");
		c12.setGeneder("female");
		c12.setPlanName("cash");
		c12.setPlanStatus("Terminated");
		c12.setPlanStartDate(LocalDate.now().minusMonths(4));
		c12.setPlanEndDate(LocalDate.now().plusMonths(6));
		c12.setBenefitAmt(3679.00);
		c12.setTerminateDate(LocalDate.now());
		c12.setTerminationRsn("high property");
		
		List<CitizenPlan> list = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12);
		repo.saveAll(list);
	}
	
}
