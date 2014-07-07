package com.patrick.petfinder.entity.randompet;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;

@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"id"
})
public class PetIds {

@JsonProperty("id")
private Id id;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("id")
public Id getId() {
return id;
}

@JsonProperty("id")
public void setId(Id id) {
this.id = id;
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