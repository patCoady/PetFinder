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
"$t"
})
public class Age {

@JsonProperty("$t")
private String $t;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("$t")
public String get$t() {
return $t;
}

@JsonProperty("$t")
public void set$t(String $t) {
this.$t = $t;
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