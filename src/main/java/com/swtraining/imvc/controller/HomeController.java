package com.swtraining.imvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.swtraining.imvc.service.*;
import com.swtraining.imvc.model.*;
import java.util.*;

@Controller
public class HomeController {
	
@Autowired
CountryService countryService;

@RequestMapping("/list_countrys")
public String listCountrys(Model model)
{
	List<Country> list=countryService.getCountryList();
	model.addAttribute("countrys",list);
	return "country";  // here its a view name, 
	
}
@RequestMapping("/")
public String welcome()
{
	return "index";
}
@RequestMapping("/delete/{id}")
public String deleteCountry(@PathVariable(name="id") int id)
{
	countryService.delete(id);
	return "redirect:/list_countrys";
}

@RequestMapping("/choose/{id}")
public ModelAndView showChooseCountryPage(@PathVariable(name = "id") int id)
{
	ModelAndView mav = new ModelAndView("choose_country");	
Country country = countryService.get(id);

mav.addObject("country",country);
return mav;

}

@RequestMapping(value="/save", method=RequestMethod.POST  )
public String saveCountry(@ModelAttribute("country") Country country)
{
	countryService.saveEmp(country);
	return "redirect:/list_countrys";
	
}

}
