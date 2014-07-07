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
"photos"
})
public class Media {

@JsonProperty("photos")
private Photos photos;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("photos")
public Photos getPhotos() {
return photos;
}

@JsonProperty("photos")
public void setPhotos(Photos photos) {
this.photos = photos;
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