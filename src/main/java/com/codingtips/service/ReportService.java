package com.codingtips.service;

import java.util.List;

import com.codingtips.entity.CitizenPlan;
import com.codingtips.request.SearchRequest;

public interface ReportService {
	
	public List<String> getPlanNames();
	public List<String> getPlanStatuses();
	public List<CitizenPlan> search(SearchRequest requst);
	public boolean exportExcel();
	public boolean exportPdf();

}
