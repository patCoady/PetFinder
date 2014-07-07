package com.patrick.petfinder;

import java.io.IOException;
import java.util.Locale;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.patrick.petfinder.entity.randompet.RandomPet;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		
		return "home";
	}
	
	@RequestMapping(value = "randomPet", method = RequestMethod.GET)
	public String randomPet(Model model, @RequestParam("randomPet") String randomPetInfo){
		ObjectMapper objectMapper = new ObjectMapper();
		RandomPet randomPet = null;
		
			try {
				randomPet = objectMapper.readValue(randomPetInfo, RandomPet.class);
			} catch (JsonParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			logger.info(randomPet.getPetfinder().getPetIds().getId().get$t());
			model.addAttribute("pet", randomPet);

		return "pet";
	}
	
}
