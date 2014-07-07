package com.patrick.petfinder.entity.petinfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
@JsonPropertyOrder({
"pet"
})
public class Pets{
	@JsonProperty("pet")
   	private List<Pet> pet = new ArrayList<Pet>();
   	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
   	@JsonProperty("pet")
 	public List<Pet> getPet(){
		return this.pet;
	}
   	@JsonProperty("pet")
	public void setPet(List<Pet> pet){
		this.pet = pet;
	}
   	
	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {

		this.additionalProperties.put(name, value);
	}
}