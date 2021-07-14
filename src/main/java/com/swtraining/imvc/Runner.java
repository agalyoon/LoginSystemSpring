/**
 * 
 */
package com.swtraining.imvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.swtraining.imvc.model.Country;
import com.swtraining.imvc.service.CountryService;

/*@SpringBootApplication
public class Runner implements CommandLineRunner {
	@Autowired
	private CountryService countryService;

	public static void main(String[] args) {
		SpringApplication.run(ImvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		int i = 1;
		Country country;
		while (i < 6) {
			country = new Country();
			country.setCountryName("First" + i);
			country.setCapitalName("Last" + i);
			country.setEmailId("Email" + i);

			countryService.addCountry(country);
			if (i == 3)
				countryService.deleteCountry(country.getId());
			i++;
		}
		System.out.println(countryService.getAllCountrys().toString());
	}
}
*/