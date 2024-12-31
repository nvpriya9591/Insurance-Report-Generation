package com.codingtips.request;

import java.time.LocalDate;

import lombok.Data;

// binding class or DTO OR command class

@Data
public class SearchRequest {
	
	private String planName;
	private String planStatus;
	private String gender;
	private LocalDate startDate;
	private LocalDate endDate;

}
