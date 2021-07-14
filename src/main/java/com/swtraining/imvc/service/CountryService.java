package com.swtraining.imvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.swtraining.imvc.model.*;
import com.swtraining.imvc.repo.*;

@Service
public class CountryService {

	@Autowired
	CountryRepo countryRepo;
public List<Country> getCountryList()
{
	return countryRepo.findAll();
}
public void delete(int id)
{
	countryRepo.deleteById(id);
}
public Country get(int i)
{
	return countryRepo.findById(i).get();
}
public void saveEmp(Country e)
{
	countryRepo.save(e);
}
}
