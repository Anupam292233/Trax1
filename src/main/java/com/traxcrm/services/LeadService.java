package com.traxcrm.services;

import java.util.List;

import com.traxcrm.entities.Lead;

public interface LeadService {

public Lead getLeadById(long id);

public void saveLead(Lead lead);

public void deleteOneLead(long id);

public List<Lead> listAll();


	

}
