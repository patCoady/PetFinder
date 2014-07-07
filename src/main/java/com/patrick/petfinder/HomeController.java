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

import com.patrick.petfinder.entity.petinfo.PetInfo;
import com.patrick.petfinder.entity.petinfo.PetInfoList;
import com.patrick.petfinder.entity.petinfo.PetfinderList;

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
	//@RequestParam("petInfo") String petJSON
	@RequestMapping(value = "randomPet", method = RequestMethod.POST)
	public String randomPet(Model model, @RequestParam("petInfo") String petJSON){
		ObjectMapper objectMapper = new ObjectMapper();
		PetInfo petInfo = null;
			try {
				petInfo = objectMapper.readValue(petJSON, PetInfo.class);
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
			//logger.info(petInfo.getPetfinder().getPets().getPet().get(0).getAge().get$t());
			model.addAttribute("pet", petInfo);

		return "pet";
	}
	@RequestMapping(value = "petList", method = RequestMethod.POST)
	public String petList(Model model, @RequestParam("petListInfo") String petJSON){
		ObjectMapper objectMapper = new ObjectMapper();
		PetInfoList petInfoList = null;
			try {
				petInfoList = objectMapper.readValue(petJSON, PetInfoList.class);
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
			//logger.info(petInfoList.getPetfinder().getPets().getPet().get(0).getAge().get$t());
			model.addAttribute("pet", petInfoList);

		return "petList";
	}
	
}
