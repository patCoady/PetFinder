package com.patrick.petfinder.entity.petinfo;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;



@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"breed"
})
public class Breeds {

@JsonProperty("breed")
private Breed breed;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("breed")
public Breed getBreed() {
return breed;
}

@JsonProperty("breed")
public void setBreed(Breed breed) {
this.breed = breed;
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