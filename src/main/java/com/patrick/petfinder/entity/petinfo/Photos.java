package com.patrick.petfinder.entity.petinfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;



@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"photo"
})
public class Photos {

@JsonProperty("photo")
private List<Photo> photo = new ArrayList<Photo>();
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("photo")
public List<Photo> getPhoto() {
return photo;
}

@JsonProperty("photo")
public void setPhoto(List<Photo> photo) {
this.photo = photo;
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